package com.bluecc.bluesrv.ofbiz.service.impl;

import com.bluecc.bluesrv.ofbiz.entity.Person;
import com.bluecc.bluesrv.ofbiz.mapper.PersonMapper;
import com.bluecc.bluesrv.ofbiz.service.IPersonService;
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
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

}
