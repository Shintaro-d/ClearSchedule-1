package com.example.clearschedule;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Database;
import androidx.room.Room;


public class HomescreenActivity extends AppCompatActivity {



        private TextView titleText;
        private Button prevButton, nextButton;
        private CalendarAdapter mCalendarAdapter;
        private GridView calendarGridView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_homescreen);

            titleText = findViewById(R.id.titleText);
            prevButton = findViewById(R.id.prevButton);
            prevButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mCalendarAdapter.prevMonth();
                    titleText.setText(mCalendarAdapter.getTitle());
                }
            });
            nextButton = findViewById(R.id.nextButton);
            nextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mCalendarAdapter.nextMonth();
                    titleText.setText(mCalendarAdapter.getTitle());
                }
            });
            calendarGridView = findViewById(R.id.calendarGridView);
            mCalendarAdapter = new CalendarAdapter(this);
            calendarGridView.setAdapter(mCalendarAdapter);
            titleText.setText(mCalendarAdapter.getTitle());

        final Button editbutton = findViewById(R.id.button14);

        editbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HomescreenActivity.this, PlanscreenActivity.class);
                startActivity(intent);
            }
        });

        final Button hyoujibutton = findViewById(R.id.button16);

        editbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HomescreenActivity.this, LabelscreenActivity.class);
                startActivity(intent);
            }
        });

        /*AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "database-name").build(); /*これでデータベースの取得ができるかも*/
        /*ScheduleDao scheduleDao = db.scheduleDao(); /*これでクエリの発行ができるかも*/
    }
}