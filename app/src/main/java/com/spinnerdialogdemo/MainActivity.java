package com.spinnerdialogdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        tv=(TextView)findViewById(R.id.textView);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDatePicker mp=new myDatePicker();
                mp.show(getSupportFragmentManager(),"me_date_picker");
            }
        });
    }
    //смотреть stlyes
}
