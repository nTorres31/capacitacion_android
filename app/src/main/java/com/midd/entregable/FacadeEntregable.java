package com.midd.entregable;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.base.dto.Entregables;
import com.base.dto.PlanProyecto;
import com.base.dto.Proyecto;

import org.fosforito.exception.RemoteException;
import org.fosforito.remote.RemoteServices;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by USUARIO on 1/03/2018.
 */

public class FacadeEntregable implements IFacadeEntregable {


    @Override
    public List<Entregables> GetEntregables( PlanProyecto planProyecto ) {
        List<Entregables> entregables = new ArrayList<>();
        try{

            Entregables entregable = new Entregables ();
            entregable.setNmconplan( planProyecto.getNmconplan() );

            RemoteServices remoteServices = new RemoteServices("http://23.23.195.39:8080/ArcangelServerPage","org.arcangel.cmd.proyectos.CmdEntregables" , "listar" );
            StringBuffer result = remoteServices.invoke(entregable);

            JSONObject jsonObject = new JSONObject( result.toString() );

            if( jsonObject.get("status").toString().equals("success"))
            {
                JSONArray arraylist = jsonObject.getJSONArray("arraylist");
                for ( int i = 0  ; i < arraylist.length() ; i++ )
                {
                    JSONObject obj_entregable = arraylist.getJSONObject(i);

                    Entregables entregables_temp = new Entregables();
                    entregables_temp.setDsentregable( obj_entregable.getString("Dsentregable") );
                    entregables.add(entregables_temp);
                }
            }

        }catch(Exception e){
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        return entregables;
    }
}
