package com.example.task51;

public class Destination {

    private int id, imageId;
    private String name, description;

    public Destination(int id, String name, String description, int imageId)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageId = imageId;
    }

    public int GetId()
    {
        return id;
    }

    public String GetName()
    {
        return name;
    }

    public String GetDescription()
    {
        return description;
    }

    public int GetImageID()
    {
        return imageId;
    }

}
