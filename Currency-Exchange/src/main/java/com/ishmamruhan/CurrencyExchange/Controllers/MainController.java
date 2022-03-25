package com.ishmamruhan.CurrencyExchange.Controllers;

import com.ishmamruhan.CurrencyExchange.DAO.ExchangePropertyDao;
import com.ishmamruhan.CurrencyExchange.Models.ExchangeProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class MainController {
    @Autowired
    private ExchangePropertyDao exchangePropertyDao;

    public static final Logger LOGGER = Logger.getLogger("MainController");

    @Autowired
    private Environment environment;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeProperty getConversion(@PathVariable String from, @PathVariable String to){

        ExchangeProperty exchangeProperty = exchangePropertyDao.getByFromCurrencyAndToCurrency(from,to);

        exchangeProperty.setPort(environment.getProperty("local.server.port"));

        LOGGER.info("From Currency Exchange!!");

        return exchangeProperty;
    }
}
