package com.example.tibiaapp.Model;

public class Guilds {
    private GuildData data;

    public Guilds(GuildData data) {
        this.data = data;
    }

    public GuildData getData() {
        return data;
    }

    public void setData(GuildData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Guilds{" +
                "data=" + data +
                '}';
    }
}
