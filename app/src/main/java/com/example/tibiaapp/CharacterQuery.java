package com.example.tibiaapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tibiaapp.model.character.Data;
import com.example.tibiaapp.service.TibiaApiClient;
import com.example.tibiaapp.service.TibiaService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CharacterQuery extends AppCompatActivity {
    public static final String TAG = "CharacterSearch";
    private Data character;
    public static final int TEXT_REQUEST = 1;
    public static final String EXTRA_TIBIA = "EXTRA_TIBIA";
    private EditText characterName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.character_query);
        characterName = findViewById(R.id.edit_character_name);
    }

    public void finishActivity(View view) {
        this.finish();
    }

    public void infoCharacter(View view) {
        String name = characterName.getText().toString();
        if (name.equals("")){
            Toast.makeText(this, "Entre um nome.", Toast.LENGTH_SHORT).show();
            Log.d(TAG, "infoCharacter: Nome Vazio");
        }
        else {
            name = name.replace(' ', '+');
            TibiaService service = TibiaApiClient.getClient().create(TibiaService.class);
            Call<Data> call = service.getCharacter(name);
            call.enqueue(new Callback<Data>() {
                @Override
                public void onResponse(Call<Data> call, Response<Data> response) {
                    character = response.body();
                    Log.d(TAG, "onResponse: " + character);

                    if (character.getCharacters().getCharacter().getName()==null){
                        Toast.makeText(getApplicationContext(), "Esse personagem não existe.", Toast.LENGTH_LONG).show();
                        Log.d(TAG, "onResponse: Não existe");
                    }
                    else {
                        Intent intent = new Intent(getApplicationContext(), InfoCharacter.class);
                        intent.putExtra(EXTRA_TIBIA, character.getCharacters().getCharacter());
                        startActivity(intent);
                    }
                }

                @Override
                public void onFailure(Call<Data> call, Throwable t) {
                    Log.e(TAG, "onFailure: " + t.toString(), t);
                }
            });
        }
    }
}