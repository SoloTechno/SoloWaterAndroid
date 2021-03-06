package com.gatech.edu.soloTechno.m4_login.controllers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("FieldCanBeLocal")
public class HistoricalReportActivity extends FragmentActivity {
    private Button submitButton;
    private Spinner yearSpinner;
    private Spinner ppmSpinner;
    private Spinner locationSpinner;
    static String data1;
    static String data2;
    static String data3;
    //static ArrayList locations = new ArrayList();
    static final ArrayList<String> years = new ArrayList<>();
    static final ArrayList<String> virus = new ArrayList<>();
    static final ArrayList<String> contaminants = new ArrayList<>();
    private final ArrayList<String> options = new ArrayList<>(Arrays.asList("select", "Year", "Virus", "Contaminants"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historicalreport_setup);

        submitButton = (Button) findViewById(R.id.submit_button);
        yearSpinner = (Spinner) findViewById(R.id.year_spinner);
        ppmSpinner = (Spinner) findViewById(R.id.virusPPM_spinner);
        locationSpinner = (Spinner) findViewById(R.id.location_spinner);

        /*ArrayAdapter<CharSequence> ppmAdapter = ArrayAdapter.createFromResource(this,
                R.array.ppm_array, android.R.layout.simple_spinner_item);
        ppmAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ppmSpinner.setAdapter(ppmAdapter);*/

        ArrayAdapter<String> ppmAdapter = new ArrayAdapter<>(HistoricalReportActivity.this, android.R.layout.simple_spinner_item, options);
        ppmAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ppmSpinner.setAdapter(ppmAdapter);

        DatabaseReference myFirebaseRef = FirebaseDatabase.getInstance().getReference("water purity reports");

        myFirebaseRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {


                for (DataSnapshot areaSnapshot: dataSnapshot.getChildren()) {
                   // String locationName = areaSnapshot.child("locationName").getValue(String.class);
                    String yearData = areaSnapshot.child("year").getValue(String.class);
                    String virusData = areaSnapshot.child("virusPPM").getValue(String.class);
                    String contaminantsData = areaSnapshot.child("contaminantPPM").getValue(String.class);
                   // locations.add(locationName);
                    years.add(yearData);
                    virus.add(virusData);
                    contaminants.add(contaminantsData);
                }

                for(int i =0; i <years.size(); i++) {
                    System.out.println(years.get(i));
                }

                /*ArrayAdapter<String> locationAdapter = new ArrayAdapter<String>(HistoricalReportActivity.this, android.R.layout.simple_spinner_item, locations);
                locationAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                locationSpinner.setAdapter(locationAdapter);

                ArrayAdapter<String> yearAdapter = new ArrayAdapter<String>(HistoricalReportActivity.this, android.R.layout.simple_spinner_item, years);
                locationAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                yearSpinner.setAdapter(yearAdapter);*/

                ArrayAdapter<String> locationAdapter = new ArrayAdapter<>(HistoricalReportActivity.this, android.R.layout.simple_spinner_item, options);
                locationAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                locationSpinner.setAdapter(locationAdapter);

                ArrayAdapter<String> yearAdapter = new ArrayAdapter<>(HistoricalReportActivity.this, android.R.layout.simple_spinner_item, options);
                locationAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                yearSpinner.setAdapter(yearAdapter);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        submitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                data1 = ppmSpinner.getSelectedItem().toString().trim().equals("select") ? null : ppmSpinner.getSelectedItem().toString().trim();
                data2 = locationSpinner.getSelectedItem().toString().trim().equals("select") ? null : locationSpinner.getSelectedItem().toString().trim();
                data3 = yearSpinner.getSelectedItem().toString().trim().equals("select") ? null : yearSpinner.getSelectedItem().toString().trim();



                Intent graphDisplay = new Intent(HistoricalReportActivity.this, ShowGraph.class);
                startActivity(graphDisplay);


            }
        });



//        GraphView graph = (GraphView) findViewById(R.id.graph);
//        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
//                new DataPoint(0, 1),
//                new DataPoint(1, 5),
//                new DataPoint(2, 3),
//                new DataPoint(3, 2),
//                new DataPoint(4, 6)
//        });
//        graph.addSeries(series);


    }
}
