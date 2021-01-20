package com.example.quizzapp_mc_02;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

public class cat_grid_adaptor extends BaseAdapter {
    private List<String> catlist;

    public cat_grid_adaptor(List<String> catlist) {
        this.catlist = catlist;
    }

    @Override

    public int getCount() {
        return catlist.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
      View view;
      if(convertView==null) {
          view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cat_item_layout,parent,false);
      }
      else { view=convertView;
      }

        ((TextView) view.findViewById(R.id.catname)).setText(catlist.get(position));
        Random rnd=new Random();
        int color= Color.argb(255,rnd.nextInt(255),rnd.nextInt(255),rnd.nextInt(255));
        view.setBackgroundColor(color);
      return view;

    }
}
