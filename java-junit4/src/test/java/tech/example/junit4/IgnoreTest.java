package tech.example.junit4;

import org.junit.Ignore;
import org.junit.Test;

public class IgnoreTest {


    @Ignore
    @Test
    public void ignoreTest(){
        System.out.println("ignore test");
    }
}