package com.sv.mall.member.dao;

import com.sv.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Owen
 * @email owen.zhou20@gmail.com
 * @date 2022-05-31 12:28:35
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
