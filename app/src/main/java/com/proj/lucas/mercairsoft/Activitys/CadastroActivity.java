package com.proj.lucas.mercairsoft.Activitys;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.proj.lucas.mercairsoft.R;

public class CadastroActivity extends Activity {

    private ImageView imgFotoUsuario;
    private EditText edtNomeUsuarioCadastro, edtEmailUsuarioCadastro, edtSenhaUsuarioCadastro;
    private Button btnSalvarUsuarioCadastro, btnLimparCamposCadastro;
    private String fotoUsuario, nomeUsuario, emailUsuario, senhaUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        imgFotoUsuario = findViewById(R.id.imgFotoUsuario);
        edtNomeUsuarioCadastro = findViewById(R.id.edtNomeUsuarioCadastro);
        nomeUsuario = edtNomeUsuarioCadastro.getText().toString().trim();
        edtEmailUsuarioCadastro = findViewById(R.id.edtEmailUsuarioCadastro);
        emailUsuario = edtEmailUsuarioCadastro.getText().toString().trim();
        edtSenhaUsuarioCadastro = findViewById(R.id.edtSenhaUsuarioCadastro);
        senhaUsuario = edtSenhaUsuarioCadastro.getText().toString().trim();
        btnSalvarUsuarioCadastro = findViewById(R.id.btnSalvarUsuarioCadastro);
        btnLimparCamposCadastro = findViewById(R.id.btnLimparCamposCadastro);

        imgFotoUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aqui vai carregar a foto
            }
        });

        btnSalvarUsuarioCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!edtNomeUsuarioCadastro.getText().toString().equals("") &&
                        !edtEmailUsuarioCadastro.getText().toString().equals("") &&
                            !edtSenhaUsuarioCadastro.getText().toString().equals("")){
                    salvarUsuario();
                }else{
                    Toast.makeText(getApplicationContext(), "Preencha os campos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnLimparCamposCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgFotoUsuario.setImageDrawable(getDrawable(R.drawable.addfoto));
                edtNomeUsuarioCadastro.setText("");
                edtEmailUsuarioCadastro.setText("");
                edtSenhaUsuarioCadastro.setText("");
            }
        });
    }

    private void salvarUsuario(){
        goToLogin();
    }

    private void goToLogin(){
        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        goToLogin();
    }
}
