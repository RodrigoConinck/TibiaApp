
package com.example.tibiaapp.model.character;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class House implements Serializable
{

    @SerializedName("houseid")
    @Expose
    private int houseid;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("paid")
    @Expose
    private String paid;
    @SerializedName("town")
    @Expose
    private String town;
    private final static long serialVersionUID = 6610034073438966195L;

    public int getHouseid() {
        return houseid;
    }

    public void setHouseid(int houseid) {
        this.houseid = houseid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

}
