package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PortfolioSecurity {

    @Id
    @GeneratedValue
    private long portfolioSecurityId;

    @Column(nullable = false)
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "portfolioId")
    private Portfolio portfolio;

    @ManyToOne
    @JoinColumn(name = "securityId")
    private Security security;

    protected PortfolioSecurity() {

    }

    public PortfolioSecurity(int quantity, Portfolio portfolio, Security security) {
        this.quantity = quantity;
        this.portfolio = portfolio;
        this.security = security;
    }

    public Long getPortfolioSecurityId() {
        return portfolioSecurityId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }
}