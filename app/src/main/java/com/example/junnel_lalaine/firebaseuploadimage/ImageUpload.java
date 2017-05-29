package com.example.junnel_lalaine.firebaseuploadimage;

/**
 * Created by Junnel_Lalaine on 5/29/2017.
 */

public class ImageUpload {

    public String name;
    public String url;
    public String owner;

    public String getOwner() { return owner; }

    public String getName(){
        return name;
    }

    public String getUrl() {
        return url;
    }

    public ImageUpload(String name, String url, String owner) {
        this.name = name;
        this.url = url;
        this.owner = owner;
    }
}
