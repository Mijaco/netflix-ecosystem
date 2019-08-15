package com.demo.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Mijail on 5/07/2019.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Consultant {


    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
