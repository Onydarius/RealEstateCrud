package com.onydarius.web.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "plot")
public class Plot {
    @Id
    @Column(name = "plot_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Column(name = "plot_no", nullable = false)
    int plotNo;
    @Column(name = "surface", nullable = false)
    double surface;
    @Column(name = "adjacent_north")
    int adjacentNorth;
    @Column(name = "adjacent_south", nullable = false)
    int adjacentSouth;
    @Column(name = "adjacent_west", nullable = false)
    int adjacentWest;
    @Column(name = "adjacent_east", nullable = false)
    int adjacentEast;
    @Column(name = "price_per_Meter", nullable = false)
    float pricePerMeter;

    @OneToMany(mappedBy = "plot")
    Set<PlotOwners> owners;
    String reference;

    public Plot() {
    }

    public Plot(int plotNo, double surface, float pricePerMeter, String reference) {
        this.plotNo = plotNo;
        this.surface = surface;
        this.pricePerMeter = pricePerMeter;
        this.reference = reference;
    }
    public Plot(int plotNo, double surface, int adjacent_north, int adjacent_south, int adjacent_west, int adjacent_east, float pricePerMeter, String reference) {
        this.plotNo = plotNo;
        this.surface = surface;
        this.adjacentNorth = adjacent_north;
        this.adjacentSouth = adjacent_south;
        this.adjacentWest = adjacent_west;
        this.adjacentEast = adjacent_east;
        this.pricePerMeter = pricePerMeter;
        this.reference = reference;
    }

    public Plot(long id, int plotNo, double surface, int adjacentNorth, int adjacentSouth, int adjacentWest, int adjacentEast, float pricePerMeter, Set<PlotOwners> owners, String reference) {
        this.plotNo = plotNo;
        this.surface = surface;
        this.adjacentNorth = adjacentNorth;
        this.adjacentSouth = adjacentSouth;
        this.adjacentWest = adjacentWest;
        this.adjacentEast = adjacentEast;
        this.pricePerMeter = pricePerMeter;
        this.owners = owners;
        this.reference = reference;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPlotNo() {
        return plotNo;
    }

    public void setPlotNo(int plotNo) {
        this.plotNo = plotNo;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public int getAdjacentNorth() {
        return adjacentNorth;
    }

    public void setAdjacentNorth(int adjacentNorth) {
        this.adjacentNorth = adjacentNorth;
    }

    public int getAdjacentSouth() {
        return adjacentSouth;
    }

    public void setAdjacentSouth(int adjacentSouth) {
        this.adjacentSouth = adjacentSouth;
    }

    public int getAdjacentWest() {
        return adjacentWest;
    }

    public void setAdjacentWest(int adjacentWest) {
        this.adjacentWest = adjacentWest;
    }

    public int getAdjacentEast() {
        return adjacentEast;
    }

    public void setAdjacentEast(int adjacentEast) {
        this.adjacentEast = adjacentEast;
    }

    public float getPricePerMeter() {
        return pricePerMeter;
    }

    public void setPricePerMeter(float pricePerMeter) {
        this.pricePerMeter = pricePerMeter;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}

