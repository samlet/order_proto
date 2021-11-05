package com.bluecc.bluesrv.ofbiz.service.impl;

import com.bluecc.bluesrv.ofbiz.entity.Quote;
import com.bluecc.bluesrv.ofbiz.mapper.QuoteMapper;
import com.bluecc.bluesrv.ofbiz.service.IQuoteService;
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
public class QuoteServiceImpl extends ServiceImpl<QuoteMapper, Quote> implements IQuoteService {

}
