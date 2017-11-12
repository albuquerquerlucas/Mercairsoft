package com.proj.lucas.mercairsoft.Activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.proj.lucas.mercairsoft.R;

public class NovoProdutoActivity extends AppCompatActivity {

    private ImageView imgFotoProdutoCadastro;
    private EditText edtProdutoCadastro, edtModeloCadastro, edtFabricanteCadastro, edtValorCadastro, edtDescricaoCadastro;
    private Button btnSalvarProdutoCadastro, btnLimparCamposProdutoCadastro;
    private String fotoProduto, nomeProduto, modeloProduto, fabricanteProduto, valorProduto, descricaoProduto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_produto);

        imgFotoProdutoCadastro = findViewById(R.id.imgFotoProdutoCadastro);
        edtProdutoCadastro = findViewById(R.id.edtProdutoCadastro);
        nomeProduto = edtProdutoCadastro.getText().toString().trim();
        edtModeloCadastro = findViewById(R.id.edtModeloCadastro);
        modeloProduto = edtModeloCadastro.getText().toString().trim();
        edtFabricanteCadastro = findViewById(R.id.edtFabricanteCadastro);
        fabricanteProduto = edtFabricanteCadastro.getText().toString().trim();
        edtValorCadastro = findViewById(R.id.edtValorCadastro);
        valorProduto = edtValorCadastro.getText().toString().trim();
        edtDescricaoCadastro = findViewById(R.id.edtDescricaoCadastro);
        descricaoProduto = edtDescricaoCadastro.getText().toString().trim();
        btnSalvarProdutoCadastro = findViewById(R.id.btnSalvarProdutoCadastro);
        btnLimparCamposProdutoCadastro = findViewById(R.id.btnLimparCamposProdutoCadastro);

        imgFotoProdutoCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aqui implementação da foto
            }
        });

        btnSalvarProdutoCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!edtProdutoCadastro.getText().toString().equals("") &&
                        !edtModeloCadastro.getText().toString().equals("") &&
                            !edtFabricanteCadastro.getText().toString().equals("") &&
                                !edtValorCadastro.getText().toString().equals("") &&
                                    !edtDescricaoCadastro.getText().toString().equals("")){
                    salvarProduto();
                }else{
                    Toast.makeText(getApplicationContext(), "Preencha os campos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnLimparCamposProdutoCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgFotoProdutoCadastro.setImageDrawable(getDrawable(R.drawable.addfoto));
                edtProdutoCadastro.setText("");
                edtModeloCadastro.setText("");
                edtFabricanteCadastro.setText("");
                edtValorCadastro.setText("");
                edtDescricaoCadastro.setText("");
            }
        });
    }

    private void salvarProduto(){
        goToMenu();
    }

    private void goToMenu(){
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        goToMenu();
    }
}
