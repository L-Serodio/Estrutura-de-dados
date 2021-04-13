package filas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FilaVetorTest {

	@Test
	void testFilaVetor01() {
		FilaVetor<String> fila = new FilaVetor<String>(5);
		fila.inserir("A");
		fila.inserir("B");
		fila.inserir("C");
		fila.retirar();
		fila.inserir("D");
		fila.inserir("E");
		fila.retirar();
		fila.retirar();
		assertEquals(3, fila.getInicio());
	}
	
	@Test
	void testFilaVetor02() {
		FilaVetor<Integer> fila = new FilaVetor<Integer>(10);
		fila.inserir(10);
		fila.inserir(20);
		fila.inserir(30);
		fila.retirar();
		fila.inserir(fila.retirar());
		fila.inserir(40);
		assertEquals("10,20,C,", fila.toString());
	}

}
