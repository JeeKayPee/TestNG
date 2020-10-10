package ex03_attributes.priority;

import org.testng.annotations.Test;

public class Ex02_priorityChangeOrder {
//	f1>f2>f3
  @Test
  public void f1() {
	  System.out.println("test 1");
  }
  @Test
  public void f2() {
	  System.out.println("test 2");
  }
  @Test
  public void f3() {
	  System.out.println("test 3");
  }
}
