package com.example.project;

import com.google.gson.annotations.SerializedName;

public class Item {
    @SerializedName("ID")
    private String ID;
    @SerializedName("name")
    private String Name;
    @SerializedName("cost")
    private int cost;
    @SerializedName("size")
    private int meter;
    @SerializedName("location")
    private String location;
    @SerializedName("category")
    private String category;

    public Item(String name){
        this.Name = name;
    }

    public String getTitle() {
        return Name;
    }
    public String getLocation() {return location;}
    public String getName() {
        return Name;
    }
    public int getCost() {return cost;}
    public int getsize() {return meter;}
    public String getCategory() {return category;}




}