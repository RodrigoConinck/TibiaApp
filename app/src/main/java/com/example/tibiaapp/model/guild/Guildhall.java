
package com.example.tibiaapp.model.guild;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Guildhall implements Serializable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("paid_until")
    @Expose
    private String paidUntil;
    @SerializedName("world")
    @Expose
    private String world;
    private final static long serialVersionUID = 7681019878042604711L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaidUntil() {
        return paidUntil;
    }

    public void setPaidUntil(String paidUntil) {
        this.paidUntil = paidUntil;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

}
