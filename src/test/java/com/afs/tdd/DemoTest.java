package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static com.afs.tdd.Direction.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class DemoTest {

    @Test
    public void should_return_coordinates_when_command_M_direction_N() {
        String command = "M";

        Coordinates coordinatesResult = Application.executiveCommand(
                new Coordinates(0, 0, NORTH), command
        );

        assertEquals(coordinatesResult, new Coordinates(0, 1, NORTH));
    }

    @Test
    public void should_return_coordinates_when_command_M_direction_S() {
        String command = "M";

        Coordinates coordinatesResult = Application.executiveCommand(
                new Coordinates(0, 0, SOUTH), command
        );

        assertEquals(coordinatesResult, new Coordinates(0, -1, SOUTH));
    }

    @Test
    public void should_return_coordinates_when_command_M_direction_W() {
        String command = "M";

        Coordinates coordinatesResult = Application.executiveCommand(
                new Coordinates(0, 0, WEST), command
        );

        assertEquals(coordinatesResult, new Coordinates(-1, 0, WEST));
    }

    @Test
    public void should_return_coordinates_when_command_M_direction_E() {
        String command = "M";

        Coordinates coordinatesResult = Application.executiveCommand(
                new Coordinates(0, 0, EAST), command
        );

        assertEquals(coordinatesResult, new Coordinates(1, 0, EAST));
    }

    @Test
    public void should_return_coordinates_when_command_L_direction_N() {
        String command = "L";

        Coordinates coordinatesResult = Application.executiveCommand(
                new Coordinates(0, 0, NORTH), command
        );

        assertEquals(coordinatesResult, new Coordinates(0, 0, WEST));
    }

    @Test
    public void should_return_coordinates_when_command_L_direction_S() {
        String command = "L";

        Coordinates coordinatesResult = Application.executiveCommand(
                new Coordinates(0, 0, SOUTH), command
        );

        assertEquals(coordinatesResult, new Coordinates(0, 0, EAST));
    }

    @Test
    public void should_return_coordinates_when_command_L_direction_W() {
        String command = "L";

        Coordinates coordinatesResult = Application.executiveCommand(
                new Coordinates(0, 0, WEST), command
        );

        assertEquals(coordinatesResult, new Coordinates(0, 0, SOUTH));
    }

    @Test
    public void should_return_coordinates_when_command_L_direction_E() {
        String command = "L";

        Coordinates coordinatesResult = Application.executiveCommand(
                new Coordinates(0, 0, EAST), command
        );

        assertEquals(coordinatesResult, new Coordinates(0, 0, NORTH));
    }

    @Test
    public void should_return_coordinates_when_command_R_direction_N() {
        String command = "R";

        Coordinates coordinatesResult = Application.executiveCommand(
                new Coordinates(0, 0, NORTH), command
        );

        assertEquals(new Coordinates(0, 0, EAST), coordinatesResult);
    }

    @Test
    public void should_return_coordinates_when_command_R_direction_S() {
        String command = "R";

        Coordinates coordinatesResult = Application.executiveCommand(
                new Coordinates(0, 0, SOUTH), command
        );

        assertEquals(new Coordinates(0, 0, WEST), coordinatesResult);
    }

    @Test
    public void should_return_coordinates_when_command_R_direction_W() {
        String command = "R";

        Coordinates coordinatesResult = Application.executiveCommand(
                new Coordinates(0, 0, WEST), command
        );

        assertEquals(new Coordinates(0, 0, NORTH), coordinatesResult);
    }

    @Test
    public void should_return_coordinates_when_command_R_direction_E() {
        String command = "R";

        Coordinates coordinatesResult = Application.executiveCommand(
                new Coordinates(0, 0, EAST), command
        );

        assertEquals(new Coordinates(0, 0, SOUTH), coordinatesResult);
    }

}
