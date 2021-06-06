package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterization {
  @Test
  @Parameters("Name")
  public void f(String Name) {
	  System.out.println("My name is "+Name);
  }
}