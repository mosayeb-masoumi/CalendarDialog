package com.example.calendardialoglibrary;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class DialogFactory {

    private Context context;

    public interface DialogFactoryInteraction {

        void onAcceptButtonClicked(String... strings);

        void onDeniedButtonClicked(boolean cancel_dialog);
    }

    public DialogFactory(Context ctx) {
        this.context = ctx;
    }

    //-------------------------------------------------CUSTOMIZED DIALOG--------------------------------------------

    public void createCalendarDialog(final DialogFactoryInteraction listener, View view, CalendarDialog calendarDialog) {
        View customLayout = LayoutInflater.from(context).inflate(R.layout.calendar_dialog, (ViewGroup) view, false);

        //define views inside of dialog
        ImageView img_close = customLayout.findViewById(R.id.img_close);
        final Button btn_register = customLayout.findViewById(R.id.btn1);
        Button btn_todayDate = customLayout.findViewById(R.id.btn2);
        final NumberPicker np_year = customLayout.findViewById(R.id.np_year);
        final NumberPicker np_month = customLayout.findViewById(R.id.np_month);
        final NumberPicker np_day = customLayout.findViewById(R.id.np_day);
        TextView txt_title = customLayout.findViewById(R.id.txt_title);
        RelativeLayout rl_header = customLayout.findViewById(R.id.rl_header);
        LinearLayout dialog_background = customLayout.findViewById(R.id.dialog_background);

        CalendarSetting calendarSetting = new CalendarSetting();

        final int year = calendarSetting.getYear();
        final int month = calendarSetting.getMonth();
        final int day = calendarSetting.getDay();


        int min_year;
        int max_year;
        if (calendarDialog.getMin_year() != 0) {
            min_year = calendarDialog.getMin_year();
        } else {
            min_year = year - 50;
        }

        if (calendarDialog.getMax_year() != 0) {
            max_year = calendarDialog.getMax_year();
        } else {
            max_year = year + 50;
        }

        if (calendarDialog.getDateBackgroundColor() != 0)
            np_day.setBackgroundColor(calendarDialog.getDateBackgroundColor());
        np_month.setBackgroundColor(calendarDialog.getDateBackgroundColor());
        np_year.setBackgroundColor(calendarDialog.getDateBackgroundColor());

        if (calendarDialog.getDateBackgroundDrawable() != null) {
            np_day.setBackground(calendarDialog.getDateBackgroundDrawable());
            np_month.setBackground(calendarDialog.getDateBackgroundDrawable());
            np_year.setBackground(calendarDialog.getDateBackgroundDrawable());
        }

        if (calendarDialog.getTitle() != null)
            txt_title.setText(calendarDialog.getTitle());
        if (calendarDialog.getTitleTextColor() != 0)
            txt_title.setTextColor(calendarDialog.getTitleTextColor());
        if (calendarDialog.getTitleTextSize() != 0)
            txt_title.setTextSize(calendarDialog.getTitleTextSize());

        if (calendarDialog.getCloseIconVisibility() == null || calendarDialog.getCloseIconVisibility())
            img_close.setVisibility(View.VISIBLE);
        else
            img_close.setVisibility(View.GONE);

        if (calendarDialog.getCloseIconBackgroundDrawable() != null)
            img_close.setBackground(calendarDialog.getCloseIconBackgroundDrawable());


        if (calendarDialog.getHeaderBackgroundColor() != 0)
            rl_header.setBackgroundColor(calendarDialog.getHeaderBackgroundColor());
        if (calendarDialog.getHeaderBackgroundDrawable() != null)
            rl_header.setBackground(calendarDialog.getHeaderBackgroundDrawable());


        if (calendarDialog.getButtonRegisterBackgroundColor() != 0)
            btn_register.setBackgroundColor(calendarDialog.getButtonRegisterBackgroundColor());
        if (calendarDialog.getButtonRegisterBackgroundDrawable() != null)
            btn_register.setBackground(calendarDialog.getButtonRegisterBackgroundDrawable());
        if (calendarDialog.getButtonRegisterTextColor() != 0)
            btn_register.setTextColor(calendarDialog.getButtonRegisterTextColor());
        if (calendarDialog.getButtonRegisterTextSize() != 0)
            btn_register.setTextSize(calendarDialog.getButtonRegisterTextSize());

        if (calendarDialog.getButtonSetTodayBackgroundColor() != 0)
            btn_todayDate.setBackgroundColor(calendarDialog.getButtonSetTodayBackgroundColor());
        if (calendarDialog.getButtonSetTodayBackgroundDrawable() != null)
            btn_todayDate.setBackground(calendarDialog.getButtonSetTodayBackgroundDrawable());
        if (calendarDialog.getButtonSetTodayTextColor() != 0)
            btn_todayDate.setTextColor(calendarDialog.getButtonSetTodayTextColor());
        if (calendarDialog.getButtonSetTodayTextSize() != 0)
            btn_todayDate.setTextSize(calendarDialog.getButtonSetTodayTextSize());


        if (calendarDialog.getDialogBackgroundColor() != 0)
            dialog_background.setBackgroundColor(calendarDialog.getDialogBackgroundColor());
        if (calendarDialog.getDialogBackgroundDrawable() != null)
            dialog_background.setBackground(calendarDialog.getDialogBackgroundDrawable());


// year --------------------------------------------------

        if(min_year<max_year){
            List<String> yearList = new ArrayList<>();
            for (int i = min_year; i <= max_year; i++) {
                String y = String.valueOf(i);
                yearList.add(y);
            }

            String[] strYearList = new String[yearList.size()];
            strYearList = yearList.toArray(strYearList);

            np_year.setDisplayedValues(strYearList);
        }else{
            min_year = year-50;
            max_year =year +50;
            List<String> yearList = new ArrayList<>();
            for (int i = min_year; i <= max_year; i++) {
                String y = String.valueOf(i);
                yearList.add(y);
            }

            String[] strYearList = new String[yearList.size()];
            strYearList = yearList.toArray(strYearList);

            np_year.setDisplayedValues(strYearList);

            Toast.makeText(context, "minimum year should not be bigger than maximum year", Toast.LENGTH_LONG).show();
        }


// month --------------------------------------------------------
        int min_month = 1;
        int max_month = 12;

        List<String> monthList = new ArrayList<>();
        for (int i = min_month; i <= max_month; i++) {
            String m = "";
            if (i < 10) {
                m = "0" + String.valueOf(i);
            } else {
                m = String.valueOf(i);
            }
            monthList.add(m);
        }

        String[] strMonthList = new String[monthList.size()];
        strMonthList = monthList.toArray(strMonthList);

        np_month.setDisplayedValues(strMonthList);

// day --------------------------------------------------------
        int min_day = 1;
        int max_day = 31;

        List<String> dayList = new ArrayList<>();
        for (int i = min_day; i <= max_day; i++) {
            String d = "";
            if (i < 10) {
                d = "0" + String.valueOf(i);
            } else {
                d = String.valueOf(i);
            }
            dayList.add(d);
        }

        String[] strDayList = new String[dayList.size()];
        strDayList = dayList.toArray(strDayList);

        np_day.setDisplayedValues(strDayList);

//  --------------------------------------------------------
        np_year.setMinValue(min_year);
        np_year.setMaxValue(max_year);

        np_month.setMinValue(min_month);
        np_month.setMaxValue(max_month);

        np_day.setMinValue(min_day);
        np_day.setMaxValue(max_day);

//        //init set
        np_year.setValue(year);
        np_month.setValue(month);
        np_day.setValue(day);

        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        builder.setView(customLayout);

        //create dialog and set background transparent
        final android.app.AlertDialog dialog = builder.create();
        if (dialog.getWindow() != null) {
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }

        btn_todayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                np_year.setValue(year);
                np_month.setValue(month);
                np_day.setValue(day);
            }
        });

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String year1 = String.valueOf(np_year.getValue());
                String month1 = String.valueOf(np_month.getValue());
                String month2 = (String.format("%s", month1.length() < 2 ? "0" + month1 : month1));
                String day1 =String.valueOf(np_day.getValue());
                String day2 = (String.format("%s", day1.length() < 2 ? "0" + day1 : day1));

                String date =  month2+ "/" + day2 + "/" + year1;

                listener.onAcceptButtonClicked(date);
                dialog.dismiss();
            }
        });

        img_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }


    //-------------------------------------------------SIMPLE DIALOG--------------------------------------------

    public void createCalendarDialog(final DialogFactoryInteraction listener, View view) {
        View customLayout = LayoutInflater.from(context).inflate(R.layout.calendar_dialog, (ViewGroup) view, false);

        //define views inside of dialog
        ImageView img_close = customLayout.findViewById(R.id.img_close);
        final Button btn_register = customLayout.findViewById(R.id.btn1);
        Button btn_todayDate = customLayout.findViewById(R.id.btn2);
        final NumberPicker np_year = customLayout.findViewById(R.id.np_year);
        final NumberPicker np_month = customLayout.findViewById(R.id.np_month);
        final NumberPicker np_day = customLayout.findViewById(R.id.np_day);

        CalendarSetting calendarSetting = new CalendarSetting();

        final int year = calendarSetting.getYear();
        final int month = calendarSetting.getMonth();
        final int day = calendarSetting.getDay();


        int min_year;
        int max_year;

        min_year = year - 50;
        max_year = year + 50;


// year --------------------------------------------------
        if(min_year<max_year){
            List<String> yearList = new ArrayList<>();
            for (int i = min_year; i <= max_year; i++) {
                String y = String.valueOf(i);
                yearList.add(y);
            }

            String[] strYearList = new String[yearList.size()];
            strYearList = yearList.toArray(strYearList);

            np_year.setDisplayedValues(strYearList);
        }else {
            min_year = year-50;
            max_year =year +50;
            List<String> yearList = new ArrayList<>();
            for (int i = min_year; i <= max_year; i++) {
                String y = String.valueOf(i);
                yearList.add(y);
            }

            String[] strYearList = new String[yearList.size()];
            strYearList = yearList.toArray(strYearList);

            np_year.setDisplayedValues(strYearList);

            Toast.makeText(context, "minimum year should not be bigger than maximum year", Toast.LENGTH_LONG).show();
        }


// month --------------------------------------------------------
        int min_month = 1;
        int max_month = 12;

        List<String> monthList = new ArrayList<>();
        for (int i = min_month; i <= max_month; i++) {
            String m = "";
            if (i < 10) {
                m = "0" +String.valueOf(i);
            } else {
                m = String.valueOf(i);
            }
            monthList.add(m);
        }

        String[] strMonthList = new String[monthList.size()];
        strMonthList = monthList.toArray(strMonthList);

        np_month.setDisplayedValues(strMonthList);

// day --------------------------------------------------------
        int min_day = 1;
        int max_day = 31;

        List<String> dayList = new ArrayList<>();
        for (int i = min_day; i <= max_day; i++) {
            String d = "";
            if (i < 10) {
                d = "0" +String.valueOf(i);
            } else {
                d = String.valueOf(i);
            }
            dayList.add(d);
        }

        String[] strDayList = new String[dayList.size()];
        strDayList = dayList.toArray(strDayList);

        np_day.setDisplayedValues(strDayList);

//  --------------------------------------------------------
        np_year.setMinValue(min_year);
        np_year.setMaxValue(max_year);

        np_month.setMinValue(min_month);
        np_month.setMaxValue(max_month);

        np_day.setMinValue(min_day);
        np_day.setMaxValue(max_day);

//        //init set
        np_year.setValue(year);
        np_month.setValue(month);
        np_day.setValue(day);

        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        builder.setView(customLayout);

        //create dialog and set background transparent
        final android.app.AlertDialog dialog = builder.create();
        if (dialog.getWindow() != null) {
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }

        btn_todayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                np_year.setValue(year);
                np_month.setValue(month);
                np_day.setValue(day);
            }
        });

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String year1 = String.valueOf(np_year.getValue());
                String month1 = String.valueOf(np_month.getValue());
                String month2 = String.format("%s", month1.length() < 2 ? "0" + month1 : month1);
                String day1 =String.valueOf(np_day.getValue());
                String day2 = (String.format("%s", day1.length() < 2 ? "0" + day1 : day1));

                String date = month2 + "/" + day2+ "/" + year1;

                listener.onAcceptButtonClicked(date);
                dialog.dismiss();
            }
        });

        img_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

}
