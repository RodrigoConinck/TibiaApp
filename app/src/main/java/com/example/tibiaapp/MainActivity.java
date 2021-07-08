package com.example.tibiaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tibiaapp.Model.Character;
import com.example.tibiaapp.Model.Data;
import com.example.tibiaapp.service.TibiaApiClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";
    private Character character;
    public static final int TEXT_REQUEST = 1;
    public static final String EXTRA_TIBIA = "EXTRA_TIBIA";
    private EditText characterName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        characterName = findViewById(R.id.edit_character_name);
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
            Call<Character> call = service.getCharacter(name);
            call.enqueue(new Callback<Character>() {
                @Override
                public void onResponse(Call<Character> call, Response<Character> response) {
                    character = response.body();
                    Log.d(TAG, "onResponse: " + character);

                    if (character.getCharacters().getData().getName()==null){
                        Toast.makeText(getApplicationContext(), "Esse personagem não existe.", Toast.LENGTH_LONG).show();
                        Log.d(TAG, "onResponse: Não existe");
                    }
                    else {
                        Intent intent = new Intent(getApplicationContext(), InfoCharacter.class);
                        intent.putExtra(EXTRA_TIBIA, character.getCharacters().getData());
                        startActivity(intent);
                    }
                }

                @Override
                public void onFailure(Call<Character> call, Throwable t) {
                    Log.e(TAG, "onFailure: " + t.toString(), t);
                }
            });
        }
    }
}