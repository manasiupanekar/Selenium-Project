package testng1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void method1() 
  {
	Reporter.log("only string"); 
  }
  
  @Test
  public void method2() 
  {
	Reporter.log("using boolean", true); 
  }
  
  @Test
  public void method3() 
  {
	Reporter.log("using boolean false", false); 
  }
  
  @Test
  public void method4() 
  {
	System.out.println("syso ");
  }
  
  
  
  
  
  
}
