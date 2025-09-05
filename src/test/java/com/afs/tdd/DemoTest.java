package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static com.afs.tdd.constant.Command.*;
import static com.afs.tdd.constant.Direction.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {

    @Test
    public void should_return_coordinates_when_command_M_direction_N() {
        String command = MOVE;

        Coordinates coordinatesResult = MarsRover.executiveCommand(new Coordinates(0, 0, NORTH), command);

        assertEquals(coordinatesResult, new Coordinates(0, 1, NORTH));
    }

    @Test
    public void should_return_coordinates_when_command_M_direction_S() {
        String command = MOVE;

        Coordinates coordinatesResult = MarsRover.executiveCommand(new Coordinates(0, 0, SOUTH), command);

        assertEquals(coordinatesResult, new Coordinates(0, -1, SOUTH));
    }

    @Test
    public void should_return_coordinates_when_command_M_direction_W() {
        String command = MOVE;

        Coordinates coordinatesResult = MarsRover.executiveCommand(new Coordinates(0, 0, WEST), command);

        assertEquals(coordinatesResult, new Coordinates(-1, 0, WEST));
    }

    @Test
    public void should_return_coordinates_when_command_M_direction_E() {
        String command = MOVE;

        Coordinates coordinatesResult = MarsRover.executiveCommand(new Coordinates(0, 0, EAST), command);

        assertEquals(coordinatesResult, new Coordinates(1, 0, EAST));
    }

    @Test
    public void should_return_coordinates_when_command_L_direction_N() {
        String command = LEFT;

        Coordinates coordinatesResult = MarsRover.executiveCommand(new Coordinates(0, 0, NORTH), command);

        assertEquals(coordinatesResult, new Coordinates(0, 0, WEST));
    }

    @Test
    public void should_return_coordinates_when_command_L_direction_S() {
        String command = LEFT;

        Coordinates coordinatesResult = MarsRover.executiveCommand(new Coordinates(0, 0, SOUTH), command);

        assertEquals(coordinatesResult, new Coordinates(0, 0, EAST));
    }

    @Test
    public void should_return_coordinates_when_command_L_direction_W() {
        String command = LEFT;

        Coordinates coordinatesResult = MarsRover.executiveCommand(new Coordinates(0, 0, WEST), command);

        assertEquals(coordinatesResult, new Coordinates(0, 0, SOUTH));
    }

    @Test
    public void should_return_coordinates_when_command_L_direction_E() {
        String command = LEFT;

        Coordinates coordinatesResult = MarsRover.executiveCommand(new Coordinates(0, 0, EAST), command);

        assertEquals(coordinatesResult, new Coordinates(0, 0, NORTH));
    }

    @Test
    public void should_return_coordinates_when_command_R_direction_N() {
        String command = RIGHT;

        Coordinates coordinatesResult = MarsRover.executiveCommand(new Coordinates(0, 0, NORTH), command);

        assertEquals(new Coordinates(0, 0, EAST), coordinatesResult);
    }

    @Test
    public void should_return_coordinates_when_command_R_direction_S() {
        String command = RIGHT;

        Coordinates coordinatesResult = MarsRover.executiveCommand(new Coordinates(0, 0, SOUTH), command);

        assertEquals(new Coordinates(0, 0, WEST), coordinatesResult);
    }

    @Test
    public void should_return_coordinates_when_command_R_direction_W() {
        String command = RIGHT;

        Coordinates coordinatesResult = MarsRover.executiveCommand(new Coordinates(0, 0, WEST), command);

        assertEquals(new Coordinates(0, 0, NORTH), coordinatesResult);
    }

    @Test
    public void should_return_coordinates_when_command_R_direction_E() {
        String command = RIGHT;

        Coordinates coordinatesResult = MarsRover.executiveCommand(new Coordinates(0, 0, EAST), command);

        assertEquals(new Coordinates(0, 0, SOUTH), coordinatesResult);
    }

    @Test
    public void should_return_coordinates_when_command_B_direction_N() {
        String command = MOVE_BACKWARD;

        Coordinates coordinatesResult = MarsRover.executiveCommand(new Coordinates(0, 0, NORTH), command);

        assertEquals(coordinatesResult, new Coordinates(0, -1, NORTH));
    }

    @Test
    public void should_return_coordinates_when_command_B_direction_S() {
        String command = MOVE_BACKWARD;

        Coordinates coordinatesResult = MarsRover.executiveCommand(new Coordinates(0, 0, SOUTH), command);

        assertEquals(coordinatesResult, new Coordinates(0, 1, SOUTH));
    }

    @Test
    public void should_return_coordinates_when_command_B_direction_W() {
        String command = MOVE_BACKWARD;

        Coordinates coordinatesResult = MarsRover.executiveCommand(new Coordinates(0, 0, WEST), command);

        assertEquals(coordinatesResult, new Coordinates(1, 0, WEST));
    }

    @Test
    public void should_return_coordinates_when_command_B_direction_E() {
        String command = MOVE_BACKWARD;

        Coordinates coordinatesResult = MarsRover.executiveCommand(new Coordinates(0, 0, EAST), command);

        assertEquals(coordinatesResult, new Coordinates(-1, 0, EAST));
    }

}
