package ex04_invocations;

import org.testng.annotations.Test;

public class Ex03_timeout {
	@Test(timeOut = 3000)
	public void shouldFail() throws Exception {
		Thread.sleep(5000);
		//some implementation for network access
	}

	@Test(timeOut = 3000)
	public void shouldSucceed() throws Exception {
		Thread.sleep(1000);
	}
}
//Whenever you are testing something
// take a long time to return
// for instance - network access

// if a test fails to return with the alloted time - TestNG
// forcebiliy abort it and mark is as fail
