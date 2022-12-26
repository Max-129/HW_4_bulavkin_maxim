package com.example.hw_4_bulavkin_maxim;

import java.io.Serializable;

public class Model implements Serializable {
    int image;
    String title;
    String description;

    public Model(int image, String title, String description, String reyting) {
        this.image = image;
        this.title = title;
        this.description = description;
        this.reyting = reyting;
    }

    String reyting;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReyting() {
        return reyting;
    }

    public void setReyting(String reyting) {
        this.reyting = reyting;
    }


}
