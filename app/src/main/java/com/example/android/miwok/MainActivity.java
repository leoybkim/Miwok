package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set a click listener on numbers textview
        TextView tv_numbers = (TextView) findViewById(R.id.numbers);
        tv_numbers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent numbersIntent = new Intent (MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        // Set a click listener on family textview
        TextView tv_family = (TextView) findViewById(R.id.family);
        tv_family.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent familyIntent = new Intent (MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        // Set a click listener on family textview
        TextView tv_colors = (TextView) findViewById(R.id.colors);
        tv_colors.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent colorsIntent = new Intent (MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        // Set a click listener on family textview
        TextView tv_phrases = (TextView) findViewById(R.id.phrases);
        tv_phrases.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent phrasesIntent = new Intent (MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });
    }

}
