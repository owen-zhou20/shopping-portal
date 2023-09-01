package com.sv.mall.product.dao;

import com.sv.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Owen
 * @email owen.zhou20@gmail.com
 * @date 2022-05-30 15:29:53
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
