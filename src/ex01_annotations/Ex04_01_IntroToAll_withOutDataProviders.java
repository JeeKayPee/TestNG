package ex01_annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Ex04_01_IntroToAll_withOutDataProviders {
  @Test //test method
  public void theTestMethod1() {
	  System.out.println("The Test Method 1");
  }
  @Test //test method
  public void theTestMethod2() {
	  System.out.println("The Test Method 2");
  }
  
  //@BeforeMethod - before a test method is run
  //@AfterMethod - after a test method is run
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Inside BM");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("Inside AM");
  }

  //@BeforeClass - before a test class starts
  //@After class - after all the test methods in a certain class have been run
  
  //Bonus discussion - VERY ADVANCED - home work
  // to be specific
  // @BeforeClass and @Afterclass wrap instances, not classes
  // if you happen to create two instances of a test
  // example class myTest in your suite definition
  // the corresponding @BeforeClass and @AfterClass will be run twice
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Inside BC");
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("Inside AC");
  }

  //@BeforeTest - before a test starts
  //@AfterTest - after all the test methods in a certain test has been run
  //remember - a test is made of one or more classes
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Inside BT");
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("Inside AT");
  }

  //@BeforeSuite - before a suite starts
  //@AfterSuite - after all the tests in a certain suite has been run
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Inside BS");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Inside AS");
  }

}
