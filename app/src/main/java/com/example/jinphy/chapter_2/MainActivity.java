package com.example.jinphy.chapter_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = ((TextView) findViewById(R.id.text_view));
        textView.setOnClickListener(this::onClick);
    }


    public void onClick(View view) {

    }
}
