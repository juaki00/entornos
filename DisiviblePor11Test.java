package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Pruebas extra para la clase Calculadora
 * @author juaki
 *
 */
class DisiviblePor11Test {

	/**
	 * Prueba si un numero es divisible por 11
	 * @param valor numero entero que se comprueba si es divisible por 11
	 * @param esDivisible booleano que indica si es divisible o no
	 */
	@ParameterizedTest
	@MethodSource("valoresParaDivisiblePor11")
    public void testDivisiblePor11(int valor, boolean esDivisible) {
        if (esDivisible) {
        	System.out.println("El número " + valor + " SI es divisible por 11");
            assertEquals(0, valor % 11);
        } else {
        	System.out.println("El número " + valor + " NO es divisible por 11");
            assertNotEquals(0, valor % 11);
        }
    }

	 static Collection<Arguments> valoresParaDivisiblePor11() {
	        return Arrays.asList(
	                Arguments.of(33, true),
	                Arguments.of(68, false),
	                Arguments.of(127, false)
	        );
	    }
}
