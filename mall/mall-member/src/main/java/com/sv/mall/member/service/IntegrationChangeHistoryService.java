package com.sv.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sv.common.utils.PageUtils;
import com.sv.mall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author Owen
 * @email owen.zhou20@gmail.com
 * @date 2022-05-31 12:28:35
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

