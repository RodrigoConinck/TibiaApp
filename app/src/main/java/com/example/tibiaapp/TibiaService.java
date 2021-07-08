package com.example.tibiaapp;

import com.example.tibiaapp.Model.Character;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface TibiaService {
    @GET("{name}.json")
    Call<Character> getCharacter(@Path("name") String name);
}
