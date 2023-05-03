package com.onydarius.web.entities;

import jakarta.persistence.*;

@Entity
public class Charges {
    @Id
    @Column(name = "charge_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "cash_id")
    private Cash cash;

    @ManyToOne
    @JoinColumn(name = "plot_id")
    private Plot plot;

    @Column(name = "observations")
    private String observations;

    public Charges() {
    }

    public Charges(Cash cash, Plot plot, String observations) {
        this.cash = cash;
        this.plot = plot;
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

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }
}
