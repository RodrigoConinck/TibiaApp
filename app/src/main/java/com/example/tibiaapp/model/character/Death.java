
package com.example.tibiaapp.model.character;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Death implements Serializable
{

    @SerializedName("assists")
    @Expose
    private List<Assist> assists = null;
    @SerializedName("killers")
    @Expose
    private List<Killer> killers = null;
    @SerializedName("level")
    @Expose
    private int level;
    @SerializedName("reason")
    @Expose
    private String reason;
    @SerializedName("time")
    @Expose
    private String time;
    private final static long serialVersionUID = -8041047668018243560L;

    public List<Assist> getAssists() {
        return assists;
    }

    public void setAssists(List<Assist> assists) {
        this.assists = assists;
    }

    public List<Killer> getKillers() {
        return killers;
    }

    public void setKillers(List<Killer> killers) {
        this.killers = killers;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
