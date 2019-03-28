package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Second_Activity extends AppCompatActivity {
    private static final String TOTAL_COUNT = "total_count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);
        showRandomNumber();
    }
    public void showRandomNumber(){
        TextView randomView=(TextView)findViewById(R.id.textView_random);
        TextView headingView=(TextView)findViewById(R.id.textView_label);
        Intent intent=getIntent();
        int count=intent.getIntExtra(TOTAL_COUNT, 0);
        Random random=new Random();
        int randomInt=0;
        if(count>0){
            randomInt=random.nextInt(count);

        }
        String randomString=Integer.toString(randomInt);
        randomView.setText(randomString);
        headingView.setText(getString(R.string.random_heading, count));
        //finish();


    }


}
