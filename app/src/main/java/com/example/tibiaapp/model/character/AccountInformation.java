
package com.example.tibiaapp.model.character;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class AccountInformation implements Serializable
{

    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("loyalty_title")
    @Expose
    private String loyaltyTitle;
    @SerializedName("position")
    @Expose
    private String position;
    private final static long serialVersionUID = 3697987989463359358L;

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getLoyaltyTitle() {
        return loyaltyTitle;
    }

    public void setLoyaltyTitle(String loyaltyTitle) {
        this.loyaltyTitle = loyaltyTitle;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
