package testngdemo.basicoftestng;

import org.testng.annotations.*;

public class AnnotationCheck {

    @BeforeTest
    public void beforeTestCheck(){
        System.out.println("Before test...");
    }

    @AfterTest
    public void afterTestCheck(){
        System.out.println("Close test");
    }

    @BeforeClass
    public void beforeClassCheck(){
        System.out.println("Before class....");
    }

    @AfterClass
    public void afterClassCheck(){
        System.out.println("Close class....");
    }

    @BeforeMethod
    public void preCheck(){
        System.out.println("Before method....");
    }

    @AfterMethod
    public void postCheck(){
        System.out.println("Close Method");
    }

    @Test
    public void verifyMethod1(){
        System.out.println("This is method 01");
    }

    @Test
    public void verifyMethod2(){
        System.out.println("This is method 02");
    }

    @Test
    public void verifyMethod3(){
        System.out.println("This is method 03");
    }
}
