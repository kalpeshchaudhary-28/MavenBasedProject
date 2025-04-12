package testngdemo.basicoftestng;

import org.testng.Assert;
import org.testng.annotations.Test;
import testngdemo.failedtest.FailedTestExecution;

public class PriorityDemo {

    @Test(priority = 1, groups = "smoke")
    public void testCheckY(){
        System.out.println("Test : Y");
    }

    @Test(priority = 2, enabled = true)
    public void testCheckR(){
        System.out.println("Test : R");
    }

    @Test(priority = 4, groups = "smoke")
    public void testCheckG(){

        System.out.println("Test : G");
    }

    @Test(description = "This consists a testing method:")
    public void testCheckH(){
        Assert.assertTrue(false);
        System.out.println("Test : H");
    }
}
