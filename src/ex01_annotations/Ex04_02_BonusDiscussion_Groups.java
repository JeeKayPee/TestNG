package ex01_annotations;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Ex04_02_BonusDiscussion_Groups {
	@Test
	public void f() {
	}
	/*
	 * Advanced TestNG
	 * 
	 * @BeforeGroup - before a test method in a 'given' group is run
	 * @AfterGroup - after all the test methods in a given group have been run
	 */

	@BeforeGroups
	public void beforeGroups() {

	}

	@AfterGroups
	public void afterGroups() {

	}
}
