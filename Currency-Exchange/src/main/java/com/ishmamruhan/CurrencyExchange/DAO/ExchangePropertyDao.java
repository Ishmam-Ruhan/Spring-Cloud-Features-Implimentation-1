package com.ishmamruhan.CurrencyExchange.DAO;

import com.ishmamruhan.CurrencyExchange.Models.ExchangeProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangePropertyDao extends JpaRepository<ExchangeProperty, Integer> {
    ExchangeProperty getByFromCurrencyAndToCurrency(String from, String to);
}
