package com.example.tibiaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoCharacterQuery(View view) {
        Intent i = new Intent(getApplicationContext(),CharacterQuery.class);
        startActivity(i);
    }

    public void gotoGuildQuery(View view) {
        Intent i = new Intent(getApplicationContext(),GuildQuery.class);
        startActivity(i);
    }
}