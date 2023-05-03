package com.onydarius.web.keys;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class plotOwnersKey implements Serializable {
    @Column(name = "client_id")
    private long clientID;

    @Column(name = "plot_id")
    private long plotID;

    @Column(name = "type")
    private String type;

    public plotOwnersKey(Long clientID, Long plotID, String type) {
        this.clientID = clientID;
        this.plotID = plotID;
        this.type = type;
    }

    public Long getClientID() {
        return clientID;
    }

    public void setClientID(Long clientID) {
        this.clientID = clientID;
    }

    public Long getPhoneID() {
        return plotID;
    }

    public void setPhoneID(Long phoneID) {
        this.plotID = phoneID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        plotOwnersKey that = (plotOwnersKey) o;
        return Objects.equals(clientID, that.clientID) && Objects.equals(plotID, that.plotID) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientID, plotID, type);
    }
}
