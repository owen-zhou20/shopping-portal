package com.sv.mall.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sv.common.utils.PageUtils;
import com.sv.common.utils.Query;

import com.sv.mall.product.dao.CategoryDao;
import com.sv.mall.product.entity.CategoryEntity;
import com.sv.mall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

/*    @Autowired
    CategoryDao categoryDao;*/

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    // select all categories and sub categories as a tree data
    @Override
    public List<CategoryEntity> listWithTree() {
        //1.select all categories
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        //2.organised as a tree
        //2.1 find all 1 level menus
        List<CategoryEntity> level1Menus = categoryEntities.stream().filter((categoryEntity) -> {
            return categoryEntity.getParentCid() == 0;
        }).map((menu)->{
            menu.setChildren(getChildrens(menu,categoryEntities));
            return menu;
        }).sorted((menu1,menu2)->{
            return ((menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort()));
        }).collect(Collectors.toList());

        return level1Menus;
    }

    //use recursion to find all children menus for every root menu
    private List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> all){

        List<CategoryEntity> children = all.stream().filter((categoryEntity)->{
            return categoryEntity.getParentCid().equals(root.getCatId());
        }).map((categoryEntity)->{
            //1, find all children menus
            categoryEntity.setChildren(getChildrens(categoryEntity,all));
            return categoryEntity;
        }).sorted((menu1,menu2)->{
            //2. sort menus
            return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());

        return children;
    }


    @Override
    public void removeMenuByIds(List<Long> asList) {
        //TODO  1. check these menus aren't called by other method before delete

        baseMapper.deleteBatchIds(asList);
    }

}