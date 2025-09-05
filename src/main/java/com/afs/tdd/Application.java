package com.afs.tdd;

import java.util.Objects;

public class Application {
    public static Coordinates executiveCommand(Coordinates coordinates, String command) {
        if (command.equals("M")) {
            if (coordinates.direction.equals("N")) {
                return new Coordinates(coordinates.x, ++coordinates.y, coordinates.direction);
            }
            if (coordinates.direction.equals("S")) {
                return new Coordinates(coordinates.x, --coordinates.y, coordinates.direction);
            }
            if (coordinates.direction.equals("W")) {
                return new Coordinates(--coordinates.x, coordinates.y, coordinates.direction);
            }
            if (coordinates.direction.equals("E")) {
                return new Coordinates(++coordinates.x, coordinates.y, coordinates.direction);
            }
        }
        if (command.equals("L")) {
            if (coordinates.direction.equals("N")) {
                return new Coordinates(coordinates.x, coordinates.y, "W");
            }
        }
        return null;
    }
}
