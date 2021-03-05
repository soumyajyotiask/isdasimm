package com.soumyajc.isdasimm.model;

import java.time.LocalDate;
import java.util.Optional;

public class CrifRecord {

    private RiskClass riskClass;
    private String qualifier;
    private String bucket;
    private String label1;
    private String label2;
    private double usdAmount;
    private Silo silo;
    private Optional<String> portfolioId;
    private Optional<String> tradeId;
    private Optional<LocalDate> tradeEndDate;

    public CrifRecord(RiskClass riskClass, String qualifier, String bucket, String label1, String label2, double usdAmount, Silo silo,
                      String portfolioId, String tradeId, LocalDate tradeEndDate) {
        this.riskClass = riskClass;
        this.qualifier = qualifier;
        this.bucket = bucket;
        this.label1 = label1;
        this.label2 = label2;
        this.usdAmount = usdAmount;
        this.silo = silo;
        this.portfolioId = Optional.ofNullable(portfolioId);
        this.tradeId = Optional.ofNullable(tradeId);
        this.tradeEndDate = Optional.ofNullable(tradeEndDate);
    }

    public RiskClass getRiskClass() {
        return riskClass;
    }

    public void setRiskClass(RiskClass riskClass) {
        this.riskClass = riskClass;
    }

    public String getQualifier() {
        return qualifier;
    }

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getLabel1() {
        return label1;
    }

    public void setLabel1(String label1) {
        this.label1 = label1;
    }

    public String getLabel2() {
        return label2;
    }

    public void setLabel2(String label2) {
        this.label2 = label2;
    }

    public double getUsdAmount() {
        return usdAmount;
    }

    public void setUsdAmount(double usdAmount) {
        this.usdAmount = usdAmount;
    }

    public Silo getSilo() {
        return silo;
    }

    public void setSilo(Silo silo) {
        this.silo = silo;
    }

    public Optional<String> getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(Optional<String> portfolioId) {
        this.portfolioId = portfolioId;
    }

    public Optional<String> getTradeId() {
        return tradeId;
    }

    public void setTradeId(Optional<String> tradeId) {
        this.tradeId = tradeId;
    }

    public Optional<LocalDate> getTradeEndDate() {
        return tradeEndDate;
    }

    public void setTradeEndDate(Optional<LocalDate> tradeEndDate) {
        this.tradeEndDate = tradeEndDate;
    }
}
