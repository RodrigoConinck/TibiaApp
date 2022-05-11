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
    private String guild;
    private String guildRank;

    public Data(String name, String level, String world, String vocation, List<String> formerNames, String guild, String guildRank) {
        this.name = name;
        this.level = level;
        this.world = world;
        this.vocation = vocation;
        this.formerNames = formerNames;
        this.guild = guild;
        this.guildRank = guildRank;
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

    public String getGuild() {
        return guild;
    }

    public String getGuildRank() {
        return guildRank;
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

    public void setGuild(String guild) {
        this.guild = guild;
    }

    public void setGuildRank(String guildRank) {
        this.guildRank = guildRank;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", world='" + world + '\'' +
                ", vocation='" + vocation + '\'' +
                ", formerNames=" + formerNames + '\'' +
                ", guild= " + guild + '\'' +
                ", guildRank=" + guildRank +
                '}';
    }
}
