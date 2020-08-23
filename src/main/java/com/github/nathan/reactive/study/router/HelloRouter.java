package com.github.nathan.reactive.study.router;

import com.github.nathan.reactive.study.handler.HelloHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * @author nathan.z
 * @date 2020/6/3.
 */
@Configuration
public class HelloRouter {

    @Bean
    public RouterFunction<ServerResponse> routerHello(HelloHandler helloHandler) {
        return RouterFunctions.route(RequestPredicates.GET("/")
                .and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), helloHandler::hello);
    }
}
