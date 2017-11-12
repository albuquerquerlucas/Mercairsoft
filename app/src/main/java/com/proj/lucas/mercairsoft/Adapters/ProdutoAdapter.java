package com.proj.lucas.mercairsoft.Adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.proj.lucas.mercairsoft.Entities.Produto;
import com.proj.lucas.mercairsoft.R;

import java.util.List;

/**
 * Created by Lucas on 11/11/2017.
 */

public class ProdutoAdapter extends ArrayAdapter<Produto> {

    private Activity context;
    private List<Produto> produtos;

    public ProdutoAdapter(Activity context, List<Produto> produtos) {
        super(context, R.layout.item_produto_list, produtos);
        this.context = context;
        this.produtos = produtos;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.item_produto_list, null, true);

        ImageView imgFotoProdutoDetalhes = listViewItem.findViewById(R.id.imgFotoProdutoDetalhes);
        TextView nomeProdutoDetalhes = listViewItem.findViewById(R.id.nomeProdutoDetalhes);
        TextView txtFabricanteProdutoDetalhes = listViewItem.findViewById(R.id.txtFabricanteProdutoDetalhes);
        TextView txtModeloProdutoDetalhes = listViewItem.findViewById(R.id.txtModeloProdutoDetalhes);
        TextView txtDescricaoProdutoDetalhes = listViewItem.findViewById(R.id.txtDescricaoProdutoDetalhes);

        Produto produto = produtos.get(position);
        nomeProdutoDetalhes.setText(produto.getProduto());
        txtFabricanteProdutoDetalhes.setText(produto.getFabricante());
        txtModeloProdutoDetalhes.setText(produto.getModelo());
        txtDescricaoProdutoDetalhes.setText(produto.getDescricao());

        return listViewItem;
    }
}
