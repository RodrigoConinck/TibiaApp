package com.example.tibiaapp.Model;

import java.io.Serializable;

public class Guild implements Serializable {
    private String name;
    private String rank;

    public Guild(String guildName, String guildRank) {
        this.name = name;
        this.rank = rank;
    }

    public String getGuildName() {
        return name;
    }

    public void setGuildName(String name) {
        this.name = name;
    }

    public String getGuildRank() {
        return rank;
    }

    public void setGuildRank(String guildRank) {
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
