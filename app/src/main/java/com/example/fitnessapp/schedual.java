package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import Model.exceciseInDay.ExercisesInDay;

public class schedual extends AppCompatActivity {
ListView listView  ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedual);
        listView=findViewById(R.id.list_view);
        Gson gson = new Gson();
        SharedPreferences mPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        String json = mPrefs.getString("schdual", "");
        Type type = new TypeToken<ArrayList<ExercisesInDay>>() {
        }.getType();
        List<ExercisesInDay> exercises = gson.fromJson(json, type);
        exerciseAd ad = new exerciseAd(this,R.layout.exercisead,exercises) ;
        listView.setAdapter(ad);


    }
}