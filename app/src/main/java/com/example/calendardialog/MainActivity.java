package com.example.calendardialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.calendardialoglibrary.CalendarDialog;
import com.example.calendardialoglibrary.CalendarSetting;
import com.example.calendardialoglibrary.DialogFactory;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout_root;
    Button btn_openCalendar;
    TextView txt_date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout_root = findViewById(R.id.layout_root);
        btn_openCalendar=findViewById(R.id.btn_openCalendar);
        txt_date=findViewById(R.id.txt_date);

        btn_openCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCalendar();
            }
        });

    }

    private void openCalendar() {

        CalendarDialog calendarDialog = new CalendarDialog.Builder()

                .max_year(2025)
                .min_year(2015)

                .title("calendar")
                .titleTextColor(getResources().getColor(R.color.white))
                .titleTextSize(20)

                .closeIconVisibility(true)
                .closeIconBackgroundDrawable(getResources().getDrawable(R.drawable.ic_close))

                .headerBackgroundColor(getResources().getColor(R.color.colorAccent))
                .headerBackgroundDrawable(getResources().getDrawable(R.drawable.dialog_header_shape))

                .dateBackgroundColor(getResources().getColor(R.color.yellow))
                .dateBackgroundDrawable(getResources().getDrawable(R.drawable.date_background))

                .buttonRegisterBackgroundColor(getResources().getColor(R.color.colorAccent))
                .buttonRegisterBackgroundDrawable(getResources().getDrawable(R.drawable.dialog_btn_shape))
                .buttonRegisterTextColor(getResources().getColor(R.color.blue_dark))
                .buttonRegisterTextSize(20)

                .buttonSetTodayBackgroundColor(getResources().getColor(R.color.colorAccent))
                .buttonSetTodayBackgroundDrawable(getResources().getDrawable(R.drawable.dialog_btn_shape))
                .buttonSetTodayTextColor(getResources().getColor(R.color.blue_dark))
                .buttonSetTodayTextSize(20)

                .dialogBackgroundColor(getResources().getColor(R.color.colorAccent))
                .dialogBackgroundDrawable(getResources().getDrawable(R.drawable.dialog_btn_shape))

                .build();


        DialogFactory dialogFactory = new DialogFactory(MainActivity.this);
        dialogFactory.createCalendarDialog(new DialogFactory.DialogFactoryInteraction() {
            @Override
            public void onAcceptButtonClicked(String... params) {

                String date = params[0];
                txt_date.setText(date);

            }

            @Override
            public void onDeniedButtonClicked(boolean bool) {

            }

        }, layout_root,calendarDialog);
    }
}
