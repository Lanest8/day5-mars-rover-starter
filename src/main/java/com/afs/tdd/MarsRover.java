package com.afs.tdd;

import java.util.List;
import java.util.Map;

import static com.afs.tdd.constant.Command.*;
import static com.afs.tdd.constant.Direction.*;

public class MarsRover {

    private static final Map<String, int[]> MOVE_MAP = Map.of(
            NORTH, new int[]{0, 1},
            SOUTH, new int[]{0, -1},
            WEST, new int[]{-1, 0},
            EAST, new int[]{1, 0}
    );
    ;
    private static final Map<String, String> LEFT_MAP = Map.of(
            NORTH, WEST,
            WEST, SOUTH,
            SOUTH, EAST,
            EAST, NORTH
    );

    private static final Map<String, String> RIGHT_MAP = Map.of(
            NORTH, EAST,
            EAST, SOUTH,
            SOUTH, WEST,
            WEST, NORTH
    );

    public static Coordinates executiveCommand(Coordinates coordinates, String command) {
        return switch (command) {
            case MOVE -> executiveMoveCommand(coordinates);
            case MOVE_BACKWARD -> executiveMoveBackwardCommand(coordinates);
            case LEFT -> executiveLeftCommand(coordinates);
            case RIGHT -> executiveRightCommand(coordinates);
            default -> null;
        };
    }

    public static Coordinates executiveCommand(Coordinates coordinates, List<String> commands) {
        return commands.stream()
                .reduce(
                        coordinates,
                        MarsRover::executiveCommand,
                        (pre, next) -> next
                );
    }

    private static Coordinates executiveRightCommand(Coordinates coordinates) {
        return new Coordinates(coordinates.getX(), coordinates.getY(), RIGHT_MAP.get(coordinates.getDirection()));
    }

    private static Coordinates executiveLeftCommand(Coordinates coordinates) {
        return new Coordinates(coordinates.getX(), coordinates.getY(), LEFT_MAP.get(coordinates.getDirection()));
    }

    private static Coordinates executiveMoveCommand(Coordinates coordinates) {
        int[] delta = MOVE_MAP.get(coordinates.getDirection());
        return new Coordinates(coordinates.getX() + delta[0], coordinates.getY() + delta[1], coordinates.getDirection());
    }


    private static Coordinates executiveMoveBackwardCommand(Coordinates coordinates) {
        int[] delta = MOVE_MAP.get(coordinates.getDirection());
        return new Coordinates(coordinates.getX() - delta[0], coordinates.getY() - delta[1], coordinates.getDirection());
    }
}
