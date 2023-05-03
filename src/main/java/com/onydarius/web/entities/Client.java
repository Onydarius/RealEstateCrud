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

    @Column(name = "first_second_name", nullable = false)
    private String firstSecondName;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "address_complement", nullable = false)
    private String addressComplement;

    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY)
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

    @Column(name = "birthplace", nullable = false)
    private String birthplace;

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

    public Client(String name, String firstLastName, String firstSecondName) {
        this.name = name;
        this.firstLastName = firstLastName;
        this.firstSecondName = firstSecondName;
    }

    public Client(String name, String firstLastName, String firstSecondName, String address, String addressComplement, Set<Phone> phone,String city, String state, String postalCode, String workingOn, String occupation, String email, String birthplace, LocalDate birthday, String civilStatus, String arrangementProperty) {
        this.name = name;
        this.firstLastName = firstLastName;
        this.firstSecondName = firstSecondName;
        this.address = address;
        this.addressComplement = addressComplement;
        this.phone = phone;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.workingOn = workingOn;
        this.occupation = occupation;
        this.email = email;
        this.birthplace = birthplace;
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

    public String getFirstSecondName() {
        return firstSecondName;
    }

    public void setFirstSecondName(String firstSecondName) {
        this.firstSecondName = firstSecondName;
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

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
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
}
