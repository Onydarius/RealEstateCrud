package com.onydarius.web.entities;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table (name = "client")

public class Client {
    @Id
    @Column(name = "client_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "first_last_name", nullable = false)
    private String firstLastName;

    @Column(name = "second_last_name", nullable = false)
    private String secondLastName;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "address_complement", nullable = false)
    private String addressComplement;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id")
    private Set<Phone> phone;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "state", nullable = false)
    private String state;

    @Column(name = "postal_code", nullable = false)
    private String postalCode;

    @Column(name = "working_on", nullable = false)
    private String workingOn;

    @Column(name = "occupation", nullable = false)
    private String occupation;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "birth_state", nullable = false)
    private String birthState;

    @Column(name = "birth_city", nullable = false)
    private String birthCity;

    @Column(name = "birthday", nullable = false)
    private LocalDate birthday;

    @Column(name = "civil_status", nullable = false)
    private String civilStatus;

    @Column(name = "arrangement_property", nullable = false)
    private String arrangementProperty;

    @OneToMany(mappedBy = "client")
    Set<PlotOwners> owners;

    public Client() {
    }

    public Client(String name, String firstLastName, String secondLastName, String address, String addressComplement, Set<Phone> phone, String city, String state, String postalCode, String workingOn, String occupation, String email, String birthState, String birthCity, LocalDate birthday, String civilStatus, String arrangementProperty) {
        this.name = name;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.address = address;
        this.addressComplement = addressComplement;
        this.phone = phone;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.workingOn = workingOn;
        this.occupation = occupation;
        this.email = email;
        this.birthState = birthState;
        this.birthCity = birthCity;
        this.birthday = birthday;
        this.civilStatus = civilStatus;
        this.arrangementProperty = arrangementProperty;
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

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressComplement() {
        return addressComplement;
    }

    public void setAddressComplement(String addressComplement) {
        this.addressComplement = addressComplement;
    }

    public Set<Phone> getPhone() {
        return phone;
    }

    public void setPhone(Set<Phone> phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getWorkingOn() {
        return workingOn;
    }

    public void setWorkingOn(String workingOn) {
        this.workingOn = workingOn;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthState() {
        return birthState;
    }

    public void setBirthState(String birthState) {
        this.birthState = birthState;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }

    public String getArrangementProperty() {
        return arrangementProperty;
    }

    public void setArrangementProperty(String arrangementProperty) {
        this.arrangementProperty = arrangementProperty;
    }

    public Set<PlotOwners> getOwners() {
        return owners;
    }

    public void setOwners(Set<PlotOwners> owners) {
        this.owners = owners;
    }
}