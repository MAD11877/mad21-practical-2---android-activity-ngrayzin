package com.example.mad21_practical_2___android_activity_ngrayzin;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Profile");
        builder.setMessage("MADness");
        builder.setCancelable(false);
        /*builder.setPositiveButton(“VIEW”, new
                DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){

                    }
                });
        builder.setNegativeButton(“CLOSE”, new
                DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){

                    }
                });*/

    }
}