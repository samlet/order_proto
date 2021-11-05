package com.bluecc.bluesrv.ecomm.web;

import com.bluecc.bluesrv.ecomm.entity.PartyEntity;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import static com.bluecc.bluesrv.common.Helper.pretty;

public class SimpleWeb {
    public static void main(String[] args) throws InterruptedException {
        WebClient client = WebClient.create("http://localhost:8088");
        Mono<PartyEntity> employeeMono = client.post()
                .uri("/retrievePerson")
                .bodyValue("1456573859594547202")
                .retrieve()
                .bodyToMono(PartyEntity.class);

        employeeMono.subscribe(e -> pretty(e));
        System.out.println("done.");
        Thread.sleep(2000);
    }
}
