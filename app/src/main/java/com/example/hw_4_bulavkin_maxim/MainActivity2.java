package com.example.hw_4_bulavkin_maxim;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;
//    TextView tvDesc, tvTitle, tvReyt;
//    ImageView imge;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);;
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.reyt);

        Intent intent = getIntent();
       String x = intent.getStringExtra("key");
        textView.setText(x);
//        tvTitle = findViewById(R.id.title);
//        tvDesc = findViewById(R.id.desc);
//        tvReyt = findViewById(R.id.reyt);
//        imge = findViewById(R.id.image1);
//
//        Intent intent = getIntent();
//        String img = intent.getStringExtra("key1");
//        String title = intent.getStringExtra("key4");
//        String description = intent.getStringExtra("key2");
//        String reyting = intent.getStringExtra("key3");
//
////        tvTitle.setText(title);
////        tvDesc.setText(description);
////        tvReyt.setText(reyting);
    }
}