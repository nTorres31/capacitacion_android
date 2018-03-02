package com.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.base.dto.Proyecto;
import com.example.usuario.tuto01.R;

import java.util.List;

/**
 * Created by USUARIO on 1/03/2018.
 */

public class ProyectoAdapter extends ArrayAdapter<Proyecto> {

    private Context context;
    private List<Proyecto> values;

    public ProyectoAdapter(Context context, int textViewResourceId, List<Proyecto> values)
    {
        super(context, textViewResourceId, values);
        this.context = context;
        this.values = values;
    }
    public int getCount()
    {
        return values.size();
    }

    public Proyecto getItem(int position)
    {
        return values.get(position);
    }

    public long getItemId(int position)
    {
        return position;
    }

    public List<Proyecto> getItems()
    {
        return this.values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        TextView label = new TextView(context);
        label.setTextColor(Color.BLACK);
        label.setText(values.get(position).getDsproyecto() );
        return label;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent)
    {
        TextView label = new TextView(context);
        label.setPadding(10,20,5,20);
        label.setTextColor(Color.BLACK);
        label.setText(values.get(position).getDsproyecto());

        return label;
    }
}
