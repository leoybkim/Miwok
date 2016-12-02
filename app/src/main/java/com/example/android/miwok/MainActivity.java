package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openNumbersActivity(View v) {
        Intent i = new Intent(this, NumbersActivity.class);
        startActivity(i);
    }

    public void openFamilyMembersActivity(View v) {
        Intent i = new Intent(this, FamilyActivity.class);
        startActivity(i);
    }

    public void openColorsActivity(View v) {
        Intent i = new Intent(this, ColorsActivity.class);
        startActivity(i);
    }

    public void openPhrasesActivity(View v) {
        Intent i = new Intent(this, PhrasesActivity.class);
        startActivity(i);
    }
}
