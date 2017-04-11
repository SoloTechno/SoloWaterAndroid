package com.gatech.edu.soloTechno.m4_login.model;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class WaterPurityReportData {

    private String waterReportNumber;
    private String name;
    private String locationName;
    private String latitude;
    private String longitude;
    private String waterCondition;
    private String virusPPM;
    private String contaminantPPM;
    private String year;
    private String month;


    public WaterPurityReportData (String waterReportNumber, String name, String locationName, String latitude,
                            String longitude, String waterCondition, String virusPPM, String contaminantPPM, String year, String month)  {
        this.waterReportNumber = waterReportNumber;
        this.name = name;
        this.locationName = locationName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.waterCondition = waterCondition;
        this.virusPPM = virusPPM;
        this.contaminantPPM = contaminantPPM;
        this.year = year;
        this.month = month;
    }

    /**
     * Fetches the report in string for display
     * @return string of text
     */
    public String getReport(){
        String list;
        if(waterReportNumber != null) {
            list = "Water Report Number : " + waterReportNumber
                    + "\nName : " + name
                    + "\nLocation Name : " + locationName
                    + "\nLatitude : " + latitude
                    + "\nLongitude : " + longitude
                    + "\nWater Condition : " + waterCondition
                    + "\nVirus PPM : " + virusPPM
                    + "\nContaminant PPM : " + contaminantPPM
                    + "\nYear : " + year
                    + "\nMonth : " + month;
        } else{
            list = "There are no reports to fetch.";
        }
        return list;
    }
}