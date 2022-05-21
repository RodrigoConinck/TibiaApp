package com.example.tibiaapp.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Data implements Serializable {
    private String name;
    private String level;
    private String world;
    private String vocation;
    @SerializedName("former_names")
    private List<String> formerNames;
    private Guild guild;

    public Data(Guild guild) {
        this.guild = guild;
    }

    public Guild getGuild() {
        return guild;
    }

    public void setGuild(Guild guild) {
        this.guild = guild;
    }

    public Data(String name, String level, String world, String vocation, List<String> formerNames, String guildName, String guildRank) {
        this.name = name;
        this.level = level;
        this.world = world;
        this.vocation = vocation;
        this.formerNames = formerNames;
    }

    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }

    public String getWorld() {
        return world;
    }

    public String getVocation() {
        return vocation;
    }

    public List<String> getFormerNames() {
        return formerNames;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    public void setVocation(String vocation) {
        this.vocation = vocation;
    }

    public void setFormerNames(List<String> formerNames) {
        this.formerNames = formerNames;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", world='" + world + '\'' +
                ", vocation='" + vocation + '\'' +
                ", formerNames=" + formerNames +
                ", guild=" + guild +
                '}';
    }
}
