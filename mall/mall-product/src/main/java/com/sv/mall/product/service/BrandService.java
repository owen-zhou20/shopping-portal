package com.sv.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sv.common.utils.PageUtils;
import com.sv.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author Owen
 * @email owen.zhou20@gmail.com
 * @date 2022-05-30 15:29:53
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

