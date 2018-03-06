package com.midd.login;

import android.util.Log;

import com.base.dto.Usuario;

import org.fosforito.exception.RemoteException;
import org.fosforito.remote.RemoteServices;
import org.json.JSONObject;

/**
 * Created by USUARIO on 28/02/2018.
 */

public class FacadeLogin implements IFacadeLogin {

    @Override
    public boolean getUser(Usuario usuario) {
        boolean valido = false;
        try{
            RemoteServices remoteServices = new RemoteServices("http://23.23.195.39:8080/ArcangelServerPage","org.arcangel.cmd.CmdLogin","isValid");
            StringBuffer result = remoteServices.invoke(usuario);


            JSONObject resultJSON = new JSONObject( result.toString() );

            JSONObject usuarioJSON = new JSONObject( resultJSON.getString("usuario") );

            valido = usuarioJSON.getBoolean("Valido");


        }catch(Exception e){
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return valido;
    }
}
