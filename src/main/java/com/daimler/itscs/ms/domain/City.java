package com.daimler.itscs.ms.domain;

import java.io.Serializable;

/**
 * Created by Alex on 2017/3/10.
 * DB Object
 */
public class City implements Serializable {
    private static final long serialVersionUID = 2120869894112984147L;

    private int id;
    private String name;
    private String countryCode;
    private String district;
    private long population;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String contryCode) {
        this.countryCode = contryCode;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
}
