package com.bluecc.bluesrv.common;

import org.junit.jupiter.api.Test;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;

public class FluxTest {
    @Test
    void simple(){
        // 在我们订阅之前，数据不会开始流动。请注意，我们还添加了一些日志记录
        List<Integer> elements = new ArrayList<>();

        Flux.just(1, 2, 3, 4)
                .log()
                .subscribe(elements::add);

        assertThat(elements).containsExactly(1, 2, 3, 4);
    }

    @Test
    void list(){
        List<Integer> collected = Stream.of(1, 2, 3, 4)
                .collect(toList());
        System.out.println(collected);
    }

    @Test
    void backpressure(){
        List<Integer> elements = new ArrayList<>();

        // 示例中，订阅者告诉生产者一次推送每个元素。这最终可能会使订阅者不堪重负，消耗其所有资源。
        // 背压是指下游可以告诉上游发送较少的数据以防止其不堪重负。
        // 我们可以修改我们的Subscriber实现来应用背压。让我们使用request()告诉上游一次只发送两个元素：
        Flux.just(1, 2, 3, 4)
                .log()
                .subscribe(new Subscriber<Integer>() {
                    private Subscription s;
                    int onNextAmount;

                    @Override
                    public void onSubscribe(Subscription s) {
                        this.s = s;
                        s.request(2);
                    }

                    @Override
                    public void onNext(Integer integer) {
                        elements.add(integer);
                        onNextAmount++;
                        if (onNextAmount % 2 == 0) {
                            s.request(2);
                        }
                    }

                    @Override
                    public void onError(Throwable t) {}

                    @Override
                    public void onComplete() {}
                });

        System.out.println(elements);
    }

    @Test
    void map(){
        List<Integer> elements = new ArrayList<>();
        Flux.just(1, 2, 3, 4)
                .log()
                .map(i -> i * 2)
                .subscribe(elements::add);
    }

    @Test
    void zip(){
        List<String> elements = new ArrayList<>();
        // 结合两个流
        Flux.just(1, 2, 3, 4)
                .log()
                .map(i -> i * 2)
                .zipWith(Flux.range(0, Integer.MAX_VALUE),
                        (one, two) -> String.format("First Flux: %d, Second Flux: %d", one, two))
                .subscribe(elements::add);

        assertThat(elements).containsExactly(
                "First Flux: 2, Second Flux: 0",
                "First Flux: 4, Second Flux: 1",
                "First Flux: 6, Second Flux: 2",
                "First Flux: 8, Second Flux: 3");

    }
}

/*
https://www.baeldung.com/reactor-core
 */