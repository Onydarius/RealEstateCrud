package com.onydarius.web.entities;

import jakarta.persistence.*;

@Entity
@Table (name = "phone")
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "phone_id")
    private long id;

    @Column(name = "number", nullable = false)
    String number;
    @Column(name = "type", nullable = false)
    String type;

    @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "client_id", nullable = false)
    private Client client;


    public Phone(String number, String type) {
        this.number = number;
        this.type = type;
    }

    public Phone() {
    }

    public Phone(long id, String number, String type, Client client) {
        this.id = id;
        this.number = number;
        this.type = type;
        this.client = client;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
