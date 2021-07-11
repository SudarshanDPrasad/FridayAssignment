package com.example.youtube_view;

public class YouTube {
    private String name;
    private String link;
    private int Image;
    private int image;

    public String getName() {
        return name;
    }

    public String getLink() {
        return link;
    }

    public int getimage(){
        return image;
    }

    public int getImage() {
        return Image;
    }

    public YouTube(String name, String link, int image, int image1) {
        this.name = name;
        this.link = link;
        Image = image;
        this.image = image1;
    }
}
