package com.afs.tdd;

import java.util.Objects;

public class Coordinates {
    private int x;
    private int y;
    private String direction;

    public Coordinates(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return Double.compare(x, that.x) == 0 && Double.compare(y, that.y) == 0 && Objects.equals(direction, that.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, direction);
    }
}