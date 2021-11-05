package com.bluecc.bluesrv.ofbiz.service.impl;

import com.bluecc.bluesrv.ofbiz.entity.Content;
import com.bluecc.bluesrv.ofbiz.mapper.ContentMapper;
import com.bluecc.bluesrv.ofbiz.service.IContentService;
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
public class ContentServiceImpl extends ServiceImpl<ContentMapper, Content> implements IContentService {

}
