package com.example.tibiaapp.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class GuildData implements Serializable {
    private String name;
    private String description;
    private String foundation;
    private Integer membersTotal;
    private String world;

    public GuildData(String name, String description, String foundation, Integer members_total, String world) {
        this.name = name;
        this.description = description;
        this.foundation = foundation;
        this.membersTotal = members_total;
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
        return foundation;
    }

    public void setFoundation(String founded) {
        this.foundation = founded;
    }

    public Integer getMembersTotal() {
        return membersTotal;
    }

    public void setMembersTotal(Integer members_total) {
        this.membersTotal = members_total;
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
                ", foundation='" + foundation + '\'' +
                ", memberQty=" + membersTotal +
                ", world='" + world + '\'' +
                '}';
    }
}
