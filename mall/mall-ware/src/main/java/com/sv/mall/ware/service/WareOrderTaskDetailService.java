package com.sv.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sv.common.utils.PageUtils;
import com.sv.mall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author Owen
 * @email owen.zhou20@gmail.com
 * @date 2022-05-31 20:41:02
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

