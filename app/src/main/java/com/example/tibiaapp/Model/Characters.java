package com.example.tibiaapp.Model;

public class Characters {
    private Data data;

    public Characters(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Characters{" +
                "data=" + data +
                '}';
    }
}
