package com.example.tibiaapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tibiaapp.model.guild.GuildData;
import com.example.tibiaapp.service.TibiaApiClient;
import com.example.tibiaapp.service.TibiaService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GuildQuery extends AppCompatActivity {
    public static final String TAG = "GuildSearch";
    private GuildData guild;
    public static final int TEXT_REQUEST = 1;
    public static final String EXTRA_TIBIA = "EXTRA_TIBIA";
    private EditText guildName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guild_query);
        guildName = findViewById(R.id.edit_guild_name);
    }

    public void finishActivity(View view) {
        this.finish();
    }

    public void infoGuild(View view) {
        String name = guildName.getText().toString();
        if (name.equals("")){
            Toast.makeText(this, "Insira o nome da guilda.", Toast.LENGTH_SHORT).show();
            Log.d(TAG, "infoGuild: Nome da guild Vazio");
        }
        else {
            name = name.replace(' ', '+');
            TibiaService service = TibiaApiClient.getClient().create(TibiaService.class);
            Call<GuildData> call = service.getGuild(name);
            call.enqueue(new Callback<GuildData>() {
                @Override
                public void onResponse(Call<GuildData> call, Response<GuildData> response) {
                    guild = response.body();
                    Log.d(TAG, "onResponse: " + guild);

                    if (guild.getGuilds().getGuild().getName()==null){
                        Toast.makeText(getApplicationContext(), "Essa guilda não existe.", Toast.LENGTH_LONG).show();
                        Log.d(TAG, "onResponse: Não existe");
                    }
                    else {
                        Intent intent = new Intent(getApplicationContext(), InfoGuild.class);
                        intent.putExtra(EXTRA_TIBIA, guild.getGuilds().getGuild());
                        startActivity(intent);
                    }
                }

                @Override
                public void onFailure(Call<GuildData> call, Throwable t) {
                    Log.e(TAG, "onFailure: " + t.toString(), t);
                }
            });
        }
    }
}