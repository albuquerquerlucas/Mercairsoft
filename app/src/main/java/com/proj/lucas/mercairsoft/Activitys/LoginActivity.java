package com.proj.lucas.mercairsoft.Activitys;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.proj.lucas.mercairsoft.R;

public class LoginActivity extends Activity {

    private EditText edtEmailLogin, edtSenhaLogin;
    private Button btnEntrarLogin;
    private TextView txtLinkCadastroLogin;
    private String emailLogin, senhaLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtEmailLogin = findViewById(R.id.edtEmailLogin);
        edtSenhaLogin = findViewById(R.id.edtSenhaLogin);
        emailLogin = edtEmailLogin.getText().toString().trim();
        senhaLogin = edtSenhaLogin.getText().toString().trim();

        txtLinkCadastroLogin = findViewById(R.id.txtLinkCadastroLogin);
        txtLinkCadastroLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(), CadastroActivity.class);
                startActivity(it);
                finish();
            }
        });

        btnEntrarLogin = findViewById(R.id.btnEntrarLogin);
        btnEntrarLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!edtEmailLogin.getText().toString().equals("") && !edtSenhaLogin.getText().toString().equals("")){
                    validarLogin();
                }else{
                    Toast.makeText(getApplicationContext(), "Preencha os campos.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void validarLogin(){

        goToMenu();
    }

    private void goToMenu(){
        Intent it = new Intent(getApplicationContext(), MenuActivity.class);
        startActivity(it);
        finish();
    }
}
