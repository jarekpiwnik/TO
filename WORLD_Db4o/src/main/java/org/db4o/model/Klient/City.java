package org.db4o.model.Klient;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor

public class City {
    private int id;
    private int population;
    private String name;
    private String countryCode;
    private String district;

    @Override
    public String toString() {return id + " " + name + " " + countryCode + " " + district + " " + population;}
/*
    public City(int id, String name,String countryCode, String district, int population) {
        this.id=id;
        this.name=name;
        this.countryCode=countryCode;
        this.district=district;
        this.population=population;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id=id;}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }

    public String getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(String countryCode) {
        this.countryCode=countryCode;
    }

    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district=district;
    }

    public int getPopulation() {return population;}
    public void setPopulation(int id) { this.population=population;}
*/

}
