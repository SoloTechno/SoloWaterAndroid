package com.gatech.edu.soloTechno.m4_login.model;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
@SuppressWarnings("ALL")
public class WaterSourceReportData {

    private final String waterReportNumber;
    private final String name;
    private final String locationName;
    private final String latitude;
    private final String longitude;
    private final String waterType;
    private final String waterCondition;

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