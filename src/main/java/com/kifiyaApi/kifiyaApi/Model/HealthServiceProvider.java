package com.kifiyaApi.kifiyaApi.Model;

import lombok.Data;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;


@Entity
@Transactional
@Data
public class HealthServiceProvider {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "prov_id")
    private Long Id;
    private String name;
    private String address;
    private String description;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_prov_id", referencedColumnName = "prov_id")
    private List<Employee> employees;

    public HealthServiceProvider() {
    }

    public HealthServiceProvider(Long id, String name, String address, String description) {
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

    @Override
    public String toString() {
        return "HealthServiceProviders{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
