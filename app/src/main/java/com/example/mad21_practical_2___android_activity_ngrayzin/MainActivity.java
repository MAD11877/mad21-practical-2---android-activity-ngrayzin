package com.example.mad21_practical_2___android_activity_ngrayzin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


import java.util.EventListener;


public class MainActivity extends AppCompatActivity {

    User user = new User("rz", "desc", 1, false);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void followfunction(View view)
    {
        Button button = (Button)findViewById(R.id.button2);
        user.followed = !user.followed;
        if(user.followed)
        {
            button.setText("UNFOLLOW");
        }
        else
        {
            button.setText("FOLLOW");
        }

    }


}