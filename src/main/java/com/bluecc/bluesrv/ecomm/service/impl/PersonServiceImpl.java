package com.bluecc.bluesrv.ecomm.service.impl;

import com.bluecc.bluesrv.ecomm.entity.PersonEntity;
import com.bluecc.bluesrv.ecomm.mapper.PersonMapper;
import com.bluecc.bluesrv.ecomm.service.IPersonService;
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
public class PersonServiceImpl extends ServiceImpl<PersonMapper, PersonEntity> implements IPersonService {

}
