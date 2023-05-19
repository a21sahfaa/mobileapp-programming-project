package com.example.project;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Arrays;

public class Item {
    @SerializedName("ID")
    private String ID;
    @SerializedName("name")
    private String Name;
    @SerializedName("cost")
    private int Cost;
    @SerializedName("size")
    private int meter;
    @SerializedName("location")
    private String location;
    @SerializedName("category")
    private String Category;

    public Item(String name){
        this.Name = name;
    }

    public String getTitle() {
        return Name;
    }
}