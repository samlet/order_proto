package com.bluecc.bluesrv.ecomm.party;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

import java.util.function.Function;

@Configuration
@Slf4j
public class ToolFn {
    @Bean
    public Function<Flux<String>, Flux<String>> lowercase() {
        return flux -> flux.map(value -> value.toLowerCase());
    }
}
