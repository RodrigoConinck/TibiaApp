package com.example.tibiaapp.Model;

import java.io.Serializable;

public class Guild implements Serializable {
    private Guilds guilds;

    public Guild(Guilds guilds) {
        this.guilds = guilds;
    }

    public Guilds getGuilds() {
        return guilds;
    }

    public void setGuilds(Guilds guilds) {
        this.guilds = guilds;
    }

    @Override
    public String toString() {
        return "Character{" +
                "characters=" + guilds +
                '}';
    }
}
