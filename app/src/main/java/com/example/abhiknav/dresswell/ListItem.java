package com.example.abhiknav.dresswell;

/**
 * Created by Abhiknav on 4/25/2018.
 */

public class ListItem {
    private String sex;
    private String age;
    private String ocassion;
    private String text;
    private String ImageURL;

    public ListItem(String text,String ImageURL,String sex,String age,String ocassion) {
        this.text = text;
        this.ImageURL=ImageURL;
        this.sex=sex;
        this.age=age;
        this.ocassion = ocassion;
    }

    public String getText() {
        return text;
    }

    public String getImageURL() {
        return ImageURL;
    }

    public String getSex() {
        return sex;
    }

    public String getAge() {
        return age;
    }

    public String getOcassion() {
        return ocassion;
    }
}
