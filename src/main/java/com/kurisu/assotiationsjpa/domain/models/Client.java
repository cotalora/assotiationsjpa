package com.kurisu.assotiationsjpa.domain.models;

import java.util.List;

public class Client {
    private Long id;
    private String name;
    private String lastName;
    private List<Address> addresses;

    public Client(Long id, String name, String lastName, List<Address> addresses) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.addresses = addresses;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
