package junit;

import static org.junit.jupiter.api.Assertions.*;

import java.rmi.server.ExportException;

import org.junit.jupiter.api.Test;

class J01Assertions {

	@Test
	void test() {
		//  fail("Not yet implemented");
	}
	
	
	@Test
	void testLength() {
		
		int actualLength = "Merhaba".length();
		int expectedLength = 6 ;
		
		//assertEquals(expectedLength, actualLength);
		//assertEquals(expectedLength, actualLength, "Length are not matched");
		//assertTrue(actualLength==expectedLength, " Actual length is not maching with expectedLength");
		//assertFalse(expectedLength==actualLength);
		

		
	}
	
	@Test
	void testUpperCase() {
		
		String actualValue = "hello".toUpperCase();
		String expectedVAlue ="HELLO";
		
		assertEquals(expectedVAlue , actualValue,"Eşit Değil");
	}
	
	@Test
	void testContainsMethod() {
		assertEquals(false, "Bekir".contains("t"));
	}

}
