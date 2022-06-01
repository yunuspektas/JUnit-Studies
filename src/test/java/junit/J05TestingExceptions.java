package junit;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class J05TestingExceptions {
	
	// TEST ETTİĞİMİZ KODUN BİZİM BEKLEDİĞİMİZ EXCEPTİONI FIRLATTI MI  test örneği?
	@Test
	void testException1() {
		
		String str ="Hello World";
		
		assertThrows(NullPointerException.class, ()->{
			System.out.println("testExeception is run");
			str.length();
		});
		
		
	}
	
	@Test 
	void testExeption2() {
		String str ="Java";
		
		// NumberFormatExeption.class yerine Exception.class da yazsaydık test geçerdi cünki parent
		assertThrows(NumberFormatException.class, ()->{
			Integer.parseInt(str);
			
		});
	}
	
	@Test
	void testException3 () {
		
		int x=123;
		int y=0;
		
		assertThrows(ArithmeticException.class, ()->{
			int result = x/y;
			
		});
	}
	void testException4 () {
		
		int x=123;
		int y=0;
		
		assertThrows(ArithmeticException.class, ()->{
			divide(x,y);
			
		});
	}
	
	
	
	private int divide(int a, int b) {
		return a/b;
	}
	
	@Test
	void testException5() {
		
		int age = -4 ;
		// 2.parametre executable olması gerektiği için lambda kullanmamız gerekiyor
		assertThrows(IllegalArgumentException.class, ()-> checkAge(age));
	}
	
	private void checkAge(int age) {
		if(age<0) {
			throw new IllegalArgumentException();
			
		}else {
			System.out.println(age);
		}
	}

}
