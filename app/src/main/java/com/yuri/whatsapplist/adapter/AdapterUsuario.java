package com.yuri.whatsapplist.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yuri.whatsapplist.Model.Usuario;
import com.yuri.whatsapplist.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterUsuario extends RecyclerView.Adapter<AdapterUsuario.UsuarioViewHolder> {

    public AdapterUsuario(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    //criando array de tamanho indeterminado
    private List<Usuario> usuarioList = new ArrayList();

    @NonNull
    @Override
    //cria a view
    public UsuarioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista;
        //recuperando o contexto
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        itemLista = layoutInflater.inflate(R.layout.usuario_item, parent, false);
        return new UsuarioViewHolder(itemLista);
    }

    @Override
    //exibe a view
    public void onBindViewHolder(@NonNull UsuarioViewHolder holder, int position) {

        //usando a propriedade position para identificar em qual posição o array está
        holder.foto.setImageResource(usuarioList.get(position).getFoto());
        holder.nome.setText(usuarioList.get(position).getNome());
        holder.mensagem.setText(usuarioList.get(position).getMensagem());

    }

    @Override
    //tamanho total da lista
    public int getItemCount() {
        //vai saber o tamanho total da lista
        return usuarioList.size();
    }

    public class UsuarioViewHolder extends RecyclerView.ViewHolder {

        private ImageView foto;
        private TextView nome;
        private TextView mensagem;

        public UsuarioViewHolder(@NonNull View itemView) {
            super(itemView);

            //recuperando id
            foto = itemView.findViewById(R.id.foto_usuario);
            nome = itemView.findViewById(R.id.nome_usuario);
            mensagem = itemView.findViewById(R.id.mensagem_usuario);

        }
    }
}
