package com.example.usuario.capacitacion;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.base.dto.Usuario;
import com.example.usuario.tuto01.MainActivity;
import com.midd.comunicacion.Comunicacion;
import com.midd.login.FacadeLogin;
import com.util.LoginAsyncTask;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener , Comunicacion {

    ProgressDialog progressDialog;
    TextInputEditText login , password;


    private ProgressDialog dialog;

    AlertDialog.Builder builder;

    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        login   = findViewById(R.id.login);
        password = findViewById(R.id.password);
        buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(this);

        progressDialog = new ProgressDialog(LoginActivity.this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.setIndeterminate(true);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setMessage("Iniciando sesión por favor espere.");

        /*
        dialog = new ProgressDialog(this);
        dialog.setMessage("Descargando...");
        dialog.setTitle("Progreso");
        dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        dialog.setCancelable(false);
        */

    }

    @Override
    public void onClick(View view) {
        if( view.getId() == R.id.buttonLogin ){

            boolean status = true;

            if( login.getText().toString().trim().length() <= 0 ){
                login.setError("Este campo es obligatorio");
                status = false;
            }
            if( password.getText().toString().trim().length() <= 0 ){
                password.setError("Este campo es obligatorio");
                status = false;
            }
            if( status ){
                Usuario user = new Usuario();
                user.setCdusuario( login.getText().toString().trim() );
                user.setClave( password.getText().toString().trim() );

                LoginAsyncTask loginAsyncTask = new LoginAsyncTask();
                loginAsyncTask.setListener( this );
                loginAsyncTask.setDiaglog( progressDialog );

                loginAsyncTask.execute( user );
            }
        }

    }

    @Override
    public void validarUsuario(boolean valido) {

            if( valido ){
                Intent intent = new Intent( getApplicationContext() , MainActivity.class );
                startActivity(intent);
                finish();
            }
            else{
                runOnUiThread(new Runnable() {
                    public void run() {
                        builder = new AlertDialog.Builder( LoginActivity.this );
                        builder.setTitle("Error al iniciar sesión");
                        builder.setMessage("Vuelva a intentarlo.").show();

                    }
                });
            }

    }

}
