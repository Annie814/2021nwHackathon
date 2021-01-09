package com.example.alarmclock;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.TimePicker;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    TimePicker alarmTime;

        @Override
        public void onClick(View view) {

            TimePicker alarmTime = findViewById(R.id.time_picker);

            Calendar calendar = new GregorianCalendar(datePicker.getYear(),
//                    datePicker.getMonth(),
//                    datePicker.getDayOfMonth(),
                    alarmTime.getCurrentHour(),
                    alarmTime.getCurrentMinute());

            time = calendar.getTimeInMillis();
            alertDialog.dismiss();

            Timer t = new Timer();
            t.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {

                }
            }

            alertDialog.setView(dialogView);
alertDialog.show();




//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
}