package com.onydarius.web.controller.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "first_last_name", nullable = false)
    private String firstLastName;

    @Column(name = "first_second_name", nullable = false)
    private String firstSecondName;

    public Client() {
    }

    public Client(String name, String firstLastName, String firstSecondName) {
        this.name = name;
        this.firstLastName = firstLastName;
        this.firstSecondName = firstSecondName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    public String getFirstSecondName() {
        return firstSecondName;
    }

    public void setFirstSecondName(String firstSecondName) {
        this.firstSecondName = firstSecondName;
    }
}
