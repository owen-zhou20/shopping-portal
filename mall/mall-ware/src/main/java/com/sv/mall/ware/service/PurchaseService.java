package com.sv.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sv.common.utils.PageUtils;
import com.sv.mall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author Owen
 * @email owen.zhou20@gmail.com
 * @date 2022-05-31 20:41:02
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

