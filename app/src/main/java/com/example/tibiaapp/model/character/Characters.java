
package com.example.tibiaapp.model.character;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Characters implements Serializable
{

    @SerializedName("account_badges")
    @Expose
    private List<AccountBadge> accountBadges = null;
    @SerializedName("account_information")
    @Expose
    private AccountInformation accountInformation;
    @SerializedName("achievements")
    @Expose
    private List<Achievement> achievements = null;
    @SerializedName("character")
    @Expose
    private Character character;
    @SerializedName("deaths")
    @Expose
    private List<Death> deaths = null;
    @SerializedName("other_characters")
    @Expose
    private List<OtherCharacter> otherCharacters = null;
    private final static long serialVersionUID = 8549712642700825249L;

    public List<AccountBadge> getAccountBadges() {
        return accountBadges;
    }

    public void setAccountBadges(List<AccountBadge> accountBadges) {
        this.accountBadges = accountBadges;
    }

    public AccountInformation getAccountInformation() {
        return accountInformation;
    }

    public void setAccountInformation(AccountInformation accountInformation) {
        this.accountInformation = accountInformation;
    }

    public List<Achievement> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<Achievement> achievements) {
        this.achievements = achievements;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public List<Death> getDeaths() {
        return deaths;
    }

    public void setDeaths(List<Death> deaths) {
        this.deaths = deaths;
    }

    public List<OtherCharacter> getOtherCharacters() {
        return otherCharacters;
    }

    public void setOtherCharacters(List<OtherCharacter> otherCharacters) {
        this.otherCharacters = otherCharacters;
    }

}
