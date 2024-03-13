/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peso02
 */
public class LiteracyRate {
    private String gender;
    private String country;
    private int year;
    private double literacyPercent;
    
    public LiteracyRate(String gender, String country, int year, double literacyPercent) {
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getLiteracyPercent() {
        return literacyPercent;
    }

    public void setLiteracyPercent(double literacyPercent) {
        this.literacyPercent = literacyPercent;
    }
    
    @Override
    public String toString() {
        return this.country + " (" + this.year + ")," + this.gender +", " + this.literacyPercent;
    }
}
