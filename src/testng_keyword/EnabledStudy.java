package testng_keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledStudy {
  @Test (enabled= true)
  public void A() 
  {
	 Reporter.log("A method", true); 
  }
  
  
  @Test
  public void B() 
  {
	  Reporter.log("b method", true);  
  }
  
  
  @Test
  public void C() 
  {
	  Reporter.log("c method", true);   
  }
  
  
  @Test
  public void D() 
  {
	  Reporter.log("d method", true);  
  }
  
  @Test
  public void E() 
  {
	  Reporter.log("e method", true);   
  }
  
}
