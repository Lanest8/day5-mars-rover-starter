package com.afs.tdd;

import static com.afs.tdd.Command.*;
import static com.afs.tdd.Direction.*;

public class Application {

    public static Coordinates executiveCommand(Coordinates coordinates, String command) {
        return switch (command) {
            case MOVE -> executiveMoveCommand(coordinates);
            case LEFT -> executiveLeftCommand(coordinates);
            case RIGHT -> executiveRightCommand(coordinates);
            default -> null;
        };
    }

    private static Coordinates executiveRightCommand(Coordinates coordinates) {
        return switch (coordinates.direction) {
            case NORTH -> new Coordinates(coordinates.x, coordinates.y, EAST);
            case SOUTH -> new Coordinates(coordinates.x, coordinates.y, WEST);
            case WEST -> new Coordinates(coordinates.x, coordinates.y, NORTH);
            case EAST -> new Coordinates(coordinates.x, coordinates.y, SOUTH);
            default -> null;
        };
    }

    private static Coordinates executiveLeftCommand(Coordinates coordinates) {
        return switch (coordinates.direction) {
            case NORTH -> new Coordinates(coordinates.x, coordinates.y, WEST);
            case SOUTH -> new Coordinates(coordinates.x, coordinates.y, EAST);
            case WEST -> new Coordinates(coordinates.x, coordinates.y, SOUTH);
            case EAST -> new Coordinates(coordinates.x, coordinates.y, NORTH);
            default -> null;
        };
    }

    private static Coordinates executiveMoveCommand(Coordinates coordinates) {
        return switch (coordinates.direction) {
            case NORTH -> new Coordinates(coordinates.x, ++coordinates.y, coordinates.direction);
            case SOUTH -> new Coordinates(coordinates.x, --coordinates.y, coordinates.direction);
            case WEST -> new Coordinates(--coordinates.x, coordinates.y, coordinates.direction);
            case EAST -> new Coordinates(++coordinates.x, coordinates.y, coordinates.direction);
            default -> null;
        };
    }
}
