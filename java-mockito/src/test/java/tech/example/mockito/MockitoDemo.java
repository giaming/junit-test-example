package tech.example.mockito;

import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.*;


class ExampleService {

    int add(int a, int b) {
        return a+b;
    }

}

public class MockitoDemo {


    @Test
    public void test_spy() {

        ExampleService spyExampleService = spy(new ExampleService());


        Assert.assertEquals(3, spyExampleService.add(1, 2));


        when(spyExampleService.add(1, 2)).thenReturn(10);
        Assert.assertEquals(10, spyExampleService.add(1, 2));


        Assert.assertEquals(3, spyExampleService.add(2, 1));

    }


    @Test
    public void test_mock() {

        ExampleService mockExampleService = mock(ExampleService.class);


        Assert.assertEquals(0, mockExampleService.add(1, 2));

    }

}
