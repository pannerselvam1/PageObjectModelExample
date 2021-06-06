package TestNG;

import org.testng.annotations.Test;

public class TestUsingPriority {
  
//hint: testNG runs a methods by alphapatical order..so we use priority
@Test (priority=0,enabled = true)
public void startTheCar() {
 System.out.println("start the car");
}
//depends on method..run by depend method true
@Test(priority=1,dependsOnMethods ="startTheCar" )
public void firstGear() {
 System.out.println("apply first gear");
}
@Test(priority=2,dependsOnMethods ="startTheCar")
public void SecondGear() {
 System.out.println("apply second gear");
}
@Test(priority=3,dependsOnMethods ="startTheCar")
public void thirdGear() {
 System.out.println("apply third gear");
}
@Test(priority=4,dependsOnMethods ="startTheCar")
public void stopCar() {
 System.out.println("stop the car");
}
}
