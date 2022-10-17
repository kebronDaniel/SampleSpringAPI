package com.kifiyaApi.kifiyaApi.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.transaction.Transactional;


@Entity
@Transactional
@Data
public class Employee {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private Long Id;
    private String name;
    private int age;
    private String email;
    private String gender;
    private String address;


    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_prov_id")
    private HealthServiceProvider provider;

    public Employee() {
    }

    public Employee(Long id, String name, int age, String description) {
        Id = id;
        this.name = name;
        this.age = age;
        this.email = description;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public HealthServiceProvider getProvider() {
        return provider;
    }

    public void setProvider(HealthServiceProvider provider) {
        this.provider = provider;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", description='" + email + '\'' +
                '}';
    }
}
