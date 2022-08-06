package testng_keyword;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class InvocationCountStudy {
  @Test (invocationCount= 3)
  public void mytest()
  
 {
	  
	  Reporter.log("test 1", true);
  }
  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("aftermethod runnin", true);
  }
  

}
