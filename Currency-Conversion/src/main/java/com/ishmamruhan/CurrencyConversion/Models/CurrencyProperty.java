package com.ishmamruhan.CurrencyConversion.Models;

public class CurrencyProperty {
    private int id;
    private String from;
    private String to;
    private double multiplication_value;
    private double converted_amount;
    private String Receive_from_Port;

    public CurrencyProperty() {
    }

    public CurrencyProperty(int id, String from, String to, double multiplication_value, double converted_amount, String receive_from_Port) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.multiplication_value = multiplication_value;
        this.converted_amount = converted_amount;
        Receive_from_Port = receive_from_Port;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public double getMultiplication_value() {
        return multiplication_value;
    }

    public void setMultiplication_value(double multiplication_value) {
        this.multiplication_value = multiplication_value;
    }

    public double getConverted_amount() {
        return converted_amount;
    }

    public void setConverted_amount(double converted_amount) {
        this.converted_amount = converted_amount;
    }

    public String getReceive_from_Port() {
        return Receive_from_Port;
    }

    public void setReceive_from_Port(String receive_from_Port) {
        Receive_from_Port = receive_from_Port;
    }
}
