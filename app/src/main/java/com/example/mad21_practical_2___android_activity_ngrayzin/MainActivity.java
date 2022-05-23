package com.example.mad21_practical_2___android_activity_ngrayzin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


import java.util.EventListener;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user = new User("rz", "desc", 1, false);
        Button button = (Button)findViewById(R.id.button2);
        user.followed = !user.followed;
        button.setText(user.followed ? "UNFOLLOW": "FOLLOW");

    }




}