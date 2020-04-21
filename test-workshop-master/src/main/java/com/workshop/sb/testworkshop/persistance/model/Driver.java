package com.workshop.sb.testworkshop.persistance.model;

import com.workshop.sb.testworkshop.model.request.DriverRequest;

import javax.persistence.*;

@Entity
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "phone_number", length = 20, nullable = false)
    private String phoneNumber;

    @Column(name = "id_number", length = 50, nullable = false)
    private String idNumber;

    @Column(name = "address", length = 300, nullable = false)
    private String address;

    @Column(name = "salary", length = 10, nullable = false)
    private double salary;

    public Driver() {
    }

    public Driver(DriverRequest request) {
        this.id = request.getId();
        this.name = request.getName();
        this.phoneNumber = request.getPhoneNumber();
        this.idNumber = request.getIdNumber();
        this.address = request.getAddress();
        this.salary = request.getSalary();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
