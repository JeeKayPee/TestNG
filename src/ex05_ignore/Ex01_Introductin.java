package ex05_ignore;

import org.testng.annotations.Test;

public class Ex01_Introductin {
  @Test
  public void f1() {
	  System.out.println("test 1");
  }
  @Test(enabled = false)
  public void f2() {
	  System.out.println("test 2");
	  System.out.println("Look I am still under development - please ignore me");
  }
  @Test
  public void f3() {
	  System.out.println("test 3");
	  
  }
}
