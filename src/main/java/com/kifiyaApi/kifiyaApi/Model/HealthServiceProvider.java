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
    private String email;
    private String phone_number;
    private String location;
    private String description;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_prov_id", referencedColumnName = "prov_id")
    private List<Employee> employees;

    public HealthServiceProvider() {
    }

    public HealthServiceProvider(Long id, String name, String address, String description) {
        Id = id;
        this.name = name;
        this.location = address;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "HealthServiceProviders{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", address='" + location + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
