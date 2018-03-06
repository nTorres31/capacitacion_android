package com.midd.proyecto;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

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

public class FacadeProyecto implements IFacadeProyecto {
  
    @Override
    public List<Proyecto> GetProyectos() {
        List<Proyecto> list = new ArrayList<>();
        try{

           RemoteServices remoteServices = new RemoteServices("http://23.23.195.39:8080/ArcangelServerPage","org.arcangel.cmd.proyectos.CmdProyectos" , "listar" );
           StringBuffer result = remoteServices.invoke(null);

           JSONObject jsonObject = new JSONObject( result.toString() );

           if( jsonObject.getString("status").equals("success") )
           {
               JSONArray arraylist = jsonObject.getJSONArray("arraylist");


               Proyecto proyecto_temp = new Proyecto();

               proyecto_temp.setDsproyecto( "Seleccione..." );
               proyecto_temp.setNmconproyecto( null );
               list.add(proyecto_temp);

               for ( int i = 0  ; i < arraylist.length() ; i++ )
               {
                   JSONObject proyectoObject = arraylist.getJSONObject(i);

                   proyecto_temp = new Proyecto();

                   proyecto_temp.setDsproyecto( proyectoObject.getString("Dsproyecto") );
                   proyecto_temp.setNmconproyecto( proyectoObject.getString("Nmconproyecto"));
                   list.add(proyecto_temp);
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
