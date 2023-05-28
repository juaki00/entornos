package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import clases.Calculadora;

/**
 * Pruebas para la clase Calculadora
 * @author juaki
 *
 */
class CalculadoraTest {
	int esperado;
	int actual;
	

	/**
	 * Antes de todo imprimimos COMIENZO DE LAS OPERACIONES
	 */
	@BeforeAll
	public static  void antesDeTodo() {
		System.out.println("COMIENZO DE LAS OPERACIONES");
	}
	
	/**
	 * Antes de cada metodo imprimimos una linea
	 */
	@BeforeEach
	public void antesDeCada() {
		System.out.println("----------------------------------");
	}
	
	/**
	 * Despues de cada metodo imprimimos una linea doble
	 */
	@AfterEach
	public void despuesDeCada() {
		System.out.println("==================");
	}
	
	/**
	 * Despues de todo imprimimos FIN DE LAS OPERACIONES
	 */
	@AfterAll
	public static  void despuesDeTodo() {
		System.out.println("FIN DE LAS OPERACIONES");
	}
	
	/**
	 * Testeo del metodo sumar con valores correctos
	 */
	@Test
	public void testSumarOk(){
		esperado = 5;
		actual = Calculadora.suma(2, 3);
		
		assertEquals(esperado, actual);
		
		System.out.println("Test Sumar OK");
		System.out.println("El resultado esperado de la suma es " + esperado );
		System.out.println("El resultado actual de la suma es " + actual );
	}
	
	/**
	 * Testeo del metodo sumar con valores incorrectos
	 */
	@Test
	public void testSumarFallo(){
		esperado = 5;
		actual = Calculadora.suma(2, 6);
		
		assertNotEquals(esperado, actual);
		
		System.out.println("Test Sumar Fallo");
		System.out.println("El resultado esperado de la suma es " + esperado );
		System.out.println("El resultado actual de la suma es " + actual );
	}
	
	/**
	 * Testeo del metodo restar con valores correctos
	 */
	@Test
	public void testRestarOk(){
		esperado = 7;
		actual = Calculadora.resta(9, 2);
		
		assertEquals(esperado, actual);
		
		System.out.println("Test Restar OK");
		System.out.println("El resultado esperado de la suma es " + esperado );
		System.out.println("El resultado actual de la suma es " + actual );
	}
	
	/**
	 * Testeo del metodo restar con valores incorrectos
	 */
	@Test
	public void testRestarFallo(){
		esperado = 7;
		actual = Calculadora.resta(9, 2);
		
		assertEquals(esperado, actual);
		
		System.out.println("Test Restar Fallo");
		System.out.println("El resultado esperado de la suma es " + esperado );
		System.out.println("El resultado actual de la suma es " + actual );
	}
	
	/**
	 * Testeo del metodo multiplicar con valores correctos
	 */
	@Test
	public void testMultiplicarOk(){
		esperado = 6;
		actual = Calculadora.multiplica(2, 3);
		
		assertEquals(esperado, actual);
		
		System.out.println("Test Multiplicar OK");
		System.out.println("El resultado esperado de la suma es " + esperado );
		System.out.println("El resultado actual de la suma es " + actual );
	}

	/**
	 * Testeo del metodo multiplicar con valores incorrectos
	 */
	@Test
	public void testMultiplicarFallo(){
		esperado = 5;
		actual = Calculadora.multiplica(2, 6);
		
		assertNotEquals(esperado, actual);
		
		System.out.println("Test Multiplicar Fallo");
		System.out.println("El resultado esperado de la suma es " + esperado );
		System.out.println("El resultado actual de la suma es " + actual );
	}
	

	/**
	 * Testeo del metodo dividir con valores correctos
	 */
	@Test
	public void testDividirOk(){
		esperado = 5;
		actual = Calculadora.divide(10, 2);
		
		assertEquals(esperado, actual);
		
		System.out.println("Test Dividir OK");
		System.out.println("El resultado esperado de la suma es " + esperado );
		System.out.println("El resultado actual de la suma es " + actual );
	}

	/**
	 * Testeo del metodo dividir con valores incorrectos
	 */
	@Test
	public void testDividirFallo(){
		esperado = 5;
		actual = Calculadora.multiplica(10, 5);
		
		assertNotEquals(esperado, actual);
		
		System.out.println("Test Dividir Fallo");
		System.out.println("El resultado esperado de la suma es " + esperado );
		System.out.println("El resultado actual de la suma es " + actual );
	}
	
	

  
    
    
}

