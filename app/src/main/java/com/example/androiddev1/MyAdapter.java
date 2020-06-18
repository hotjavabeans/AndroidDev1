package com.example.androiddev1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

class MyAdapter extends ArrayAdapter<String> {

    public MyAdapter(@NonNull Context context, String[] values) {
        super(context, R.layout.row_layout2, values);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater theInflater = LayoutInflater.from(getContext());

        View theView = theInflater.inflate(R.layout.row_layout2,
                parent, false);

        String tvShow = getItem(position);

        TextView theTextView = (TextView) theView.findViewById(R.id.textView1);

        theTextView.setText(tvShow);

//        ImageView theImageView = (ImageView) theView.findViewById(R.id.imageView1);

//        theImageView.setImageResource(R.drawable.triangle);

        return theView;
    }
}