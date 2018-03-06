package com.example.usuario.capacitacion;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;

import com.adapter.EntregableAdapter;
import com.adapter.PlanProyectoAdapter;
import com.adapter.ProyectoAdapter;
import com.base.dto.Entregables;
import com.base.dto.PlanProyecto;
import com.base.dto.Proyecto;
import com.midd.entregable.FacadeEntregable;
import com.midd.proyecto.FacadePlanProyecto;
import com.midd.proyecto.FacadeProyecto;

import java.util.Calendar;
import java.util.List;

public class TaskTimeDataActivity extends AppCompatActivity {

    Spinner list_proyectos , list_plan_proyectos , list_entregable;
    EditText txtFecha;

    public final Calendar c = Calendar.getInstance();

    final int mes = c.get(Calendar.MONTH);
    final int dia = c.get(Calendar.DAY_OF_MONTH);
    final int anio = c.get(Calendar.YEAR);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_time_data);

        list_proyectos = (Spinner) findViewById(R.id.list_proyects);
        list_plan_proyectos = (Spinner) findViewById(R.id.list_plan_proyectos);
        list_entregable = (Spinner) findViewById(R.id.list_entregable);
        txtFecha = (EditText) findViewById(R.id.txtFecha);

        List<Proyecto> proyectoList = new FacadeProyecto( getApplicationContext() ).GetProyectos();
        FillProyectos( proyectoList );

        list_proyectos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if( position > 0 ){
                    Proyecto proyecto = (Proyecto) adapterView.getItemAtPosition(position);
                    FillPlanProyectos ( new FacadePlanProyecto().GetPlanProyectos( proyecto ));
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        list_plan_proyectos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if( position > 0 ){
                    PlanProyecto planProyecto = (PlanProyecto) adapterView.getItemAtPosition(position);
                    FillEntregable ( new FacadeEntregable().GetEntregables( planProyecto ) );
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        txtFecha.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                obtenerFecha();
            }
        });

    }
    public void FillProyectos( List<Proyecto> proyectoList ){

        ProyectoAdapter proyectoAdapter = new ProyectoAdapter( getApplicationContext() , android.R.layout.simple_spinner_item , proyectoList );
        list_proyectos.setAdapter(proyectoAdapter);
    }
    public void FillPlanProyectos( List<PlanProyecto> planProyectos ){

        PlanProyectoAdapter proyectoAdapter = new PlanProyectoAdapter( getApplicationContext() , android.R.layout.simple_spinner_item , planProyectos );
        list_plan_proyectos.setAdapter(proyectoAdapter);
    }
    public void FillEntregable( List<Entregables> entregables ){

        EntregableAdapter entregableAdapter = new EntregableAdapter( getApplicationContext() , android.R.layout.simple_spinner_item , entregables );
        list_entregable.setAdapter(entregableAdapter);
    }

    private void obtenerFecha(){
        DatePickerDialog recogerFecha = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth) {
                month++;
                txtFecha.setText(dayOfMonth + "/" + month + "/" + year);
            }
        },anio, mes, dia);
        recogerFecha.show();

    }

}
