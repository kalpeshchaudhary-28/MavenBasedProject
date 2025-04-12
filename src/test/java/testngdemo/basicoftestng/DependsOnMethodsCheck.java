package testngdemo.basicoftestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodsCheck {

    @Test
    public void checkLogin(){
        //Assert.assertTrue(false); //False and wouldn't pass
        Assert.assertTrue(true); //True and passed
        System.out.println("Verify loginPage");
    }

    @Test(dependsOnMethods = "checkLogin")
    public void checkHomepage(){
        System.out.println("Verify homePage");
    }

    @Test
    public void onBoarding(){
        System.out.println("Verify onBoarding");
    }
}
