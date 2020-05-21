package com.example.calendardialoglibrary;

import android.annotation.SuppressLint;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class CalendarSetting {

    private int day, month, year;

    public CalendarSetting() {
        getDate();
    }


    private void getDate() {

        @SuppressLint("SimpleDateFormat") DateFormat df = new SimpleDateFormat("MM/dd/yy");
        String currentDate = df.format(new Date());

        String[] dateParts = currentDate.split("/");
        month = Integer.parseInt(dateParts[0]);
        day = Integer.parseInt(dateParts[1]);
        year = Integer.parseInt(dateParts[2]);

    }

    public int getYear() {
        return year+2000;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }


}
