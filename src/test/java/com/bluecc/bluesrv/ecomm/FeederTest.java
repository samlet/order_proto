package com.bluecc.bluesrv.ecomm;

import com.bluecc.bluesrv.ecomm.service.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;

import static com.bluecc.bluesrv.common.Helper.GSON;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FeederTest {
    @Autowired
    Feeder feeder;
    @Autowired
    IPersonService personService;
    @Autowired
    IPostalAddressService postalAddressService;
    @Autowired
    IPartyService partyService;
    @Autowired
    IPartyContactMechService partyContactMechService;
    @Autowired
    IContactMechService contactMechService;

    @Test
    void genPostalAddress() {
        feeder.genPostalAddress(5).forEach(p -> System.out.println(GSON.toJson(p)));
    }

    @Test
    void savePostalAddress() {
        List<Feeder.Contract> rs = feeder.genPostalAddress(5);
        rs.forEach(p -> {
            System.out.println(GSON.toJson(p));
        });

        postalAddressService.saveBatch(rs.stream().map(p -> p.postalAddress).collect(Collectors.toList()));
        contactMechService.saveBatch(rs.stream().map(p -> p.contactMech).collect(Collectors.toList()));
        partyContactMechService.saveBatch(rs.stream().map(p -> p.partyContactMech).collect(Collectors.toList()));
    }
}