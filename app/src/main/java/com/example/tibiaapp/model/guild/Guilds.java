
package com.example.tibiaapp.model.guild;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Guilds implements Serializable
{

    @SerializedName("guild")
    @Expose
    private Guild guild;
    private final static long serialVersionUID = -6143488414686144403L;

    public Guild getGuild() {
        return guild;
    }

    public void setGuild(Guild guild) {
        this.guild = guild;
    }

}
