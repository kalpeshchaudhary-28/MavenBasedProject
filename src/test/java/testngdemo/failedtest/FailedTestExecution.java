package testngdemo.failedtest;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailedTestExecution implements IRetryAnalyzer {

    int reRun = 0;
    int maxRun = 4;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (reRun < maxRun){
            reRun++;
            return true;
        }
        return false;
    }
}
