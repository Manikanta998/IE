package com.ie.spring;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {

    @Column
    private String name;
    @Column
    private int salary;
    @Column
    private String dep;
    @Id
    @Column
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public Employee(String name, int salary, String dep) {
        this.name = name;
        this.salary = salary;
        this.dep = dep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }


}

