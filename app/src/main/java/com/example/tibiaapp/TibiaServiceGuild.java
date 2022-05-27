package com.example.tibiaapp;

import com.example.tibiaapp.Model.Character;
import com.example.tibiaapp.Model.Guild;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface TibiaServiceGuild {
    @GET("{name}.json")
    Call<Guild> getGuild(@Path("name") String name);
}
