package com.example.quizzapp_mc_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.List;

public class catagory_activity extends AppCompatActivity {
 private GridView catGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_catagory_activity);
        Toolbar toolbar=findViewById(R.id.toolbar);
       setSupportActionBar(toolbar);
       getSupportActionBar().setTitle("catagories");
       getSupportActionBar().setDisplayHomeAsUpEnabled(true);

       catGrid= findViewById(R.id.catgrid);
       List<String> catlist=new ArrayList<>();
       catlist.add("cat1");
        catlist.add("cat2");
        catlist.add("cat3");
        catlist.add("cat4");
        catlist.add("cat5");
        catlist.add("cat6");

 cat_grid_adaptor adaptor=new cat_grid_adaptor(catlist);
 catGrid.setAdapter(adaptor);

    }
}