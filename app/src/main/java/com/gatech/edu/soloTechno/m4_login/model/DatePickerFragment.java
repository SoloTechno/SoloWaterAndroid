package com.gatech.edu.soloTechno.m4_login.model;

import android.app.DatePickerDialog;
import android.app.Dialog;
import java.util.Calendar;
import java.util.Date;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;
import android.widget.TextView;

import com.gatech.edu.soloTechno.m4_login.R;

public class DatePickerFragment extends DialogFragment
        implements DatePickerDialog.OnDateSetListener {

    @RequiresApi(api = Build.VERSION_CODES.N)
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current date as the default date in the picker
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        // Create a new instance of DatePickerDialog and return it
        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    /*
    * Sets a date of user input
    *
    * @params view Datepicker view
    * @params year int value of year
    * @params month int value of month
    * @params day int value of day
    * */
    public void onDateSet(DatePicker view, int year, int month, int day) {
        TextView tv1 = (TextView) getActivity().findViewById(R.id.pick_date_input);
        tv1.setText(view.getMonth() + 1 + "/" + view.getDayOfMonth() + "/" + view.getYear());
    }

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