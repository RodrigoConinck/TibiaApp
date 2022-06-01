package com.example.tibiaapp.Model;

import java.io.Serializable;

public class CharacterGuild implements Serializable {
    private String name;
    private String rank;

    public CharacterGuild(String guildName, String guildRank) {
        this.name = name;
        this.rank = rank;
    }

    public String getCGuildName() {
        return name;
    }

    public void setCGuildName(String name) {
        this.name = name;
    }

    public String getCGuildRank() {
        return rank;
    }

    public void setCGuildRank(String guildRank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Guild{" +
                ", name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}