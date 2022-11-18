package com.example.pro355humanresources.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.aggregation.ArithmeticOperators;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Optional;


@Document(collection = "Employees")
public class Employee {

    @Id
    private String id;
    private String employeeFirstName;
    private String employeeLastName;
    private double employeeSalary;

    private String employeePosition;
    private Address employeeAddress;

    private String[] positions;

    private boolean employeeStatus;
    private String createdDate;
    private String modifiedDate;

    public Employee() {
    }

    public Employee(String employeeFirstName, String employeeLastName) {
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeeStatus = true;
        this.createdDate = LocalDateTime.now().toString();
    }

    public Employee(String employeeFirstName, String employeeLastName, Address employeeAddress) {
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeeAddress = employeeAddress;
        this.createdDate = LocalDateTime.now().toString();
    }

    public Employee(String id,String employeeFirstName, String employeeLastName, double employeeSalary, String employeePosition, Address employeeAddress, String[] positions, boolean employeeStatus) {
        this.id = id;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeeSalary = employeeSalary;
        this.employeePosition = employeePosition;
        this.employeeAddress = employeeAddress;
        this.positions = positions;
        this.employeeStatus = employeeStatus;
    }
    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }

    public Address getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(Address employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String[] getPositions() {
        return positions;
    }

    public void setPositions(String[] positions) {
        this.positions = positions;
    }

    public boolean getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(boolean employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public void setId(String id){this.id = id;}

    public String getId(){return id;}

    @Override
    public String toString() {
        return "Employee{" +
                "employeeFirstName='" + employeeFirstName + '\'' +
                ", employeeLastName='" + employeeLastName + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", employeePosition='" + employeePosition + '\'' +
                ", employeeAddress=" + employeeAddress +
                ", positions=" + Arrays.toString(positions) +
                ", employeeStatus=" + employeeStatus +
                ", createdDate='" + createdDate + '\'' +
                ", modifiedDate='" + modifiedDate + '\'' +
                '}';
    }
}