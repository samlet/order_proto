package com.bluecc.bluesrv.ecomm.feed;

import com.bluecc.bluesrv.ecomm.entity.PartyEntity;
import com.bluecc.bluesrv.ecomm.entity.PersonEntity;
import com.bluecc.bluesrv.ecomm.entity.ProductEntity;
import com.bluecc.bluesrv.ecomm.service.IPartyRoleService;
import com.bluecc.bluesrv.ecomm.service.IPartyService;
import com.bluecc.bluesrv.ecomm.service.IPersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.function.Function;

import static com.bluecc.bluesrv.common.Helper.GSON;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class PartyFeederTest {
    @Autowired
    PartyFeeder partyFeeder;

    @Autowired
    IPartyService partyService;
    @Autowired
    IPersonService personService;
    @Autowired
    IPartyRoleService partyRoleService;

    @Test
    void single() {
        for (int i = 0; i < 5; i++) {
            PartyFeeder.User entity = partyFeeder.single();
            System.out.println(GSON.toJson(entity));
        }
    }

    Function<PartyFeeder.User, String> storeUser(){
        return o -> {
            PartyEntity partyEnt=o.getPartyEntity();
            partyService.save(partyEnt);
            personService.save(o.getPersonEntity());
            partyRoleService.save(o.getPartyRoleEntity());
            return partyEnt.getPartyId();
        };
    }

    @Test
    void testStoreUser(){
        for (int i = 0; i < 10; i++) {
            String partyId = storeUser().apply(partyFeeder.single());
            System.out.println(partyId);
        }
    }

    Function<String, PersonEntity> retrievePerson(){
        return id -> personService.getById(id);
    }
}