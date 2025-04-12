package testngdemo.basicoftestng;

import org.testng.annotations.Test;

public class AnnotationAttributeTest {

    @Test(invocationCount = 100, invocationTimeOut = 2)
    public void checkAttributes(){
        System.out.println("TestNG check");
    }
}
