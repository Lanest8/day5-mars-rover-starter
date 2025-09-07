package com.afs.tdd;

import static com.afs.tdd.constant.Command.*;
import static com.afs.tdd.constant.Direction.*;

public class MarsRover {

    public static Coordinates executiveCommand(Coordinates coordinates, String command) {
        return switch (command) {
            case MOVE -> executiveMoveCommand(coordinates);
            case MOVE_BACKWARD -> executiveMoveBackwardCommand(coordinates);
            case LEFT -> executiveLeftCommand(coordinates);
            case RIGHT -> executiveRightCommand(coordinates);
            default -> null;
        };
    }

    private static Coordinates executiveRightCommand(Coordinates coordinates) {
        return switch (coordinates.getDirection()) {
            case NORTH -> new Coordinates(coordinates.getX(), coordinates.getY(), EAST);
            case SOUTH -> new Coordinates(coordinates.getX(), coordinates.getY(), WEST);
            case WEST -> new Coordinates(coordinates.getX(), coordinates.getY(), NORTH);
            case EAST -> new Coordinates(coordinates.getX(), coordinates.getY(), SOUTH);
            default -> null;
        };
    }

    private static Coordinates executiveLeftCommand(Coordinates coordinates) {
        return switch (coordinates.getDirection()) {
            case NORTH -> new Coordinates(coordinates.getX(), coordinates.getY(), WEST);
            case SOUTH -> new Coordinates(coordinates.getX(), coordinates.getY(), EAST);
            case WEST -> new Coordinates(coordinates.getX(), coordinates.getY(), SOUTH);
            case EAST -> new Coordinates(coordinates.getX(), coordinates.getY(), NORTH);
            default -> null;
        };
    }

    private static Coordinates executiveMoveCommand(Coordinates coordinates) {
        return switch (coordinates.getDirection()) {
            case NORTH -> new Coordinates(coordinates.getX(), coordinates.getY() + 1, coordinates.getDirection());
            case SOUTH -> new Coordinates(coordinates.getX(), coordinates.getY() - 1, coordinates.getDirection());
            case WEST -> new Coordinates(coordinates.getX() - 1, coordinates.getY(), coordinates.getDirection());
            case EAST -> new Coordinates(coordinates.getX() + 1, coordinates.getY(), coordinates.getDirection());
            default -> null;
        };
    }


    private static Coordinates executiveMoveBackwardCommand(Coordinates coordinates) {
        return switch (coordinates.getDirection()) {
            case NORTH -> new Coordinates(coordinates.getX(), coordinates.getY() - 1, coordinates.getDirection());
            case SOUTH -> new Coordinates(coordinates.getX(), coordinates.getY() + 1, coordinates.getDirection());
            case WEST -> new Coordinates(coordinates.getX() + 1, coordinates.getY(), coordinates.getDirection());
            case EAST -> new Coordinates(coordinates.getX() - 1, coordinates.getY(), coordinates.getDirection());
            default -> null;
        };
    }
}
