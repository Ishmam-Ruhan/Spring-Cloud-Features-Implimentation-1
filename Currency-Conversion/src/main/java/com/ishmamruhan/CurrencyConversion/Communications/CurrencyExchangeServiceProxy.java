package com.ishmamruhan.CurrencyConversion.Communications;

import com.ishmamruhan.CurrencyConversion.Configurations.LoadBalancerConfiguration;
import com.ishmamruhan.CurrencyConversion.Models.Mapped_ExchangeServiceObject;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchange")
@LoadBalancerClient(name = "currency-exchange", configuration = LoadBalancerConfiguration.class)
public interface CurrencyExchangeServiceProxy {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public Mapped_ExchangeServiceObject retriveData(@PathVariable String from, @PathVariable String to);
}
