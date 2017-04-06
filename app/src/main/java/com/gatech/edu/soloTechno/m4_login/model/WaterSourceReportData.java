package com.gatech.edu.soloTechno.m4_login.model;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
@SuppressWarnings("FieldCanBeLocal")
public class WaterSourceReportData {

    private String waterReportNumber;
    private String name;
    private String locationName;
    private String latitude;
    private String longitude;
    private String waterType;
    private String waterCondition;

    public WaterSourceReportData(String waterReportNumber, String name, String locationName, String latitude,
                                 String longitude, String waterType, String waterCondition)  {
        this.waterReportNumber = waterReportNumber;
        this.name = name;
        this.locationName = locationName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.waterType = waterType;
        this.waterCondition = waterCondition;
    }
}