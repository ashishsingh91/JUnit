package com.ashish.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

//	@Test
//	public void test() {
//		// AACD => CD ACD => CD CDEF=>CDEF CDAA => CDAA
//		
//		
//		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
//		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
//		
//	}
	StringHelper helper;
	
	@Before
	public void before(){
		helper = new StringHelper();
	}
	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	// ABCD => false, ABAB => true, AB => true, A => false
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		assertFalse( 
				helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		assertTrue( 
				helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

}


