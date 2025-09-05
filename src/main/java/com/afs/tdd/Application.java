package com.afs.tdd;

public class Application {

    public static Coordinates executiveCommand(Coordinates coordinates, String command) {
        if (command.equals("M")) {
            if (coordinates.direction.equals(Direction.NORTH)) {
                return new Coordinates(coordinates.x, ++coordinates.y, coordinates.direction);
            }
            if (coordinates.direction.equals(Direction.SOUTH)) {
                return new Coordinates(coordinates.x, --coordinates.y, coordinates.direction);
            }
            if (coordinates.direction.equals(Direction.WEST)) {
                return new Coordinates(--coordinates.x, coordinates.y, coordinates.direction);
            }
            if (coordinates.direction.equals(Direction.EAST)) {
                return new Coordinates(++coordinates.x, coordinates.y, coordinates.direction);
            }
        }
        if (command.equals("L")) {
            if (coordinates.direction.equals(Direction.NORTH)) {
                return new Coordinates(coordinates.x, coordinates.y, Direction.WEST);
            }
            if (coordinates.direction.equals(Direction.SOUTH)) {
                return new Coordinates(coordinates.x, coordinates.y, Direction.EAST);
            }
            if (coordinates.direction.equals(Direction.WEST)) {
                return new Coordinates(coordinates.x, coordinates.y, Direction.SOUTH);
            }
            if (coordinates.direction.equals(Direction.EAST)) {
                return new Coordinates(coordinates.x, coordinates.y, Direction.NORTH);
            }
        }
        if (command.equals("R")) {
            if (coordinates.direction.equals(Direction.NORTH)) {
                return new Coordinates(coordinates.x, coordinates.y, Direction.EAST);
            }
            if (coordinates.direction.equals(Direction.SOUTH)) {
                return new Coordinates(coordinates.x, coordinates.y, Direction.WEST);
            }
            if (coordinates.direction.equals(Direction.WEST)) {
                return new Coordinates(coordinates.x, coordinates.y, Direction.NORTH);
            }
            if (coordinates.direction.equals(Direction.EAST)) {
                return new Coordinates(coordinates.x, coordinates.y, Direction.SOUTH);
            }
        }
        return null;
    }
}
