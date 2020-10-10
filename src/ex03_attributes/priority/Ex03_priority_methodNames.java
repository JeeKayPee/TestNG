package ex03_attributes.priority;

import org.testng.annotations.Test;

public class Ex03_priority_methodNames {
//test2>test1>test3
  @Test
  public void multiMatch() {
	  System.out.println("test 1");
  }
  @Test
  public void dropDown() {
	  System.out.println("test 2");
  }
  @Test
  public void nestElements() {
	  System.out.println("test 3");
  }
}

//is missing in Junit 3
//JUnit 5- @MethodSorters
