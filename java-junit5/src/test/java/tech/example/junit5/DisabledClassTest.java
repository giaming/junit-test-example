package tech.example.junit5;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
class DisabledClassTest {
    @Test
    void testWillBeSkipped() {
    }
}