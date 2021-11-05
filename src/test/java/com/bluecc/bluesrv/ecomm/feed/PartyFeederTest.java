package com.bluecc.bluesrv.ecomm.feed;

import com.bluecc.bluesrv.ecomm.entity.ProductEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.bluecc.bluesrv.common.Helper.GSON;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class PartyFeederTest {
    @Autowired
    PartyFeeder partyFeeder;

    @Test
    void single() {
        for (int i = 0; i < 5; i++) {
            PartyFeeder.User entity = partyFeeder.single();
            System.out.println(GSON.toJson(entity));
        }
    }
}