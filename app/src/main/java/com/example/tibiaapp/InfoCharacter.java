package com.example.tibiaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.tibiaapp.Model.Character;
import com.example.tibiaapp.Model.Characters;
import com.example.tibiaapp.Model.Data;

public class InfoCharacter extends AppCompatActivity {
    private TextView cNome;
    private TextView cLevel;
    private TextView cMundo;
    private TextView cVocacao;
    private TextView cFormerNames;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_character);

        Intent intent = getIntent();

        cNome = findViewById(R.id.character_nome);
        cLevel = findViewById(R.id.character_level);
        cMundo = findViewById(R.id.character_mundo);
        cVocacao = findViewById(R.id.character_vocacao);
        cFormerNames = findViewById(R.id.former_names);

        Data data = (Data) intent.getSerializableExtra(MainActivity.EXTRA_TIBIA);
        cNome.setText(data.getName());
        cLevel.setText(data.getLevel());
        cMundo.setText(data.getWorld());
        cVocacao.setText(data.getVocation());
        if (data.getFormerNames() != null) {
            cFormerNames.setText(data.getFormerNames().toString());
        }
        else {
            findViewById(R.id.former_names).setVisibility(View.INVISIBLE);
            findViewById(R.id.nomes_antigos_view).setVisibility(View.INVISIBLE);
        }
    }




}