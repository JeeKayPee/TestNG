package ex01_annotations;

import org.testng.annotations.Test;

public class Ex01_test {
  @Test
  public void methodName() { //can use any methodName - missing in JUnit3
	  System.out.println("Inside my TestNG class");
  }
}
