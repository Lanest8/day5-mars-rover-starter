package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class DemoTest {
    @Test
    public void should_return_coordinates_when_N() {
        String command = "M";

        Coordinates coordinatesResult = Application.executiveCommand(
                new Coordinates(0,0,"N"), command
        );

        assertNull(coordinatesResult);

    }
}
