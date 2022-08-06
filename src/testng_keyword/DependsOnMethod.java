package testng_keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod {
  @Test (dependsOnMethods= {"y"})
  public void a() 
  {Reporter.log("a method runnijng", true);
  }
  
  @Test
  public void b() 
  {Reporter.log("b method runnijng", true);
  }
  
  @Test 
  public void n() 
  {Reporter.log("n method runnijng", true);
  }
  
  @Test (dependsOnMethods= {"a"})
  public void e() 
  {Reporter.log("e method runnijng", true);
  }
  
  @Test
  public void y() 
  {Reporter.log("y method runnijng", true);
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
