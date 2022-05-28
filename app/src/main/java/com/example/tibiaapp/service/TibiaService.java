package com.example.tibiaapp.service;

import com.example.tibiaapp.Model.Character;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface TibiaService {
    @GET("/v2/characters/{name}.json")
    Call<Character> getCharacter(@Path("name") String name);
}
