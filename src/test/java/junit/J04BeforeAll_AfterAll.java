package junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class J04BeforeAll_AfterAll {
	// beforeeach her test öncesinde çalışırken beforeall bütün testlerin öncesinde calışır
	
	@BeforeAll // static olanlar en başta çalışltığı için metodlar static tanımlandı
	static void beforeAll(TestInfo info) {
		System.out.println(info.getDisplayName()+" open a file");
		
	}
	
	@Test
	void testWithArrays() {
		
		String str ="Unıt test with JUnıt5";
		String [] actualResult=str.split(" ");
		String [] expectedResult = {"Unit", "test", "with","JUnit5"};
		
		assertArrayEquals(actualResult, expectedResult,"Arrays are not equal");
	}
	
	@AfterAll
	static void afterAll(TestInfo info) {
		
		System.out.println(info.getDisplayName()+" closed file");
		
	}

}
