package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class DemoTest {
    @Test
    public void should_return_coordinates_when_command_M_direction_N() {
        String command = "M";

        Coordinates coordinatesResult = Application.executiveCommand(
                new Coordinates(0, 0, "N"), command
        );

        assertEquals(coordinatesResult, new Coordinates(0, 1, "N"));
    }

    @Test
    public void should_return_coordinates_when_command_M_direction_S() {
        String command = "M";

        Coordinates coordinatesResult = Application.executiveCommand(
                new Coordinates(0, 0, "S"), command
        );

        assertEquals(coordinatesResult, new Coordinates(0, -1, "S"));
    }

    @Test
    public void should_return_coordinates_when_command_M_direction_W() {
        String command = "M";

        Coordinates coordinatesResult = Application.executiveCommand(
                new Coordinates(0, 0, "W"), command
        );

        assertEquals(coordinatesResult, new Coordinates(-1, 0, "W"));
    }

    @Test
    public void should_return_coordinates_when_command_M_direction_E() {
        String command = "M";

        Coordinates coordinatesResult = Application.executiveCommand(
                new Coordinates(0, 0, "E"), command
        );

        assertEquals(coordinatesResult, new Coordinates(1, 0, "E"));
    }

    @Test
    public void should_return_coordinates_when_command_L_direction_N() {
        String command = "L";

        Coordinates coordinatesResult = Application.executiveCommand(
                new Coordinates(0, 0, "N"), command
        );

        assertEquals(coordinatesResult, new Coordinates(0, 0, "W"));
    }

    @Test
    public void should_return_coordinates_when_command_L_direction_S() {
        String command = "L";

        Coordinates coordinatesResult = Application.executiveCommand(
                new Coordinates(0, 0, "S"), command
        );

        assertEquals(coordinatesResult, new Coordinates(0, 0, "E"));
    }

    @Test
    public void should_return_coordinates_when_command_L_direction_W() {
        String command = "L";

        Coordinates coordinatesResult = Application.executiveCommand(
                new Coordinates(0, 0, "W"), command
        );

        assertEquals(coordinatesResult, new Coordinates(0, 0, "S"));
    }

    @Test
    public void should_return_coordinates_when_command_L_direction_E() {
        String command = "L";

        Coordinates coordinatesResult = Application.executiveCommand(
                new Coordinates(0, 0, "E"), command
        );

        assertEquals(coordinatesResult, new Coordinates(0, 0, "N"));
    }

    @Test
    public void should_return_coordinates_when_command_R_direction_N() {
        String command = "R";

        Coordinates coordinatesResult = Application.executiveCommand(
                new Coordinates(0, 0, "N"), command
        );

        assertEquals(new Coordinates(0, 0, "E"), coordinatesResult);
    }

    @Test
    public void should_return_coordinates_when_command_R_direction_S() {
        String command = "R";

        Coordinates coordinatesResult = Application.executiveCommand(
                new Coordinates(0, 0, "S"), command
        );

        assertEquals(new Coordinates(0, 0, "W"), coordinatesResult);
    }

    @Test
    public void should_return_coordinates_when_command_R_direction_W() {
        String command = "R";

        Coordinates coordinatesResult = Application.executiveCommand(
                new Coordinates(0, 0, "W"), command
        );

        assertEquals(new Coordinates(0, 0, "N"), coordinatesResult);
    }

}
