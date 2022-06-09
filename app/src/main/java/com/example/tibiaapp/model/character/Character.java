
package com.example.tibiaapp.model.character;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Character implements Serializable
{

    @SerializedName("account_status")
    @Expose
    private String accountStatus;
    @SerializedName("achievement_points")
    @Expose
    private int achievementPoints;
    @SerializedName("comment")
    @Expose
    private String comment;
    @SerializedName("deletion_date")
    @Expose
    private String deletionDate;
    @SerializedName("former_names")
    @Expose
    private List<String> formerNames = null;
    @SerializedName("former_worlds")
    @Expose
    private List<String> formerWorlds = null;
    @SerializedName("guild")
    @Expose
    private Guild guild;
    @SerializedName("houses")
    @Expose
    private List<House> houses = null;
    @SerializedName("last_login")
    @Expose
    private String lastLogin;
    @SerializedName("level")
    @Expose
    private int level;
    @SerializedName("married_to")
    @Expose
    private String marriedTo;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("residence")
    @Expose
    private String residence;
    @SerializedName("sex")
    @Expose
    private String sex;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("traded")
    @Expose
    private boolean traded;
    @SerializedName("unlocked_titles")
    @Expose
    private int unlockedTitles;
    @SerializedName("vocation")
    @Expose
    private String vocation;
    @SerializedName("world")
    @Expose
    private String world;
    private final static long serialVersionUID = 2813738290401045513L;

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public int getAchievementPoints() {
        return achievementPoints;
    }

    public void setAchievementPoints(int achievementPoints) {
        this.achievementPoints = achievementPoints;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDeletionDate() {
        return deletionDate;
    }

    public void setDeletionDate(String deletionDate) {
        this.deletionDate = deletionDate;
    }

    public List<String> getFormerNames() {
        return formerNames;
    }

    public void setFormerNames(List<String> formerNames) {
        this.formerNames = formerNames;
    }

    public List<String> getFormerWorlds() {
        return formerWorlds;
    }

    public void setFormerWorlds(List<String> formerWorlds) {
        this.formerWorlds = formerWorlds;
    }

    public Guild getGuild() {
        return guild;
    }

    public void setGuild(Guild guild) {
        this.guild = guild;
    }

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getMarriedTo() {
        return marriedTo;
    }

    public void setMarriedTo(String marriedTo) {
        this.marriedTo = marriedTo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isTraded() {
        return traded;
    }

    public void setTraded(boolean traded) {
        this.traded = traded;
    }

    public int getUnlockedTitles() {
        return unlockedTitles;
    }

    public void setUnlockedTitles(int unlockedTitles) {
        this.unlockedTitles = unlockedTitles;
    }

    public String getVocation() {
        return vocation;
    }

    public void setVocation(String vocation) {
        this.vocation = vocation;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

}
