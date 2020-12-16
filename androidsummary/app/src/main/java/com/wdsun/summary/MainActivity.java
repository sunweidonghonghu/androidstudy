package com.wdsun.summary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.wdsun.summary.kotlin.KotlinActivity;

public class MainActivity extends AppCompatActivity {

    TextView kotlin_TextView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kotlin_TextView =  this.findViewById(R.id.kotlin_TextView) ;
        kotlin_TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(  new Intent(MainActivity.this, KotlinActivity.class));
            }
        });
    }
}
