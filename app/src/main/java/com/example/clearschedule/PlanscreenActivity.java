package com.example.clearschedule;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class PlanscreenActivity extends AppCompatActivity {

    EditText mTitleEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTitleEdit = (EditText) findViewById(R.id.title);
    }

    public void onAddTapped (View view) {

    }
}
