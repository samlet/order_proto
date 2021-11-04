package com.bluecc.bluesrv.ecomm;

import com.baomidou.mybatisplus.core.incrementer.DefaultIdentifierGenerator;
import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import com.bluecc.bluesrv.ecomm.entity.ContactMechEntity;
import com.bluecc.bluesrv.ecomm.entity.PartyContactMechEntity;
import com.bluecc.bluesrv.ecomm.entity.PostalAddressEntity;
import com.bluecc.bluesrv.ecomm.service.IPersonService;
import com.bluecc.bluesrv.ecomm.service.IPostalAddressService;
import com.github.javafaker.Address;
import com.github.javafaker.Faker;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Component
public class Feeder {
    @Autowired
    IPersonService personService;
    @Autowired
    IPostalAddressService postalAddressService;
    Faker faker;

    DefaultIdentifierGenerator identifierGenerator = new DefaultIdentifierGenerator();

    @Data
    @Accessors(chain = true)
    public static class Contract {
        PostalAddressEntity postalAddress;
        ContactMechEntity contactMech;
        PartyContactMechEntity partyContactMech;
    }

    public Feeder() {
        faker = new Faker(new Locale("zh-CN"));
    }

    public List<Contract> genPostalAddress(int total) {

        List<Contract> rs = new ArrayList<>();
        for (int i = 0; i < total; i++) {
            String mechId = identifierGenerator.nextId(null).toString();
            String partyId = identifierGenerator.nextId(null).toString();
            String partyMechId = identifierGenerator.nextId(null).toString();
            Address addr = faker.address();

            rs.add(new Contract()
                    .setPostalAddress(new PostalAddressEntity()
                            .setContactMechId(mechId)
                            .setAddress1(addr.fullAddress())
                            .setAddress2(addr.secondaryAddress())
                            .setCity(addr.city())
                            .setPostalCode(addr.zipCode()))
                    .setContactMech(new ContactMechEntity()
                            .setContactMechId(mechId).setContactMechTypeId("POSTAL_ADDRESS"))
                    .setPartyContactMech(new PartyContactMechEntity()
                            .setId(partyMechId)
                            .setPartyId(partyId)
                            .setContactMechId(mechId)
                            .setFromDate(LocalDateTime.now()))
            );
        }
        return rs;
    }
}
