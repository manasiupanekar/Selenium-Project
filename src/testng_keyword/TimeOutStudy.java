package testng_keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutStudy {
  @Test (timeOut= 1000)
  public void method1() throws InterruptedException
 
  {    Thread.sleep(900);
	  Reporter.log("method1 running", true);
  }
  
  @Test
  public void method2()
 
  {
	  Reporter.log("method2 running", true);
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
