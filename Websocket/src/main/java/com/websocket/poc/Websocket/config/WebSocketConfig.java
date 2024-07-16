package com.websocket.poc.Websocket.config;

import com.websocket.poc.Websocket.handler.CoordinateHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(coordinateHandler(), "/coordinates")
                .setAllowedOrigins("*");
    }

    @Bean
    public CoordinateHandler coordinateHandler() {
        return new CoordinateHandler();
    }
}