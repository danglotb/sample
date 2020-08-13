package fr.inria;

import org.junit.jupiter.api.Test;
import org.powerapi.jjoules.junit.EnergyTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@EnergyTest
public class TestExample {

    @Test
    void test() {
        final Example example = new Example();
        assertEquals('b', example.charAt("abcd", 1));
    }
}
