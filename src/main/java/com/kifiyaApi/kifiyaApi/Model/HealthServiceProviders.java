package com.kifiyaApi.kifiyaApi.Model;

import javax.persistence.*;

@Entity
public class HealthServiceProviders {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "provider_id")
    private Long Id;
    private String name;
    private String address;
    private String description;

    public HealthServiceProviders() {
    }

    public HealthServiceProviders(Long id, String name, String address, String description) {
        Id = id;
        this.name = name;
        this.address = address;
        this.description = description;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
