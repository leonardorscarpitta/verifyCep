package com.verifyCep.models;

import com.google.gson.annotations.SerializedName;

public class AddressClass {

    private String street;
    private String neighborhood;
    private String fu;

    public AddressClass(AddressRecord addressRegistered) {
        this.street = addressRegistered.logradouro();
        this.neighborhood = addressRegistered.bairro();
        this.fu = addressRegistered.uf();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getFu() {
        return fu;
    }

    public void setFu(String fu) {
        this.fu = fu;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    @Override
    public String toString() {
        return "Address Searched - Street: " + street + " | Neighborhood Name: " + neighborhood + " | Federative Unit: " + fu;
    }
}
