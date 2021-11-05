package com.bluecc.bluesrv.ecomm.party;

import com.bluecc.bluesrv.ecomm.entity.PersonEntity;
import com.bluecc.bluesrv.ecomm.service.IPartyRoleService;
import com.bluecc.bluesrv.ecomm.service.IPartyService;
import com.bluecc.bluesrv.ecomm.service.IPersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.function.Function;

@Configuration
@Slf4j
public class PartyDelegator {
    @Autowired
    IPartyService partyService;
    @Autowired
    IPersonService personService;
    @Autowired
    IPartyRoleService partyRoleService;

    @Bean
    public Function<String, Mono<PersonEntity>> retrievePerson(){
        return id -> Mono.justOrEmpty(personService.getById(id));
    }
}

