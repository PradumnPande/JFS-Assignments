package junit;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddTest {
	@BeforeAll
	static void setup() {
		System.out.println("@Before all it will be executed");
	}
	
	@BeforeEach
	void setupThis() {
		System.out.println("@Before each it wil executed");
	}
	

	@Test
	void addtest() {
		System.out.println("Test one executed");
		MyJUnitclass u=new MyJUnitclass();
		int res=u.add(10, 10);
		assertEquals(20,res);
	}
	
	@Test
	void addtestPos() {
		System.out.println("Test two executed");
		MyJUnitclass u=new MyJUnitclass();
		int res=u.add(2, 13);
		assertEquals(15,res);
	}
     
	@AfterEach
	void tearThis() {
		System.out.println("@After each it will be executed");
	}
	
	@AfterAll
	static void tear() {
		System.out.println("@After all it wil be executed");
	}
}
