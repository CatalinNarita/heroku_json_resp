package com.edu.myapp;

/**
 * Created by catal on 3/25/2018
 */
public class Greeting {

    private String shortGreeting;
    private String longGreeting;

    public Greeting(){}

    public Greeting(String shortGreeting, String longGreeting) {
        this.shortGreeting = shortGreeting;
        this.longGreeting = longGreeting;
    }

    public String getShortGreeting() {
        return shortGreeting;
    }

    public void setShortGreeting(String shortGreeting) {
        this.shortGreeting = shortGreeting;
    }

    public String getLongGreeting() {
        return longGreeting;
    }

    public void setLongGreeting(String longGreeting) {
        this.longGreeting = longGreeting;
    }
}
