package com.example.fitnessapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import Model.exceciseInDay.ExercisesInDay;
import Model.excercise.Exercise;

public class exerciseAd extends ArrayAdapter<ExercisesInDay> {
    private static final String TAG ="exercisedAd";
    private Context mContext;
    int mResource;


    public exerciseAd(@NonNull Context context, int resource, @NonNull List<ExercisesInDay> objects) {
        super(context, resource, objects);
        mContext =context ;
        mResource = resource ;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String type=getItem(position).getExercises().get(0).getType() ;
        int number=getItem(position).getExercises().get(0).getNumber() ;
        LayoutInflater inflater=LayoutInflater.from(mContext);
        convertView=inflater.inflate(mResource,parent,false);
        TextView tvtype=(TextView) convertView.findViewById(R.id.number);
        TextView tvnumber=(TextView) convertView.findViewById(R.id.type);
        tvtype.setText(type);
        tvnumber.setText(String.valueOf(number));
        return convertView;
    }
}
