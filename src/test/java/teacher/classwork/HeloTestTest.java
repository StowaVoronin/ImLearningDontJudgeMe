package teacher.classwork;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HeloTestTest {
    @Test
    public void MyFirstTest() {
        System.out.println("Hello,test");

    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("This is to be run before the Whole test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("This is to be run after the Whole test");
    }

}

