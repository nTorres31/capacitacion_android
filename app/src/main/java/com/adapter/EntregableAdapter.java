package com.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.base.dto.Entregables;
import com.base.dto.PlanProyecto;

import java.util.List;

/**
 * Created by USUARIO on 1/03/2018.
 */

public class EntregableAdapter extends ArrayAdapter<Entregables> {

    private Context context;
    private List<Entregables> values;

    public EntregableAdapter(Context context, int textViewResourceId, List<Entregables> values)
    {
        super(context, textViewResourceId, values);
        this.context = context;
        this.values = values;
    }
    public int getCount()
    {
        return values.size();
    }

    public Entregables getItem(int position)
    {
        return values.get(position);
    }

    public long getItemId(int position)
    {
        return position;
    }

    public List<Entregables> getItems()
    {
        return this.values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        TextView label = new TextView(context);
        label.setTextColor(Color.BLACK);
        label.setText(values.get(position).getDsentregable() );
        return label;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent)
    {
        TextView label = new TextView(context);
        label.setPadding(10,20,5,20);
        label.setTextColor(Color.BLACK);
        label.setText(values.get(position).getDsentregable());

        return label;
    }
}
