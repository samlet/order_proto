package com.bluecc.bluesrv.ofbiz.service.impl;

import com.bluecc.bluesrv.ofbiz.entity.Invoice;
import com.bluecc.bluesrv.ofbiz.mapper.InvoiceMapper;
import com.bluecc.bluesrv.ofbiz.service.IInvoiceService;
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
public class InvoiceServiceImpl extends ServiceImpl<InvoiceMapper, Invoice> implements IInvoiceService {

}
