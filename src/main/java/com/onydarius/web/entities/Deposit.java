package com.onydarius.web.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Deposit {
    @Id
    @Column(name = "deposit_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "plot_id")
    private Plot plot;

    @ManyToOne
    @JoinColumn(name = "cash_id")
    private Cash cash;

    @Column(name = "total")
    private double total;

    @Column(name = "daysOfReservation")
    private int daysReservation;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "observations")
    private String observations;

    @Column(name = "status")
    private String status;

    public Deposit() {
    }

    public Deposit(Plot plot, Cash cash, double total, int daysReservation, LocalDate date, String observations, String status) {
        this.plot = plot;
        this.cash = cash;
        this.total = total;
        this.daysReservation = daysReservation;
        this.date = date;
        this.observations = observations;
        this.status = status;
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

    public Cash getCash() {
        return cash;
    }

    public void setCash(Cash cash) {
        this.cash = cash;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getDaysReservation() {
        return daysReservation;
    }

    public void setDaysReservation(int daysReservation) {
        this.daysReservation = daysReservation;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
