package ex07_exceptions;

import java.io.IOException;

import org.testng.annotations.Test;

public class Ex03_ExceptionMessageTest {
	/*
	 * Verifies the exception message based on the exact error message thrown
	 */
	@Test(expectedExceptions = { IOException.class }, expectedExceptionsMessageRegExp = "Pass Message Test")
	public void exceptionMsgTestOne() throws Exception {

		throw new IOException("Pass Message Test");
	}
	/*
	 * Verifies the exception message using the regular expression
	 * This test will verify the exception message contains the text "" in it
	 *  based on the exact error message thrown
	 */
	@Test(expectedExceptions = { IOException.class }, expectedExceptionsMessageRegExp = ".* Message .*")
	public void exceptionMsgTestTwo() throws Exception {

		throw new IOException("Pass Message Test");
	}
	/*
	 * Verifies the exception message based on the exact error message. 
	 * This is to show that TestNG fails a test, when the exception message does not match
	 * 
	 */
	@Test(expectedExceptions = { IOException.class }, expectedExceptionsMessageRegExp = "Pass Message Test")
	public void exceptionMsgTestThree() throws Exception {

		throw new IOException("Fail Message Test");
	}
}
