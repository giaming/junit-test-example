package tech.example.junit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class HasGlobalTimeoutTest {
    public static String log;

    private final CountDownLatch latch = new CountDownLatch(1);

    @Rule
    public Timeout globalTimeout = Timeout.seconds(10);

    @Test
    public void testSleepForTooLong() throws Exception {
        log += "ran1";
        TimeUnit.SECONDS.sleep(100);
    }

    @Test
    public void testBlockForever() throws Exception {
        log += "ran2";
        latch.await();
    }
}
