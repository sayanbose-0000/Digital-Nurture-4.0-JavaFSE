package com.cognizant.orm_learn.model;

import jakarta.persistence.*;

@Entity
public class Country {
    @Id
    @Column(name = "co_name")
    private String name;

    @Column(name = "co_code")
    private String code;

    // Getter and Setter for name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Getter and Setter for code
    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
    
    // Overriding toString() method
    public String toString() {
        return "Country name is " + name + ", Country Code is " + code;
    }
}
