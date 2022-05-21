package org.db4o.model.Klient;

import org.db4o.model.other_class.*;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor

public class Countrylanguage {

    private String countryCode;
    private String language;
    private Isofficjalenum isOfficial;
    private float percentage;

    @Override
    public String toString() {return countryCode + " " + language + " " + isOfficial + " " + percentage;}
  /*
    public Countrylanguage(String countryCode, String language, Isofficjalenum isOfficial, float percentage) {
        this.countryCode = countryCode;
        this.language = language;
        this.isOfficial = isOfficial;
        this.percentage = percentage;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Isofficjalenum getIsOfficial() {
        return isOfficial;
    }
    public void setIsOfficial(Isofficjalenum isOfficial) {this.isOfficial=isOfficial;}

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String toString() {
        return countryCode + " " + language + " " + isOfficial + " " + percentage;
    }*/
}
