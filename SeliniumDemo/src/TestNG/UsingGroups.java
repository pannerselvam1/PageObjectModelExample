package TestNG;

import org.testng.annotations.Test;

public class UsingGroups {
    @Test(groups = {"moto1"})
	public void moto1(){
		System.out.println("moto1 testing");
	}
    @Test(groups = {"moto2"})
	public void moto2(){
		System.out.println("moto2 testing");
	}
    @Test(groups = {"apple"})
	public void apple(){
		System.out.println("apple testing");
	}
    @Test(groups = {"vivo"})
	public void vivo(){
		System.out.println("vivo testing");
	}
    @Test(groups = {"samsung"})
	public void samsung(){
		System.out.println("samsung testing");
	}
}
