package com.example.tibiaapp.Model;

import java.io.Serializable;

public class Character implements Serializable {
    private Characters characters;

    public Character(Characters characters) {
        this.characters = characters;
    }

    public Characters getCharacters() {
        return characters;
    }

    public void setCharacters(Characters characters) {
        this.characters = characters;
    }

    @Override
    public String toString() {
        return "Characters{" +
                "characters=" + characters +
                '}';
    }
}
