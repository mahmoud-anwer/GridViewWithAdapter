package com.example.gridviewwithadapter.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.gridviewwithadapter.R;

import java.util.List;
import java.util.zip.Inflater;

public class GridViewAdapter extends BaseAdapter {

    private Context context;
    private List<Integer> imagesIds;
    // inflater turns xml file into view
    private LayoutInflater inflater;

    public GridViewAdapter(Context context, List<Integer> imagesIds) {
        this.context = context;
        this.imagesIds = imagesIds;

    }

    @Override
    public int getCount() {
        return imagesIds.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){

            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.custome_imageview, null);
        }

        ImageView imageView = convertView.findViewById(R.id.imageview);
        imageView.setImageResource(imagesIds.get(position));

        return convertView;
    }
}
