package net.houdaifa.gatwaayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatwaayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatwaayServiceApplication.class, args);
    }

    @Bean
    DiscoveryClientRouteDefinitionLocator routes(ReactiveDiscoveryClient rdc, DiscoveryLocatorProperties dp){
        return new DiscoveryClientRouteDefinitionLocator(rdc, dp);
    }

}
