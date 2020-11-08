package com.orhankalayci.first_java_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int _counter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _counter = 0;
    }


    public void changePic (View view) {
        _counter++;
        ImageView imageToChange = findViewById(R.id.picOfMustafa );
        if (_counter % 2 == 0) imageToChange.setImageResource(R.drawable.sandal_mustafa) ;
        else imageToChange.setImageResource(R.drawable.mustafa_sandal);

    }

}