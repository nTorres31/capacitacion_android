package com.util;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.util.Log;

import com.base.dto.Usuario;
import com.midd.comunicacion.Comunicacion;
import com.midd.login.FacadeLogin;

/**
 * Created by USUARIO on 2/03/2018.
 */

//Parameter ,
public class LoginAsyncTask extends AsyncTask<Usuario, Float, Integer> {


    private Comunicacion listener;
    private ProgressDialog progressDialog;

    public void setListener( Comunicacion listener  ) {
        this.listener = listener;
    }
    public void setDiaglog( ProgressDialog progressDialog ){
        this.progressDialog = progressDialog;
    }

    @Override
    protected Integer doInBackground(Usuario... usuarios)
    {
        boolean valido = new FacadeLogin().getUser( usuarios[0] );

        this.listener.validarUsuario(valido);

            /*

            for (int i = 0; i < 50; i++)
            {
                try
                {
                    Thread.sleep(100);
                    publishProgress(i/(float)50);
                }
                catch (InterruptedException e) {}

            }
            */

        return 0;
    }


    @Override
    protected void onPreExecute() {

        progressDialog.show();
            /*
            dialog.setProgress(0);
            dialog.setMax(100);
            dialog.show();
            */
    }
    @Override
    protected void onProgressUpdate (Float... valores){
        //int p = Math.round(100*valores[0]);
        //dialog.setProgress(p);
    }

    @Override
    protected void onPostExecute (Integer bytes){
        //dialog.dismiss();
        progressDialog.dismiss();


    }

}
