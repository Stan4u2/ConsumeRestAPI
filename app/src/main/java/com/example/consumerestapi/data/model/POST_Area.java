package com.example.consumerestapi.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class POST_Area {

    @SerializedName("nombre")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private Integer id;

    public POST_Area(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "POST_Area{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
