package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View v){
        this.opcaoSelecionada("pedra");
    }
    public void selecionadoTesoura(View v){
        this.opcaoSelecionada("tesoura");
    }
    public void selecionadoPapel(View v){
        this.opcaoSelecionada("papel");
    }

    public void opcaoSelecionada(String opcaoSelecionada){

        ImageView imageResultado = findViewById(R.id.imageResultado);

        String[]  opcoes = {"pedra", "tesoura", "pepel"};
        int numero = new Random().nextInt(3);
        String opcoesApp = opcoes[numero];

        switch (opcoesApp){
            case "pedra":
                imageResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imageResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imageResultado.setImageResource(R.drawable.tesoura);
                break;
        }
    }

}