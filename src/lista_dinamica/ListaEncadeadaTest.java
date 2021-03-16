package lista_dinamica;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

class ListaEncadeadaTest {

	ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
	
	@Test
	void testListaVazia() {
		assertTrue(lista.estaVazia());
	}
	
	@Test
	void testListaNaoVazia() {
		lista.inserir(5);
		assertFalse(lista.estaVazia());
	}
	
	@Test
	void testInclusaoUmNumero() {
		lista.inserir(5);
		assertEquals(lista.obterNo(0).getInfo(), 5);
		assertEquals(lista.obterComprimento(), 1);
	}
	
	@Test
	void testInclusaoTresNumeros() {
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		assertEquals(lista.toString(), "15, 10, 5");
		assertEquals(lista.obterComprimento(), 3);
	}
	
	@Test
	void testBuscarInicioLista() {
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		assertEquals(lista.buscar(20).getInfo(), 20);
	}
	
	@Test
	void testBuscarMeioLista() {
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		assertEquals(lista.buscar(15).getInfo(), 15);
	}
	
	@Test
	void testBuscarDadoInexistente() {
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		assertEquals(lista.buscar(50), null);
	}
	
	@Test
	void testRetirarPrimeiroElemento() {
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		lista.retirar(20);
		assertEquals(lista.toString(), "15, 10, 5");
	}
	
	@Test
	void testRetirarElementoMeioLista() {
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		lista.retirar(15);
		assertEquals(lista.toString(), "20, 10, 5");
	}
	
	@Test
	void testObterNoPosicao0() {
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		assertEquals(lista.obterNo(0).getInfo(), 20);
	}
	
	@Test
	void testObterNoUltimaPosicao() {
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		assertEquals(lista.obterNo(3).getInfo(), 5);
	}
	
	@Test
	void testObterNoPosicaoInvalida() {
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
		    lista.obterNo(10);
		  });
	}
	
	@Test
	void testObterComprimentoListaVazia() {
		assertEquals(lista.obterComprimento(), 0);
	}
	
	@Test
	void testObterComprimentoListaNaoVazia() {
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		assertEquals(lista.obterComprimento(), 4);
	}

}
