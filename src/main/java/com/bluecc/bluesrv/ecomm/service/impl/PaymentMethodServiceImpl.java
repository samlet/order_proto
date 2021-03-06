package com.bluecc.bluesrv.ecomm.service.impl;

import com.bluecc.bluesrv.ecomm.entity.PaymentMethodEntity;
import com.bluecc.bluesrv.ecomm.mapper.PaymentMethodMapper;
import com.bluecc.bluesrv.ecomm.service.IPaymentMethodService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author samlet
 * @since 2021-11-06
 */
@Service
public class PaymentMethodServiceImpl extends ServiceImpl<PaymentMethodMapper, PaymentMethodEntity> implements IPaymentMethodService {

}
