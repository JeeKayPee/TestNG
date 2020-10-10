package ex04_invocations;

import org.testng.annotations.Test;

public class Ex02_Invocation_useCase {
	
	@Test(invocationCount = 1000)
	public void getShoudWork() {
		performGetonWebServer("http://myWebsite.com");
	}
	void performGetonWebServer(String URL) {
		//whatever is implementation
	}
	/*
	 * performGetonWebServer will be executed 1000 times
	 * test the executed sequentially
	 * this will reveal - how our web server handles scabaility
	 * possiblity of find a bug - related data consistency is very less
	 * 
	 * a realistic scenario - CONCURRENT ACCESS
	 * same rows in the db
	 * data enteredd in the db is consitant
	 * db testing - not in scope
	 * 
	 * TestNG Concurrancy support feature = timeout
	 */
}
