package com.bluecc.bluesrv.ecomm;

import com.bluecc.bluesrv.ecomm.entity.PartyEntity;
import com.bluecc.bluesrv.ecomm.entity.PersonEntity;
import com.bluecc.bluesrv.ecomm.mapper.PartyMapper;
import com.bluecc.bluesrv.ecomm.mapper.PersonMapper;
import com.bluecc.bluesrv.ecomm.service.IPartyService;
import com.bluecc.bluesrv.ecomm.service.IPersonService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import com.google.gson.Gson;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import static com.bluecc.bluesrv.common.Helper.GSON;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonEntityTest {

    @Autowired
    PartyMapper partyMapper;
    @Autowired
    IPartyService partyService;
    @Autowired
    IPersonService personService;
    @Autowired
    PersonMapper personMapper;
//    ObjectMapper objectMapper=new ObjectMapper();
    @Test
    void party_selectBatchIds() throws Exception {

        List<String> ids= Lists.newArrayList();
        for (int i = 0; i < 10; i++) {
            PartyEntity ent=new PartyEntity()
                    .setDescription(" a customer")
                    .setPartyTypeId("group");
            partyMapper.insert(ent);
            ids.add(ent.getPartyId());
            System.out.println(ent.getCreatedStamp());
        }
        List<PartyEntity> entities = partyMapper.selectBatchIds(ids);
        for (PartyEntity emp : entities) {
            System.out.println(GSON.toJson(emp));
//            System.out.println(objectMapper.writeValueAsString(emp));
            System.out.println(emp.getCreatedStamp());
        }
    }

    @Test
    void savePersonList(){
        Faker faker = new Faker(new Locale("zh-CN"));
        List<PersonEntity> ents=Lists.newArrayList();
        for (int i = 0; i < 10; i++) {
            ents.add(new PersonEntity()
                    .setLastName(faker.name().lastName())
                    .setFirstName(faker.name().firstName())
                    .setNickname(faker.funnyName().name())
            );
        }
        personService.saveBatch(ents);
        ents.forEach(p -> System.out.println(GSON.toJson(p)));
    }
}