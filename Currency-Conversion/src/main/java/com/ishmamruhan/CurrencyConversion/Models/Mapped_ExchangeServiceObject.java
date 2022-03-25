package com.ishmamruhan.CurrencyConversion.Models;

public class Mapped_ExchangeServiceObject {
    private int id;
    private String fromCurrency;
    private String toCurrency;
    private double marketValue;
    private String port;

    public Mapped_ExchangeServiceObject() {
    }

    public Mapped_ExchangeServiceObject(int id, String fromCurrency, String toCurrency, double marketValue, String port) {
        this.id = id;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.marketValue = marketValue;
        this.port = port;
    }

    public int getId() {
        return id;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
