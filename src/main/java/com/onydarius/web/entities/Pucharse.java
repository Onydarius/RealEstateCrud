package com.onydarius.web.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "pucharse")
public class Pucharse {

    @Id
    @Column(name = "pucharse_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @ManyToOne
    @JoinColumn(name = "cash_id")
    private Cash cash;

    @ManyToOne
    @JoinColumn(name = "plot_id")
    private Plot plot;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "total")
    private double total;

    @Column(name = "program")
    private String program;

    @Column(name = "assesor")
    private String assesor;

    @Column(name = "observations")
    private String observations;

    public Pucharse() {
    }

    public Pucharse(Cash cash, Plot plot, LocalDate date, double total, String program, String assesor, String observations) {
        this.cash = cash;
        this.plot = plot;
        this.date = date;
        this.total = total;
        this.program = program;
        this.assesor = assesor;
        this.observations = observations;
    }

    public Cash getCash() {
        return cash;
    }

    public void setCash(Cash cash) {
        this.cash = cash;
    }

    public Plot getPlot() {
        return plot;
    }

    public void setPlot(Plot plot) {
        this.plot = plot;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getAssesor() {
        return assesor;
    }

    public void setAssesor(String assesor) {
        this.assesor = assesor;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }
}
