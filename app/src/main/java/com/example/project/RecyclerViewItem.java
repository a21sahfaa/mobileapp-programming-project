package com.example.project;

public class RecyclerViewItem {

    private String title;
    private String name;
    private String location;
    private int cost;
    private int size;
    private String category;




    public RecyclerViewItem(String title, String name, String location, int cost, int size, String category) {
        this.title = title;
        this.name = name;
        this.location = location;
        this.cost = cost;
        this.size = size;
        this.category = category;
    }


    public String getTitle() {
        return title;
    }
    public String getName() {
        return name;
    }
    public String getLocation() {return location;}
    public int getcost() {return cost;}
    public int getsize() {return size;}
    public String getcategory() {return category;}



}
