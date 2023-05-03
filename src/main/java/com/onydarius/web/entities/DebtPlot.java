package com.onydarius.web.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "debt_plot")
public class DebtPlot {

    @Id
    @Column(name = "debt_plot_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "plot_id")
    private Plot plot;

    @Column(name = "total")
    private double total;

    @Column(name = "date_first_pay")
    private LocalDate dateFirstPay;

    @Column(name = "period_in_months")
    private int periodInMonths;

    @Column(name = "month_interest")
    private double monthInterest;

    @Column(name = "amortization")
    private double amortization;

    @Column(name = "actual_debt")
    private double actualDebt;

    public DebtPlot(Plot plot, double total, LocalDate dateFirstPay, int periodInMonths, double monthInterest, double amortization, double actualDebt) {
        this.plot = plot;
        this.total = total;
        this.dateFirstPay = dateFirstPay;
        this.periodInMonths = periodInMonths;
        this.monthInterest = monthInterest;
        this.amortization = amortization;
        this.actualDebt = actualDebt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Plot getPlot() {
        return plot;
    }

    public void setPlot(Plot plot) {
        this.plot = plot;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDate getDateFirstPay() {
        return dateFirstPay;
    }

    public void setDateFirstPay(LocalDate dateFirstPay) {
        this.dateFirstPay = dateFirstPay;
    }

    public int getPeriodInMonths() {
        return periodInMonths;
    }

    public void setPeriodInMonths(int periodInMonths) {
        this.periodInMonths = periodInMonths;
    }

    public double getMonthInterest() {
        return monthInterest;
    }

    public void setMonthInterest(double monthInterest) {
        this.monthInterest = monthInterest;
    }

    public double getAmortization() {
        return amortization;
    }

    public void setAmortization(double amortization) {
        this.amortization = amortization;
    }

    public double getActualDebt() {
        return actualDebt;
    }

    public void setActualDebt(double actualDebt) {
        this.actualDebt = actualDebt;
    }
}
