package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import clases.Calculadora;

/**
 * Test de prueba que muestra la tabla del 5
 * @author juaki
 *
 */
class TablaMultiplicarDel5Test {
	static int iterador;
	
	/**
	 *  Antes de todo inicializamos el iterador a 1
	 */
	@BeforeAll
	public static  void antesDeTodo() {
		iterador = 0;
	}
	
	@BeforeEach
	public void antesDeCada() {
		iterador++;
	}

	/**
	 * Muestra la tabla del 5
	 */
	@RepeatedTest(10)
    public void testTablaMultiplicarDel5() {
        int numero = iterador;
        //iterador++;
        int resultadoEsperado = Calculadora.multiplica(5, numero);
        int resultado = 5 * numero;
        assertEquals(resultado, resultadoEsperado);
        System.out.println(numero + " x 5 = " + resultado);
    }

}
