package com.soumyajc.isdasimm.model;

public class ImResponse {
    private String portfolioId;
    private double totalIm;

    public ImResponse(String portfolioId, double totalIm) {
        this.portfolioId = portfolioId;
        this.totalIm = totalIm;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public double getTotalIm() {
        return totalIm;
    }

    public void setTotalIm(double totalIm) {
        this.totalIm = totalIm;
    }
}
