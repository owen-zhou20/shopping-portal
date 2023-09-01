package com.sv.mall.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sv.mall.product.entity.CategoryEntity;
import com.sv.mall.product.service.CategoryService;
import com.sv.common.utils.PageUtils;
import com.sv.common.utils.R;



/**
 * 商品三级分类
 *
 * @author Owen
 * @email owen.zhou20@gmail.com
 * @date 2022-05-30 17:41:49
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * select all categories and sub categories as a tree data
     */
    @RequestMapping("/list/tree")
   // @RequiresPermissions("product:category:list")
    public R list(){
        //PageUtils page = categoryService.queryPage(params);
        List<CategoryEntity> entities= categoryService.listWithTree();
        return R.ok().put("data", entities);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
  //  @RequiresPermissions("product:category:info")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("data", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
  //  @RequiresPermissions("product:category:save")
    public R save(@RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("product:category:update")
    public R update(@RequestBody CategoryEntity category){
		categoryService.updateById(category);
        return R.ok();
    }

    /**
     * 批量修改
     */
    @RequestMapping("/update/sort")
    //  @RequiresPermissions("product:category:update")
    public R updateSort(@RequestBody CategoryEntity[] categories){
        categoryService.updateBatchById(Arrays.asList(categories));
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
  //  @RequiresPermissions("product:category:delete")
    public R delete(@RequestBody Long[] catIds){
		//categoryService.removeByIds(Arrays.asList(catIds));
        //1. check these menus aren't called by other method before delete
        categoryService.removeMenuByIds(Arrays.asList(catIds));
        return R.ok();
    }

}
