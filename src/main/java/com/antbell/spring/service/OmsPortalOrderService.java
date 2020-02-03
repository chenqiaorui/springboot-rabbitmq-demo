package com.antbell.spring.service;

import org.springframework.transaction.annotation.Transactional;

import com.antbell.spring.common.api.CommonResult;
import com.antbell.spring.model.OrderParam;

public interface OmsPortalOrderService {

    /**
     * 根据提交信息生成订单
     */
    @Transactional
    CommonResult generateOrder(OrderParam orderParam);

    /**
     * 取消单个超时订单
     */
    @Transactional
    void cancelOrder(Long orderId);
}
