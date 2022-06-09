
package com.example.tibiaapp.model.guild;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class GuildData implements Serializable
{

    public static final String EXTRA_TIBIA = "EXTRA_TIBIA";
    @SerializedName("guilds")
    @Expose
    private Guilds guilds;
    @SerializedName("information")
    @Expose
    private Information information;
    private final static long serialVersionUID = -5071237230761632106L;

    public Guilds getGuilds() {
        return guilds;
    }

    public void setGuilds(Guilds guilds) {
        this.guilds = guilds;
    }

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }

}
