package com.boadu.autocompletetext;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

/*
* Author : Boadu Philip Asare
* Email : asarephilip8@gmail.com
* Date : 06 Feb, 2020
*
* How to implement realtime text search with auto suggestion using AutoComplete TextView
*
*/


public class MainActivity extends AppCompatActivity {
    //Array of String to be suggested
    String[] language ={"Kofi","Ama","Adwoa","Yaa","Kwaku","Android","Abena","Akua","Kwadwo", "Mansa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Creating the instance of ArrayAdapter containing list of language names
        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (this,android.R.layout.select_dialog_item,language);
        //Getting the instance of AutoCompleteTextView
        AutoCompleteTextView actv= findViewById(R.id.autoCompleteTextView1);
        actv.setThreshold(1);//Start showing suggestion on typing first character
        actv.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView
        actv.setTextColor(Color.RED);
    }
}
