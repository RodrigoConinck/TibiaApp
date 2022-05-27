package com.example.tibiaapp.Model;

import java.io.Serializable;

public class GuildData implements Serializable {
    private String name;
    private String description;
    private String founded;
    private Integer members_total;
    private String world;

    public GuildData(String name, String description, String founded, Integer members_total, String world) {
        this.name = name;
        this.description = description;
        this.founded = founded;
        this.members_total = members_total;
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
        return members_total;
    }

    public void setMembersTotal(Integer members_total) {
        this.members_total = members_total;
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
                ", memberQty=" + members_total +
                ", world='" + world + '\'' +
                '}';
    }
}
