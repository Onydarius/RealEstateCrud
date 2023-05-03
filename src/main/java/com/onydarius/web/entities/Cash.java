package com.onydarius.web.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "cash")
public class Cash {

    @Id
    @Column(name = "cash_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "record_number")
    private long recordNumber;

    @Column(name = "date_of_payment")
    private LocalDate dateOfPayment;

    @Column(name = "movement")
    private String movement;

    @Column(name = "total")
    private double total;

    @Column(name = "concept")
    private String concept;

    @Column(name = "status")
    private String status;

    @Column(name = "type_of_pay")
    private String typeOfPay;

    @Column(name = "observations")
    private String observatons;

    public Cash(long recordNumber, LocalDate dateOfPayment, String movement, double total, String concept, String status, String typeOfPay, String observatons) {
        this.recordNumber = recordNumber;
        this.dateOfPayment = dateOfPayment;
        this.movement = movement;
        this.total = total;
        this.concept = concept;
        this.status = status;
        this.typeOfPay = typeOfPay;
        this.observatons = observatons;
    }

    public Cash() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(long recordNumber) {
        this.recordNumber = recordNumber;
    }

    public LocalDate getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(LocalDate dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTypeOfPay() {
        return typeOfPay;
    }

    public void setTypeOfPay(String typeOfPay) {
        this.typeOfPay = typeOfPay;
    }

    public String getObservatons() {
        return observatons;
    }

    public void setObservatons(String observatons) {
        this.observatons = observatons;
    }
}
