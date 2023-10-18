package com.example.mid_198_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button rotation;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rotation = (Button) findViewById(R.id.rotation);
        img = (ImageView) findViewById(R.id.img);

        img.setImageResource(R.drawable.daramg);

        rotation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setRotation(10);
            }
        });






    }
}