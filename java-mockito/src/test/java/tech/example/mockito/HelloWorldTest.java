package tech.example.mockito;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import tech.example.mockito.dao.DemoDao;
import tech.example.mockito.service.DemoService;

public class HelloWorldTest {
    @Test
    public void helloWorldTest() {

        DemoDao mockDemoDao = Mockito.mock(DemoDao.class);


        Mockito.when(mockDemoDao.getDemoStatus()).thenReturn(1);


        Assert.assertEquals(1, mockDemoDao.getDemoStatus());


        DemoService mockDemoService = new DemoService(mockDemoDao);
        Assert.assertEquals(1, mockDemoService.getDemoStatus() );
    }
}
