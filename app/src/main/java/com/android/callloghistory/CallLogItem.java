package com.android.callloghistory;

public class CallLogItem {

    private String number;
    private String name;
    private String date;
    private String duration;

    public CallLogItem(String number, String name, String date, String duration) {
        this.number = number;
        this.name = name;
        this.date = date;
        this.duration = duration;
    }

    public String getNumber() {
        return number;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public String getDuration() {
        return duration;
    }
}
