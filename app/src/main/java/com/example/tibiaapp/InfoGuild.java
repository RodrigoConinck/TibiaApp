package com.example.tibiaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tibiaapp.Model.Data;

public class InfoGuild extends AppCompatActivity {
    private TextView gName;
    private TextView gDescription;
    private TextView gFoundation;
    private TextView gMemberQty;
    private TextView gWorld;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_character);

        Intent intent = getIntent();

        gName = findViewById(R.id.guild_name);
        gDescription = findViewById(R.id.guild_description);
        gFoundation = findViewById(R.id.guild_foundation);
        gMemberQty = findViewById(R.id.guild_members);
        gWorld = findViewById(R.id.guild_world);


        Data data = (Data) intent.getSerializableExtra(GuildQuery.EXTRA_TIBIA);
        gName.setText(data.getName());
        gDescription.setText(data.getLevel());
        gWorld.setText(data.getWorld());
        gFoundation.setText(data.getVocation());
        gMemberQty.setText(data.getVocation());
    }


    public void finishActivity(View view) {
        this.finish();
    }
}