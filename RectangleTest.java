package test;

import static org.junit.jupiter.api.Assertions.*;

import projectRectangle.Rectangle;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class RectangleTest {
	Rectangle rectangulo1, rectangulo2, rectangulo3, rectangulo4, rectangulo5;
	@BeforeAll
	static void setUpBeforeClass(){
		System.out.println("Setup for test complete.");
	}

	@AfterAll
	static void tearDownAfterClass(){
		System.out.println("Test completed.");
	}


	@Test
	void test1() {
		rectangulo1 = new Rectangle();
		int hValido = 0;
		int wValido = 0;
		assertEquals(hValido, rectangulo1.getH());
		System.out.println("Test 1 completed successfully");
	}
	
	@Test
	void test2() {
		rectangulo1 = new Rectangle();
		int hValido = 0;
		int wValido = 0;
		int aValido = 0;
		assertEquals(hValido, rectangulo1.getH());
		assertEquals(wValido, rectangulo1.getW());
		assertEquals(aValido, rectangulo1.getA());
		System.out.println("Test 2 completed successfully");
	}
	
	@Test
	void test3() {
		rectangulo1 = new Rectangle(10,20);
		int hValido = 10;
		int wValido = 20;
		int aValido = 200;
		assertEquals(hValido, rectangulo1.getH());
		assertEquals(wValido, rectangulo1.getW());
		assertEquals(aValido, rectangulo1.getA());
		System.out.println("Test 3 completed successfully");
	}
	
	@Test
	void test4() {
		int hValido = 0, wValido = 0, aValido;
		rectangulo1 = new Rectangle();
		rectangulo2 = new Rectangle(2,3);
		rectangulo3 = new Rectangle(4,6);
		rectangulo4 = new Rectangle(6,9);
		rectangulo5 = new Rectangle(8,12);
		Rectangle[] arrayRectangulos = {rectangulo1, rectangulo2, rectangulo3, rectangulo4, rectangulo5 };
		
		for (Rectangle r: arrayRectangulos) {
			aValido = hValido * wValido;
			assertEquals(hValido, r.getH());
			assertEquals(wValido, r.getW());
			assertEquals(aValido, r.getA());
			hValido+=2;
			wValido+=3;
		}
		System.out.println("Test 4 completed successfully");
	}
	
	@Test
	void test5() {
		int hValido = 0, wValido = 0, aValido;
		rectangulo1 = new Rectangle();
		rectangulo2 = new Rectangle(11,7);
		rectangulo3 = new Rectangle(22,14);
		rectangulo4 = new Rectangle(33,21);
		rectangulo5 = new Rectangle(44,28);
		Rectangle[] arrayRectangulos = {rectangulo1, rectangulo2, rectangulo3, rectangulo4, rectangulo5 };
		
		for (Rectangle r: arrayRectangulos) {
			aValido = hValido * wValido;
			assertEquals(hValido, r.getH());
			assertEquals(wValido, r.getW());
			assertEquals(aValido, r.getA());
			hValido+=11;
			wValido+=7;
			
		}
		System.out.println("Test 5 completed successfully");
	}

	@Test
	void test6() {
		int hValido = 0, wValido = 0, aValido;
		int i = 0;
		rectangulo1 = new Rectangle();
		rectangulo2 = new Rectangle(11,7);
		rectangulo3 = new Rectangle(22,14);
		rectangulo4 = new Rectangle(33,21);
		rectangulo5 = new Rectangle(44,28);
		Rectangle[] arrayRectangulos = {rectangulo1, rectangulo2, rectangulo3, rectangulo4, rectangulo5 };
		
		for (Rectangle r: arrayRectangulos) {
			aValido = hValido * wValido;
			assertEquals(hValido, r.getH());
			assertEquals(wValido, r.getW());
			assertEquals(aValido, r.getA());
			hValido+=11;
			wValido+=7;
			
			System.out.println("[" + i + "] height es " + r.getH() + ", width es " + r.getW() + ", área es " + r.getA());
		}
		System.out.println("Test 6 completed successfully");
	}
}
