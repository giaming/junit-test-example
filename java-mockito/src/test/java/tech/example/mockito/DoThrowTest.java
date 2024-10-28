package tech.example.mockito;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.doThrow;


@RunWith(MockitoJUnitRunner.class)
public class DoThrowTest {

    static class ExampleService {

        public void hello() {
            System.out.println("Hello");
        }

    }

    @Mock
    private ExampleService exampleService;

    @Test
    public void test() {


        doThrow(new RuntimeException("异常")).when(exampleService).hello();

        try {
            exampleService.hello();
            Assert.fail();
        } catch (RuntimeException ex) {
            Assert.assertEquals("异常", ex.getMessage());
        }

    }
}
