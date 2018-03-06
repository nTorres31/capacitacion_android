package com.midd.proyecto;

import android.util.Log;

import com.base.dto.PlanProyecto;
import com.base.dto.Proyecto;

import org.fosforito.exception.RemoteException;
import org.fosforito.remote.RemoteServices;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by USUARIO on 28/02/2018.
 */

public class FacadePlanProyecto implements IFacadePlanProyecto {


    @Override
    public List<PlanProyecto> GetPlanProyectos(Proyecto proyecto) {

        List<PlanProyecto> list = new ArrayList<>();
        try{
            PlanProyecto planProyecto = new PlanProyecto();
            planProyecto.setNmconproyecto( Long.parseLong(proyecto.getNmconproyecto()) );

            RemoteServices remoteServices = new RemoteServices("http://23.23.195.39:8080/ArcangelServerPage","org.arcangel.cmd.proyectos.CmdPlanProyecto","listarXproyecto");
            StringBuffer result = remoteServices.invoke(planProyecto);

            JSONObject jsonObject = new JSONObject( result.toString() );

            if( jsonObject.get("status").toString().equals("success"))
            {
                JSONArray arraylist = jsonObject.getJSONArray("arraylist");
                for ( int i = 0  ; i < arraylist.length() ; i++ )
                {
                    JSONObject plan_proyecto = arraylist.getJSONObject(i);

                    PlanProyecto plan_proyecto_temp = new PlanProyecto();
                    plan_proyecto_temp.setDsplan( plan_proyecto.getString("Dsplan") );
                    plan_proyecto_temp.setNmconplan( Long.parseLong(plan_proyecto.getString("Nmconplan")));
                    list.add(plan_proyecto_temp);
                }
            }

        }catch(Exception e){
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return list;
    }
}
