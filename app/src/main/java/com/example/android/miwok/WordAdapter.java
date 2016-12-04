package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by leo on 03/12/16.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        Log.v("WordAdapter", Integer.toString(colorResourceId));
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word word = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView default_text = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the default text from the current Word object and
        // set this text on the name TextView
        default_text.setText(word.getDefaultTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView miwok_text = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the miwok text from the current AndroidFlavor object and
        // set this text on the number TextView
        miwok_text.setText(word.getMiwokTranslation());

        ImageView img = (ImageView) listItemView.findViewById(R.id.image);
        

        if (word.hasImage()) {
            img.setImageResource(word.getImageResourceId());
            img.setVisibility(View.VISIBLE);
        } else {
            img.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout
        return listItemView;
    }
}

