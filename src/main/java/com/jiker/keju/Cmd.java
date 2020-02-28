package com.jiker.keju;

public class Cmd {
    @Override
    public String toString() {
        return "Cmd{" +
                "distance=" + distance +
                ", wating=" + wating +
                '}';
    }
    private int distance;
    public int getDistance() {
        return distance;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }
    public int getWating() {
        return wating;
    }
    public void setWating(int wating) {
        this.wating = wating;
    }
    private int wating;
}
