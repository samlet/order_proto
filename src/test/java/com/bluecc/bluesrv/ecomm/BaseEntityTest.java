package com.bluecc.bluesrv.ecomm;

import com.bluecc.bluesrv.ecomm.entity.PartyEntity;
import com.bluecc.bluesrv.ecomm.mapper.PartyMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BaseEntityTest {
    @Autowired
    PartyMapper partyMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<PartyEntity> partyEntities = partyMapper.selectList(null);
//        assertTrue(partyEntities.size()>1);
        partyEntities.forEach(System.out::println);
    }

    @Test
    void getLastUpdatedStamp() {
        PartyEntity ent=new PartyEntity()
                .setDescription(" a customer")
                .setPartyTypeId("group");
        partyMapper.insert(ent);
        System.out.format("%s - %s, %s\n", ent.getPartyId(),
                ent.getCreatedDate(),
                ent.getCreatedStamp());
    }
}