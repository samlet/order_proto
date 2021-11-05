package com.bluecc.bluesrv.ecomm.web;

import com.bluecc.bluesrv.common.Helper;
import com.bluecc.bluesrv.ecomm.entity.PartyEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import static com.bluecc.bluesrv.common.Helper.pretty;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WebFnTest {
    // private HttpHeaders headers;

    @LocalServerPort
    private int port;
    //
    // @BeforeEach
    // public void before() {
    //     this.headers = new HttpHeaders();
    //     this.headers.setContentType(MediaType.APPLICATION_JSON);
    // }

    @Test
    public void words() throws InterruptedException {
        WebClient client = getWebClient();
        Mono<String> employeeMono = client.post()
                .uri("/lowercase")
                .bodyValue("Hello World")
                .retrieve()
                .bodyToMono(String.class);

        employeeMono.subscribe(System.out::println);
        System.out.println("done.");
        Thread.sleep(2000);
    }

    @Test
    public void retrievePerson() throws InterruptedException {
        // WebClient client = WebClient.create("http://localhost:8088");
        WebClient client = getWebClient();
        Mono<PartyEntity> employeeMono = client.post()
                .uri("/retrievePerson")
                .bodyValue("1456573859594547202")
                .retrieve()
                .bodyToMono(PartyEntity.class);

        employeeMono.subscribe(Helper::pretty);
        System.out.println("done.");
        Thread.sleep(2000);
    }

    private WebClient getWebClient() {
        return WebClient.create("http://localhost:" + port);
    }
}
