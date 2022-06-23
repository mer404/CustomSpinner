package com.example.customspinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomSpinner extends BaseAdapter {
    String[] cityList;
    Context context;
    int[] image;


    public CustomSpinner(String[] cityList, int[] image, Context context) {
        this.context = context;
        this.cityList = cityList;
        this.image = image;
    }

    @Override
    public int getCount() {
        return cityList.length;
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

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.custom_spinner, null);
            TextView txtCityName = convertView.findViewById(R.id.txtCityName);
            txtCityName.setText(cityList[position]);
            ImageView imageIcon = convertView.findViewById(R.id.imageIcon);
            imageIcon.setImageResource(image[position]);
        }

        return convertView;
    }
}
