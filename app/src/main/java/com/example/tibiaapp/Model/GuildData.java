package com.example.tibiaapp.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class GuildData implements Serializable {
    private String name;
    private String description;
    private String foundation;
    private Integer memberQty;
    private String world;

    public GuildData(String name, String description, String foundation, Integer memberQty, String world) {
        this.name = name;
        this.description = description;
        this.foundation = foundation;
        this.memberQty = memberQty;
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

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public Integer getMemberQty() {
        return memberQty;
    }

    public void setMemberQty(Integer memberQty) {
        this.memberQty = memberQty;
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
                ", memberQty=" + memberQty +
                ", world='" + world + '\'' +
                '}';
    }
}
