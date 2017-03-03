package com.gatech.edu.soloTechno.m4_login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

/**
 * Created by Joshua on 3/3/2017.
 */

public class WaterReportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_report);

        Button saveButton = (Button) findViewById(R.id.save_button);

        // water type & condition spinners
        Spinner waterTypeSpinner = (Spinner) findViewById(R.id.water_type_spinner);
        Spinner waterConditionSpinner = (Spinner) findViewById(R.id.water_condition_spinner);

        ArrayAdapter<CharSequence> waterTypeAdapter = ArrayAdapter.createFromResource(this,
                R.array.water_type_array, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> waterConditionAdapter = ArrayAdapter.createFromResource(this,
                R.array.water_condition_array, android.R.layout.simple_spinner_item);

        waterTypeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        waterConditionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        waterTypeSpinner.setAdapter(waterTypeAdapter);
        waterConditionSpinner.setAdapter(waterConditionAdapter);

        saveButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // pending:: submit water report to firebase DB

                // when successfully saved user water report, direct user to main screen
                Intent mainActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(mainActivity);
            }
        });
    }

    /*
    * Displays dates range for user input
    *
    * @Param v View for date picker
    * */
    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }
}
