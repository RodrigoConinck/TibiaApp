
package com.example.tibiaapp.model.character;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class AccountBadge implements Serializable
{

    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("icon_url")
    @Expose
    private String iconUrl;
    @SerializedName("name")
    @Expose
    private String name;
    private final static long serialVersionUID = -4735204912477971569L;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
