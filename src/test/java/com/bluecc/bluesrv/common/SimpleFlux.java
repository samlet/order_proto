package com.bluecc.bluesrv.common;

import reactor.core.publisher.ConnectableFlux;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

import java.util.ArrayList;
import java.util.List;

import static java.time.Duration.ofSeconds;

public class SimpleFlux {
    public static void main(String[] args) throws InterruptedException {
        // publisher();
        parallel();
    }

    private static void parallel() throws InterruptedException {
        // 可以控制我们的代码在哪个线程上运行。所述调度程序接口提供围绕异步代码的抽象，
        // 为此提供用于我们许多实现。让我们尝试订阅一个不同的线程到 main
        List<Integer> elements = new ArrayList<>();
        Flux.just(1, 2, 3, 4)
                .log()
                .map(i -> i * 2)
                .subscribeOn(Schedulers.parallel())
                .subscribe(elements::add);

        Thread.sleep(2000);
        System.out.println(elements);
    }

    private static void publisher() {
        ConnectableFlux<Object> publish = Flux.create(fluxSink -> {
                    while (true) {
                        fluxSink.next(System.currentTimeMillis());
                    }
                })
                // 引入了一个间隔为两秒的sample()方法。现在值只会每两秒推送给我们的订阅者，
                // 这意味着控制台将不那么忙碌。
                // 当然，有多种策略可以减少向下游发送的数据量，例如窗口化和缓冲
                .sample(ofSeconds(2))
                .publish();
        publish.subscribe(System.out::println);
        // 直到我们调用连接（），该流量将开始
        publish.connect();
    }
}

/*
https://www.baeldung.com/reactor-core
 */