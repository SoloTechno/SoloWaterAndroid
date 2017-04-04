package com.gatech.edu.soloTechno.m4_login.controllers;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;

import com.gatech.edu.soloTechno.m4_login.R;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.GridLabelRenderer;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.ArrayList;

/**
 * Created by timothybaba on 4/4/17.
 */

public class ShowGraph extends FragmentActivity {

    private  LineGraphSeries<DataPoint> series;
    GraphView graph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historical_report);
        graph = (GraphView) findViewById(R.id.graph);
        /*LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3),
                new DataPoint(3, 2),
                new DataPoint(4, 6)
        });*/




       if(HistoricalReportActivity.data1!=null && HistoricalReportActivity.data2!=null
                && HistoricalReportActivity.data3 !=null) {
            plot(determineSelection(HistoricalReportActivity.data1),
                    determineSelection(HistoricalReportActivity.data2));
            plot(determineSelection(HistoricalReportActivity.data1),
                    determineSelection(HistoricalReportActivity.data3));
        } else if(HistoricalReportActivity.data1!=null && HistoricalReportActivity.data2!=null) {
               plot(determineSelection(HistoricalReportActivity.data1),
                       determineSelection(HistoricalReportActivity.data2));

        } else if(HistoricalReportActivity.data2!=null && HistoricalReportActivity.data3!=null) {
                plot(determineSelection(HistoricalReportActivity.data2),
                        determineSelection(HistoricalReportActivity.data3));
        } else if(HistoricalReportActivity.data1!=null && HistoricalReportActivity.data3!=null){
                plot(determineSelection(HistoricalReportActivity.data1),
                        determineSelection(HistoricalReportActivity.data3));
        }
    }

    void plot (ArrayList list1, ArrayList list2) {
        series = new LineGraphSeries<>();
       // int i = 0;
       // int length = list1.size();
        for(int i = 0; i< 5; i++) {
            //series.appendData(new DataPoint((Double) list1.get(i), (Double) list2.get(i)), true, length);
           /* series.appendData(new DataPoint(0, 1), true, 5);
            series.appendData(new DataPoint(1, 5), true, 5);
            series.appendData(new DataPoint(2, 3), true, 5);
            series.appendData(new DataPoint(3, 2), true, 5);
            series.appendData(new DataPoint(4, 6), true, 5);*/
            series.appendData(new DataPoint(i++, i++), true, 5);

       }
        graph.addSeries(series);
    }

    ArrayList determineSelection(String selected) {
        ArrayList answer = new ArrayList();
        switch (selected) {
            /*case "Location": answer = HistoricalReportActivity.locations;
                break;*/
            case "Year": answer = HistoricalReportActivity.years;
                break;
            case "Virus": answer = HistoricalReportActivity.virus;
                break;
            case "Contaminants": answer = HistoricalReportActivity.contaminants;
                break;
        }
        return answer;
    }

}
