package com.company;

import java.time.LocalDate;

public class Meeting extends Conference {
    private LocalDate localDate;
    private String topic;
    private int numberOfParticipants;

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

    public Meeting(LocalDate localDate, String topic, int numberOfParticipants,String loction,String title) {
        this.localDate = localDate;
        this.topic = topic;
        this.numberOfParticipants = numberOfParticipants;
        this.title = title;
        this.location = loction;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "localDate=" + localDate +
                ", topic='" + topic + '\'' +
                ", numberOfParticipants=" + numberOfParticipants +
                '}';
    }
}
