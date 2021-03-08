import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ListaEstaticaTest {

	@Test
	void test_inserir_caso01() {
		ListaEstatica lista = new ListaEstatica();
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		assertEquals(lista.toString(), "5, 10, 15, 20");
	}
	
	@Test
	void test_getTamanho_caso02() {
		ListaEstatica lista = new ListaEstatica();
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		assertEquals(lista.getTamanho(), 4);
	}
	
	@Test
	void test_buscar_elemento_existente_caso03() {
		ListaEstatica lista = new ListaEstatica();
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		assertEquals(lista.buscar(15), 2);
	}
	
	@Test
	void test_buscar_elemento_inexistente_caso04() {
		ListaEstatica lista = new ListaEstatica();
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		assertEquals(lista.buscar(30), -1);
	}
	
	@Test
	void test_retirar_caso05() {
		ListaEstatica lista = new ListaEstatica();
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		lista.retirar(10);
		assertEquals(lista.toString(), "5, 15, 20");
		assertEquals(lista.getTamanho(), 3);
	}
	
	@Test
	void test_redimensionar_caso06() {
		ListaEstatica lista = new ListaEstatica();
		for (int i = 1; i <= 15; i++) {
			lista.inserir(i);
		}
		assertEquals(lista.toString(), "1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15");
		assertEquals(lista.getTamanho(), 15);
	}
	
	@Test
	void test_obterElemento_caso07() {
		ListaEstatica lista = new ListaEstatica();
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		assertEquals(lista.obterElemento(3), 20);
	}
	
	@Test
	void test_obterElemento_exception_caso08() {
		ListaEstatica lista = new ListaEstatica();
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
		    lista.obterElemento(5);
		  });
	}
	
	@Test
	void test_liberar_caso09() {
		ListaEstatica lista = new ListaEstatica();
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		lista.liberar();
		assertTrue(lista.estaVazia());
	}

}
