package com.example.quizzapp_mc_02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView title;
private Button start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title=findViewById(R.id.main_title);
        start=findViewById(R.id.main_start);
        Typeface typeface = ResourcesCompat.getFont(this, R.font.pacifico);
        title.setTypeface(typeface);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
  Intent intent=new Intent(MainActivity.this,catagory_activity.class);
  startActivity(intent);
            }
        });
    }
}