package ex02_assertions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Ex01_Introduction {
  @Test
  public void f() {
	  //Junit5
//	  assertEquals(expected, actual);
	  //Junit 4 or earlier - TestNG
//	  assertEquals(actual, expected);
	  assertEquals(1, 1);
	  assertEquals(1, 1, "add a purpose");
	  
	  assertTrue(true); 
	  assertTrue(true, "add a purpose");
	  
  }
}
