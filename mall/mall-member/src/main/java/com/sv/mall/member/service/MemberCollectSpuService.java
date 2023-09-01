package com.sv.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sv.common.utils.PageUtils;
import com.sv.mall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author Owen
 * @email owen.zhou20@gmail.com
 * @date 2022-05-31 12:28:35
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

