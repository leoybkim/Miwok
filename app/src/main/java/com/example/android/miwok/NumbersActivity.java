package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> numbersList = new ArrayList<String>();
        numbersList.add("one");
        numbersList.add("two");
        numbersList.add("three");
        numbersList.add("four");
        numbersList.add("five");
        numbersList.add("six");
        numbersList.add("seven");
        numbersList.add("eight");
        numbersList.add("nine");
        numbersList.add("ten");


        // simple_list_item_1.xml is a predefined resource in Andorid framework
        // list item layout contains a single {@link TextView} which the adpater will set to display a single number
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, numbersList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


    }
}
