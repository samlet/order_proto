package com.bluecc.bluesrv.ecomm.feed;

import com.bluecc.bluesrv.ecomm.entity.PartyEntity;
import com.bluecc.bluesrv.ecomm.entity.PartyRoleEntity;
import com.bluecc.bluesrv.ecomm.entity.PersonEntity;
import com.bluecc.bluesrv.ecomm.entity.UserLoginEntity;
import com.google.common.collect.Lists;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PartyFeeder extends FeederBase {
    List<String> partyTypes = Lists.newArrayList("PERSON", "PARTY_GROUP");
    List<String> roleTypes = Lists.newArrayList("BUYER", "CASHIER", "SALES_REP");

    @Accessors(chain = true)
    @Data
    public static class User {
        PartyEntity partyEntity;
        PersonEntity personEntity;
        PartyRoleEntity partyRoleEntity;
        UserLoginEntity userLoginEntity;

    }

    User single() {
        String partyId = randId();
        String userLoginId=randId();
        return new User()
                .setPartyEntity(
                        new PartyEntity().setPartyId(partyId)
                                .setPartyTypeId(choose(partyTypes)))
                .setPersonEntity(
                        new PersonEntity().setPartyId(partyId)
                                .setFirstName(faker.name().firstName())
                                .setLastName(faker.name().lastName()))
                .setPartyRoleEntity(
                        new PartyRoleEntity().setPartyId(partyId)
                                .setRoleTypeId(choose(roleTypes)))
                .setUserLoginEntity(
                        new UserLoginEntity().setPartyId(partyId)
                                .setUserLoginId(userLoginId));
    }
}

