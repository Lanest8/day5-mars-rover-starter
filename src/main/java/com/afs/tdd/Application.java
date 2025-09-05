package com.afs.tdd;

import static com.afs.tdd.Command.*;
import static com.afs.tdd.Direction.*;

public class Application {

    public static Coordinates executiveCommand(Coordinates coordinates, String command) {
        if (command.equals(MOVE)) {
            return executiveMoveCommand(coordinates);
        }
        if (command.equals(LEFT)) {
            switch (coordinates.direction) {
                case NORTH -> {
                    return new Coordinates(coordinates.x, coordinates.y, WEST);
                }
                case SOUTH -> {
                    return new Coordinates(coordinates.x, coordinates.y, EAST);
                }
                case WEST -> {
                    return new Coordinates(coordinates.x, coordinates.y, SOUTH);
                }
                case EAST -> {
                    return new Coordinates(coordinates.x, coordinates.y, NORTH);
                }
            }
        }
        if (command.equals(RIGHT)) {
            switch (coordinates.direction) {
                case NORTH -> {
                    return new Coordinates(coordinates.x, coordinates.y, EAST);
                }
                case SOUTH -> {
                    return new Coordinates(coordinates.x, coordinates.y, WEST);
                }
                case WEST -> {
                    return new Coordinates(coordinates.x, coordinates.y, NORTH);
                }
                case EAST -> {
                    return new Coordinates(coordinates.x, coordinates.y, SOUTH);
                }
            }
        }
        return null;
    }

    private static Coordinates executiveMoveCommand(Coordinates coordinates) {
        switch (coordinates.direction) {
            case NORTH -> {
                return new Coordinates(coordinates.x, ++coordinates.y, coordinates.direction);
            }
            case SOUTH -> {
                return new Coordinates(coordinates.x, --coordinates.y, coordinates.direction);
            }
            case WEST -> {
                return new Coordinates(--coordinates.x, coordinates.y, coordinates.direction);
            }
            case EAST -> {
                return new Coordinates(++coordinates.x, coordinates.y, coordinates.direction);
            }
        }
        return null;
    }
}
