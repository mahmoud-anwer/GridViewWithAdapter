package com.example.gridviewwithadapter.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.gridviewwithadapter.R;
import com.example.gridviewwithadapter.data.ImageAssets;
import com.example.gridviewwithadapter.ui.GridViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    GridViewAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Integer> headsIds = ImageAssets.heads;

        gridView = (GridView) findViewById(R.id.gridview_items);
        adapter = new GridViewAdapter(this, headsIds);
        gridView.setAdapter(adapter);

    }
}
