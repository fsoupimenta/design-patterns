package org.example.behavioural.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LightControlInterpreterTest {

    @Test
    public void shouldTurnOnLivingRoomLight() {
        LightControlInterpreter interpreter = new LightControlInterpreter("turn on living light");
        assertEquals("Turning on the light in the living", interpreter.interpret());
    }

    @Test
    public void shouldTurnOffKitchenLight() {
        LightControlInterpreter interpreter = new LightControlInterpreter("turn off kitchen light");
        assertEquals("Turning off the light in the kitchen", interpreter.interpret());
    }

    @Test
    public void shouldThrowExceptionForInvalidCommand() {
        LightControlInterpreter interpreter = new LightControlInterpreter("unknown command");
        assertThrows(IllegalArgumentException.class, interpreter::interpret);
    }

}
