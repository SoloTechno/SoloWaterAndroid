package com.gatech.edu.soloTechno.m4_login;

import com.gatech.edu.soloTechno.m4_login.model.WaterPurityReportData;

import org.junit.Test;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;



/**
 * Created by Joonyoung Kim on 4/10/17.
 */



public class getReportTest {
    private String waterReportNumber = "1";
    private String name = "Joon";
    private String locationName = "Atlanta";
    private String latitude = "35";
    private String longitude = "-84";
    private String waterCondition = "3";
    private String virusPPM = "33";
    private String contaminantPPM = "44";
    private String year = "2017";
    private String month = "4";
    private String passList = "";
    private String failList = "";

    public WaterPurityReportData data1 = new WaterPurityReportData(waterReportNumber, name, locationName, latitude,
                                                              longitude, waterCondition, virusPPM, contaminantPPM, year, month);

    public WaterPurityReportData data2 = new WaterPurityReportData(null, name, locationName, latitude,
            longitude, waterCondition, virusPPM, contaminantPPM, year, month);

    @Before
    public void setUp()
    {
        passList = "Water Report Number : " + waterReportNumber
                + "\nName : " + name
                + "\nLocation Name : " + locationName
                + "\nLatitude : " + latitude
                + "\nLongitude : " + longitude
                + "\nWater Condition : " + waterCondition
                + "\nVirus PPM : " + virusPPM
                + "\nContaminant PPM : " + contaminantPPM
                + "\nYear : " + year
                + "\nMonth : " + month;

        failList = "There are no reports to fetch.";
    }

    @After
    public void tearDown()
    {

    }

    @Test//Success Cases
    public void getReportFail_checker() {

        System.out.println("Tested Method:getReport() for success and failing cases");




        // testing the passing conditions
        assertEquals(passList, data1.getReport());


        // test the failing conditions
        assertEquals(failList, data2.getReport());


    }


}
