
package com.example.tibiaapp.model.guild;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Guild implements Serializable
{

    @SerializedName("active")
    @Expose
    private boolean active;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("disband_condition")
    @Expose
    private String disbandCondition;
    @SerializedName("disband_date")
    @Expose
    private String disbandDate;
    @SerializedName("founded")
    @Expose
    private String founded;
    @SerializedName("guildhalls")
    @Expose
    private List<Guildhall> guildhalls = null;
    @SerializedName("homepage")
    @Expose
    private String homepage;
    @SerializedName("in_war")
    @Expose
    private boolean inWar;
    @SerializedName("invites")
    @Expose
    private List<Invite> invites = null;
    @SerializedName("logo_url")
    @Expose
    private String logoUrl;
    @SerializedName("members")
    @Expose
    private List<Member> members = null;
    @SerializedName("members_invited")
    @Expose
    private int membersInvited;
    @SerializedName("members_total")
    @Expose
    private int membersTotal;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("open_applications")
    @Expose
    private boolean openApplications;
    @SerializedName("players_offline")
    @Expose
    private int playersOffline;
    @SerializedName("players_online")
    @Expose
    private int playersOnline;
    @SerializedName("world")
    @Expose
    private String world;
    private final static long serialVersionUID = 5949528192066404439L;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisbandCondition() {
        return disbandCondition;
    }

    public void setDisbandCondition(String disbandCondition) {
        this.disbandCondition = disbandCondition;
    }

    public String getDisbandDate() {
        return disbandDate;
    }

    public void setDisbandDate(String disbandDate) {
        this.disbandDate = disbandDate;
    }

    public String getFounded() {
        return founded;
    }

    public void setFounded(String founded) {
        this.founded = founded;
    }

    public List<Guildhall> getGuildhalls() {
        return guildhalls;
    }

    public void setGuildhalls(List<Guildhall> guildhalls) {
        this.guildhalls = guildhalls;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public boolean isInWar() {
        return inWar;
    }

    public void setInWar(boolean inWar) {
        this.inWar = inWar;
    }

    public List<Invite> getInvites() {
        return invites;
    }

    public void setInvites(List<Invite> invites) {
        this.invites = invites;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public int getMembersInvited() {
        return membersInvited;
    }

    public void setMembersInvited(int membersInvited) {
        this.membersInvited = membersInvited;
    }

    public int getMembersTotal() {
        return membersTotal;
    }

    public void setMembersTotal(int membersTotal) {
        this.membersTotal = membersTotal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOpenApplications() {
        return openApplications;
    }

    public void setOpenApplications(boolean openApplications) {
        this.openApplications = openApplications;
    }

    public int getPlayersOffline() {
        return playersOffline;
    }

    public void setPlayersOffline(int playersOffline) {
        this.playersOffline = playersOffline;
    }

    public int getPlayersOnline() {
        return playersOnline;
    }

    public void setPlayersOnline(int playersOnline) {
        this.playersOnline = playersOnline;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

}
