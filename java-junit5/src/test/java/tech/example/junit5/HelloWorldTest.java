package tech.example.junit5;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    void firstTest() {
        assertEquals(2, 1 + 1);
    }
}
