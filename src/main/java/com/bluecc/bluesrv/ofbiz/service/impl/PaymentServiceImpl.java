package com.bluecc.bluesrv.ofbiz.service.impl;

import com.bluecc.bluesrv.ofbiz.entity.Payment;
import com.bluecc.bluesrv.ofbiz.mapper.PaymentMapper;
import com.bluecc.bluesrv.ofbiz.service.IPaymentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author samlet
 * @since 2021-11-05
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements IPaymentService {

}
