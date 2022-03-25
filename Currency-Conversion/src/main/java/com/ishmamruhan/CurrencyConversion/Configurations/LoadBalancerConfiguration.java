package com.ishmamruhan.CurrencyConversion.Configurations;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadBalancerConfiguration {

    @Bean
    @LoadBalanced
    public ServiceInstanceListSupplier discoveryPublicServiceInstanceListSupplier(ConfigurableApplicationContext context) {

        System.out.println("----------------------------------------------------------");
        System.out.println("------------------ Configuring Load Balancer -------------");
        System.out.println("----------------------------------------------------------");

        return ServiceInstanceListSupplier
                .builder()
                .withBlockingDiscoveryClient()
                .build(context);
    }

}
