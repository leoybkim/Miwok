package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?", "minto wuksus"));
        words.add(new Word("What is your name?", "tinnә oyaase'nә"));
        words.add(new Word("My name is...", "oyaaset..."));
        words.add(new Word("How are you feeling?", "michәksәs?"));
        words.add(new Word("I’m feeling good.", "kuchi achit"));
        words.add(new Word("Are you coming?", "әәnәs'aa?"));
        words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
        words.add(new Word("I’m coming.", "әәnәm"));
        words.add(new Word("Let’s go.", "yoowutis"));
        words.add(new Word("Come here.", "әnni'nem"));


        // Create {@link ArrayAdapter}
        // adapter creates layout for each item in the list using the simple_list_item_1.xml (builtin Android framework)
        // each layout contains a single {@link TextView} to display single word
        WordAdapter adapter = new WordAdapter(this, words);

        // Find {@link ListView} in {@link Activity}
        ListView listView = (ListView) findViewById(R.id.list);

        // Make {@link ListView}  use the [@link ArrayAdapter}
        listView.setAdapter(adapter);
    }
}
