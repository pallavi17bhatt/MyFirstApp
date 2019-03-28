package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TOTAL_COUNT = "total_count";
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void toastMe(View v){
       Toast myToast= Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT);
       myToast.show();
    }
    public void countMe(View v){
        t= (TextView)findViewById(R.id.textView2);
        String countString=t.getText().toString();
        Integer count=Integer.parseInt(countString);
        count++;
        t.setText(count.toString());
    }
    public void randomMe(View v){
        Intent randomIntent=new Intent(this, Second_Activity.class);
        startActivity(randomIntent);
        TextView newCountTextView=(TextView)findViewById(R.id.textView2);
        String countString=newCountTextView.getText().toString();
        Integer newCount=Integer.parseInt(countString);
        randomIntent.putExtra(TOTAL_COUNT, newCount);
        startActivity(randomIntent);
        //Toast myToast2= Toast.makeText(this, newCount.toString(), Toast.LENGTH_SHORT);
       // myToast2.show();
       //newCountTextView.setText(newCount.toString());




    }
}

