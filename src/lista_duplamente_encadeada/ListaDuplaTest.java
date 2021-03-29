package lista_duplamente_encadeada;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ListaDuplaTest {

	ListaDupla<Integer> lista = new ListaDupla<Integer>();
	
	@Test
	void testInclusao() {
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		assertEquals(lista.toString(), "20, 15, 10, 5");
	}
	
	@Test
	void testBuscarInicio() {
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		assertEquals(lista.buscar(20).getInfo(), 20);
	}
	
	
	@Test
	void testBuscarMeio() {
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		assertEquals(lista.buscar(10).getInfo(), 10);
	}
	
	@Test
	void testRemoverInicio() {
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		lista.retirar(20);
		assertEquals(lista.toString(), "15, 10, 5");
	}
	
	@Test
	void testRemoverMeio() {
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		lista.retirar(10);
		assertEquals(lista.toString(), "20, 15, 5");
	}
	
	@Test
	void testRemoverFim() {
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		lista.retirar(5);
		assertEquals(lista.toString(), "20, 15, 10");
	}
	
	@Test
	void testLiberar() {
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		lista.liberar();
		assertEquals(lista.buscar(20).getAnterior(), null);
		assertEquals(lista.buscar(20).getProximo(), null);
		assertEquals(lista.buscar(15).getProximo(), null);
		assertEquals(lista.buscar(15).getAnterior(), null);
		assertEquals(lista.buscar(10).getProximo(), null);
		assertEquals(lista.buscar(10).getAnterior(), null);
		assertEquals(lista.buscar(5).getProximo(), null);
		assertEquals(lista.buscar(5).getAnterior(), null);
	} 

}
