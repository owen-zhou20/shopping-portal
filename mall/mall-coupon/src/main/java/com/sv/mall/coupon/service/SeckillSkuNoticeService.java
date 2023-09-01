package com.sv.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sv.common.utils.PageUtils;
import com.sv.mall.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author Owen
 * @email owen.zhou20@gmail.com
 * @date 2022-05-31 12:00:52
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

