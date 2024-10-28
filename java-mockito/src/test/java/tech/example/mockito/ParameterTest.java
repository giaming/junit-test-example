package tech.example.mockito;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;



@RunWith(MockitoJUnitRunner.class)
public class ParameterTest {

    @Mock
    private List<String> testList;

    @Test
    public void test01() {

        when(testList.get(0)).thenReturn("a");
        Assert.assertEquals("a", testList.get(0));

        when(testList.get(0)).thenReturn("b");
        Assert.assertEquals("b", testList.get(0));

        when(testList.get(anyInt())).thenReturn("c");
        Assert.assertEquals("c", testList.get(0));
        Assert.assertEquals("c", testList.get(1));

    }
}
