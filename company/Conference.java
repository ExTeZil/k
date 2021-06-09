package com.company;

public class Conference {
    protected String title;
    protected String location;

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Сonference{" +
                "title='" + title + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}