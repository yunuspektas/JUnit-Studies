package junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class J02Assertions {

	@Test
	void testToFindMin() {
		
		//assertTrue(Math.min(11.5, 14.4)==11.5);
		
		// condition sonucu false ise test success olur
		//assertFalse(Math.min(12.3, 13.5)!= 12.3 );
		
		assertEquals(14.5, Math.min(14.5, 17.6));
	}
	
	@Test
	void testArrays() {
		
		String str ="JUnit5 is better than JUnit4";
		
		String [] actualArr = str.split(" ");
		String [] ecpectedArr = {"JUnit5","is", "better","than","JUnit4"};
		
		assertTrue(Arrays.equals(ecpectedArr, actualArr));
		
	}

}
