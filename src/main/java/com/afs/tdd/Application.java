package com.afs.tdd;

import java.util.Objects;

public class Application {
    public static Coordinates executiveCommand(Coordinates coordinates, String command) {
        if (Objects.equals(command, "M")) {
            if (Objects.equals(coordinates.direction, "N")) {
                return new Coordinates(coordinates.x, coordinates.y++, coordinates.direction);
            }
        }
        return null;
    }
}
