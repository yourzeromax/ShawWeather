package com.example.shawweather.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.shawweather.R;

import java.util.List;

/**
 * Created by yourzeromax on 2017/5/16.
 */

public class CityAdapter extends ArrayAdapter {
    int resourceId;
    List<String> list;
    public CityAdapter(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
        this.resourceId = resource;
        this.list=objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        TextView textView = (TextView) view.findViewById(R.id.city_textview);
        textView.setText(list.get(position));
        return view;
    }
}
