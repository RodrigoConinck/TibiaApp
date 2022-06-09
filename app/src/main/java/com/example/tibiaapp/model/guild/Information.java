
package com.example.tibiaapp.model.guild;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Information implements Serializable
{

    @SerializedName("api_version")
    @Expose
    private int apiVersion;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    private final static long serialVersionUID = 3043596605621904316L;

    public int getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(int apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

}
