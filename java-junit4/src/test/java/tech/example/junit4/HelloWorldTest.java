package tech.example.junit4;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void firstTest() {
        assertEquals(2, 1 + 1);
    }
}
