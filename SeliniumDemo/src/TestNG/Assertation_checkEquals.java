package TestNG;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertation_checkEquals {
 String name="selva";
 String nm="selva";
 boolean check=true;
 boolean check1=false;
 @Test
 public void checkEquals() {
	 Assert.assertEquals(nm, name); 
 }
 @Test
 public void checkUnEquals() {
	 Assert.assertNotEquals(nm, "Selva");
 }
 @Test
 public void checkTrue() {
	 Assert.assertTrue(check, "the value is true");
 }
 @Test
 public void checkfalse() {
	 Assert.assertFalse(check1, "the value is true");
 } 
}