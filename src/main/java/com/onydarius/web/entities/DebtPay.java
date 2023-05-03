package com.onydarius.web.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "debt_pay")
public class DebtPay {
    @Id
    @Column(name = "debt_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @ManyToOne
    @JoinColumn(name = "debt_plot_id")
    private DebtPlot debtPlot;

    @ManyToOne
    @JoinColumn(name = "cash_id")
    private Cash cash;

    @Column(name = "number_of_pay")
    private int numberPay;

    @Column(name = "amount")
    private double amount;

    @Column(name = "date")
    private LocalDate date;
    @Column(name = "status")
    private String status;
}
