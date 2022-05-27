package com.example.tibiaapp.Model;

import java.io.Serializable;

public class GuildData implements Serializable {
    private String name;
    private String description;
    private String founded;
    private Integer totalmembers;
    private String world;

    public GuildData(String name, String description, String founded, Integer totalmembers, String world) {
        this.name = name;
        this.description = description;
        this.founded = founded;
        this.totalmembers = totalmembers;
        this.world = world;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFoundation() {
        return founded;
    }

    public void setFoundation(String founded) {
        this.founded = founded;
    }

    public Integer getMembersTotal() {
        return totalmembers;
    }

    public void setMembersTotal(Integer members_total) {
        this.totalmembers = totalmembers;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    @Override
    public String toString() {
        return "GuildData{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", foundation='" + founded + '\'' +
                ", memberQty=" + totalmembers +
                ", world='" + world + '\'' +
                '}';
    }
}
