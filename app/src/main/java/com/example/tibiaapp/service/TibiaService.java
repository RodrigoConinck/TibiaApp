package com.example.tibiaapp.service;

import com.example.tibiaapp.model.character.Data;
import com.example.tibiaapp.model.guild.GuildData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface TibiaService {
    @GET("/v3/character/{name}")
    Call<Data> getCharacter(@Path("name") String name);

    @GET("/v3/guild/{name}")
    Call<GuildData> getGuild(@Path("name") String name);
}
