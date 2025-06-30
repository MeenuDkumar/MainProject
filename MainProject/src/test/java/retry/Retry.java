package retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer      // iretryAnalyzerAnalyzer interface, retry is the ABSTRACT method of iretry , TO EXECUTE THE  FAILED TEST CASE we user retry method MAXIMUM 2 TIMES WE CAN EXECUTE  

{
int counter = 0;
int retryLimit = 2;

public boolean retry(ITestResult result) {

	if (counter < retryLimit) {
		counter++;
		return true;
	}
	return false;
}



	

}
