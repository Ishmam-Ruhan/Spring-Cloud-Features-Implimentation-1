package com.ishmamruhan.CurrencyConversion.Controllers;

import com.ishmamruhan.CurrencyConversion.Communications.CurrencyExchangeServiceProxy;
import com.ishmamruhan.CurrencyConversion.Models.CurrencyProperty;
import com.ishmamruhan.CurrencyConversion.Models.Mapped_ExchangeServiceObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@RestController
public class MainController {

    @Autowired
    private CurrencyExchangeServiceProxy currencyExchangeServiceProxy;

    public static final Logger LOGGER = Logger.getLogger("MainController");

    @GetMapping("/currency-conversion/From/{from}/to/{to}/currency={currency}")
    public CurrencyProperty converter(@PathVariable String from, @PathVariable String to, @PathVariable long currency){
        
        //http://localhost:8002/currency-exchange/from/USD/to/BDT

        Map<String,String> params = new HashMap<>();
        params.put("from",from);
        params.put("to",to);

        ResponseEntity<Mapped_ExchangeServiceObject> response = new RestTemplate()
                .getForEntity("http://localhost:8002/currency-exchange/from/{from}/to/{to}", Mapped_ExchangeServiceObject.class,params);

        Mapped_ExchangeServiceObject res = response.getBody();
        LOGGER.info("From Currency Conversion Local Call");

        return new CurrencyProperty(res.getId(),from,to,res.getMarketValue(), currency*res.getMarketValue(),res.getPort());
    }

    @GetMapping("/currency-conversion-feign/From/{from}/to/{to}/currency={currency}")
    public CurrencyProperty converterFeign(@PathVariable String from, @PathVariable String to, @PathVariable long currency){

        Mapped_ExchangeServiceObject res = currencyExchangeServiceProxy.retriveData(from,to);

        LOGGER.info("From Currency Conversion Feign Call");

        return new CurrencyProperty(res.getId(),from,to,res.getMarketValue(), currency*res.getMarketValue(), res.getPort());
    }

}
