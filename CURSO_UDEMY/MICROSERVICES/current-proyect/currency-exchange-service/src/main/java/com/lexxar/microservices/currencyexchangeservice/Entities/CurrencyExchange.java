package com.lexxar.microservices.currencyexchangeservice.Entities;

import java.math.BigDecimal;

public class CurrencyExchange {
    private Long id;
    private String from;
    private String to;
    private BigDecimal conersionMultiple;

    public CurrencyExchange() {
    }

    public CurrencyExchange(Long id, String from, String to, BigDecimal conersionMultiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conersionMultiple = conersionMultiple;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public BigDecimal getConersionMultiple() {
        return conersionMultiple;
    }

    public void setConersionMultiple(BigDecimal conersionMultiple) {
        this.conersionMultiple = conersionMultiple;
    }
}
