package testng_keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityStudy {
  @Test
  public void D5() 
  { Reporter.log("D", true);
  }
  
  
  @Test(priority=4)
  public void Z() {
	  Reporter.log("Z", true);
  }
  
  
  @Test (priority=1)
  public void z() {
	  Reporter.log("z", true);
  }
  
  
  @Test(priority=2)
  public void A() {
	  Reporter.log("A", true);
  }
  
  
  
  @Test(priority=3)
  public void a() {
	  Reporter.log("a", true);
  }
}
