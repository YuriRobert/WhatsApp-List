package com.yuri.whatsapplist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.yuri.whatsapplist.Model.Usuario;
import com.yuri.whatsapplist.adapter.AdapterUsuario;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler_usuarios;
    private List<Usuario> usuarioList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recuperando id
        recycler_usuarios = findViewById(R.id.recycler_usuarios);
        //Definindo formato da lista
        recycler_usuarios.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false));
        //melhora o desempenho da lista
        recycler_usuarios.setHasFixedSize(true);
        AdapterUsuario adapterUsuario = new AdapterUsuario(usuarioList);
        // setando o adapter
        recycler_usuarios.setAdapter(adapterUsuario);

        Usuarios();

    }

    public void Usuarios() {
        Usuario usuario1 = new Usuario(R.drawable.usuario1, "Pedro", "Olá como vai ?");
        usuarioList.add(usuario1);

        Usuario usuario2 = new Usuario(R.drawable.usuario2, "Bruna", "Olá como vai ?");
        usuarioList.add(usuario2);

        Usuario usuario3 = new Usuario(R.drawable.usuario1, "Pedro", "Vou na sua casa amanhã");
        usuarioList.add(usuario3);

        Usuario usuario4 = new Usuario(R.drawable.usuario2, "Bianca", "Eu estou bem e voçê ?");
        usuarioList.add(usuario4);

        Usuario usuario5 = new Usuario(R.drawable.usuario1, "João da Silva", "Oi");
        usuarioList.add(usuario5);

        Usuario usuario6 = new Usuario(R.drawable.usuario2, "Maria Clara", "Vamos ao shopping depois do almoço ?");
        usuarioList.add(usuario6);

        Usuario usuario7 = new Usuario(R.drawable.usuario1, "Claber", "Como voçê esta ?");
        usuarioList.add(usuario7);

        Usuario usuario8 = new Usuario(R.drawable.usuario2, "Leticia", "Muito Obrigada");
        usuarioList.add(usuario8);

        Usuario usuario9 = new Usuario(R.drawable.usuario1, "Felipe Rodrigues", "Eu curti demais");
        usuarioList.add(usuario9);

        Usuario usuario10 = new Usuario(R.drawable.usuario2, "Janaina", "Bom fim de semana para voçê");
        usuarioList.add(usuario10);

        Usuario usuario11 = new Usuario(R.drawable.usuario1, "Mario", "Vamos amanhã");
        usuarioList.add(usuario11);

        Usuario usuario12 = new Usuario(R.drawable.usuario2, "ana", "Oi");
        usuarioList.add(usuario12);



    }


}
