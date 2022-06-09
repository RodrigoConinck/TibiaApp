
package com.example.tibiaapp.model.character;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Assist implements Serializable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("player")
    @Expose
    private boolean player;
    @SerializedName("summon")
    @Expose
    private String summon;
    @SerializedName("traded")
    @Expose
    private boolean traded;
    private final static long serialVersionUID = 7348113465967381206L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPlayer() {
        return player;
    }

    public void setPlayer(boolean player) {
        this.player = player;
    }

    public String getSummon() {
        return summon;
    }

    public void setSummon(String summon) {
        this.summon = summon;
    }

    public boolean isTraded() {
        return traded;
    }

    public void setTraded(boolean traded) {
        this.traded = traded;
    }

}
