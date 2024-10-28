package tech.example.mockito;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Random;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class MockClassTest {

    @Test
    public void mockClassTest() {
        Random mockRandom = mock(Random.class);


        System.out.println(mockRandom.nextBoolean());
        System.out.println(mockRandom.nextInt());
        System.out.println(mockRandom.nextDouble());


        when(mockRandom.nextInt()).thenReturn(100);
        Assert.assertEquals(100, mockRandom.nextInt());
        Assert.assertEquals(100, mockRandom.nextInt());
    }

    @Test
    public void mockInterfaceTest() {
        List mockList = mock(List.class);


        Assert.assertEquals(0, mockList.size());
        Assert.assertEquals(null, mockList.get(0));


        mockList.add("a");
        Assert.assertEquals(0, mockList.size());
        Assert.assertEquals(null, mockList.get(0));


        when(mockList.get(0)).thenReturn("a");
        Assert.assertEquals(0, mockList.size());
        Assert.assertEquals("a", mockList.get(0));
        Assert.assertEquals(null, mockList.get(1));
    }
}
