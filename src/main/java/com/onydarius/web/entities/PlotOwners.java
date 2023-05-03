package com.onydarius.web.entities;

import com.onydarius.web.keys.plotOwnersKey;
import jakarta.persistence.*;

@Entity
@Table(name = "plot_owners")
public class PlotOwners {
    @EmbeddedId
    plotOwnersKey id;

    @ManyToOne
    @MapsId("client_id")
    @JoinColumn(name = "client_id")
    Client client;

    @ManyToOne
    @MapsId("plot_id")
    @JoinColumn(name = "plot_id")
    Plot plot;

    public PlotOwners(Client client, Plot plot) {
        this.client = client;
        this.plot = plot;
    }

    public plotOwnersKey getId() {
        return id;
    }

    public void setId(plotOwnersKey id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Plot getPlot() {
        return plot;
    }

    public void setPlot(Plot plot) {
        this.plot = plot;
    }
}
