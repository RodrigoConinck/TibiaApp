
package com.example.tibiaapp.model.character;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Achievement implements Serializable
{

    @SerializedName("grade")
    @Expose
    private int grade;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("secret")
    @Expose
    private boolean secret;
    private final static long serialVersionUID = -7798029455236381702L;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSecret() {
        return secret;
    }

    public void setSecret(boolean secret) {
        this.secret = secret;
    }

}
