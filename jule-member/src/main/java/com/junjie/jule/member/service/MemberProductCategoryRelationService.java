package com.junjie.jule.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.junjie.common.utils.PageUtils;
import com.junjie.jule.member.entity.MemberProductCategoryRelationEntity;

import java.util.Map;

/**
 * 会员与产品分类关系表（用户喜欢的分类）
 *
 * @author wangjunjie
 * @email wang39525@gmail.com
 * @date 2021-12-09 22:55:41
 */
public interface MemberProductCategoryRelationService extends IService<MemberProductCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

