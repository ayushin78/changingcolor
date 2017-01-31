package com.example.dell1.changingcolor;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends Activity {

RelativeLayout background;
    Button greenbtn;
    Button bluebtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        background=(RelativeLayout) findViewById(R.id.background);
        greenbtn=(Button) findViewById(R.id.grnbtn);
        bluebtn=(Button) findViewById(R.id.blubtn);

        greenbtn.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                background.setBackground(getResources().getDrawable(R.drawable.pic));
            }
        });

        bluebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                background.setBackgroundColor(Color.parseColor("blue"));
            }
        });


    }
}
