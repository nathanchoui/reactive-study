package com.github.nathan.reactive.study.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * @author nathan.z
 * @date 2020/6/3.
 */
@Component
public class HelloHandler {

    public Mono<ServerResponse> hello(ServerRequest serverRequest) {
        return  ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromObject("hello world!"));
    }
}
