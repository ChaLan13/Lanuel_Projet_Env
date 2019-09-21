package my.pkg;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class MyClassTest {
    private String helloTest;


    @Before
    public void init(){
        helloTest = "hello";
    }

    @Test
    public void notNullTest(){
        assertNotNull(helloTest);
    }

    @Test
    public void nullTest(){
        assertNull(helloTest);
    }
}
