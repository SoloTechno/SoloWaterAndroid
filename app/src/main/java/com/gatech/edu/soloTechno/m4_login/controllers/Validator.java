package com.gatech.edu.soloTechno.m4_login.controllers;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * Created by Joshua on 4/10/17.
 */

public class Validator {

    /**
     * If the year, month, or day is not valid, it return boolean
     * @params year int value of year
     * @params month int value of month
     * @params day int value of day
     * @return whether the date is valid or not
     */
    public boolean isValidDate(int year, int month, int day) {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int today_year = cal.get(Calendar.YEAR);
        int today_month = cal.get(Calendar.MONTH);
        int today_day = cal.get(Calendar.DAY_OF_MONTH);

        if (year > today_year || year == 0 || day == 0 || month ==0) {
            return false;
        }
        return true;
    }

}
