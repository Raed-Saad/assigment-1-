package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import Model.exceciseInDay.ExercisesInDay;
import Model.exceciseInDay.ExercisesInDayDa;
import Model.exceciseInDay.ExercisesInDayFactory;

public class start extends AppCompatActivity {

Spinner spinner ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        spinner=findViewById(R.id.spinner) ;
        fillspinner();
    }
    public void fillspinner (){
        ExercisesInDayFactory factory = new ExercisesInDayFactory();
        ExercisesInDayDa obj = factory.getModel() ;
        ArrayList<String > days= obj.getdays() ;
        ArrayAdapter<String> ad = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,days);
        spinner.setAdapter(ad);
    }
    public void nextclick(View view) {
        Intent intent=new Intent(this,bmi.class);
        startActivity(intent);

    }
    public void schedual(View view) {
        SharedPreferences mPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor prefsEditor = mPrefs.edit();
        Gson gson = new Gson();
        ExercisesInDayFactory factory = new ExercisesInDayFactory();
        ExercisesInDayDa obj = factory.getModel() ;
        List<ExercisesInDay> schdula= obj.getWeekSchedual() ;
        String json = gson.toJson(schdula);
        prefsEditor.putString("schdual", json);
        prefsEditor.apply();
        Intent intent=new Intent(this,schedual.class);
        startActivity(intent);
    }
}