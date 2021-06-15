package buscas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ListaOrdenadaTest {

	@Test
	void test_inserir_ordenado_caso_01() {
		ListaOrdenada<Integer> lista = new ListaOrdenada<Integer>();
		lista.inserir(100);
		lista.inserir(20);
		lista.inserir(70);
		lista.inserir(1);
		String expected = "1,20,70,100";
		assertEquals(expected, lista.toString());
	}

	@Test
	void test_buscar_dado_existente_caso_02() {
		ListaOrdenada<Integer> lista = new ListaOrdenada<Integer>();
		lista.inserir(0);
		lista.inserir(10);
		lista.inserir(20);
		lista.inserir(30);
		lista.inserir(40);
		lista.inserir(50);
		lista.inserir(60);
		lista.inserir(70);
		lista.inserir(80);
		lista.inserir(90);
		lista.inserir(100);
		assertEquals(2, lista.buscar(20));
	}

	@Test
	void test_buscar_dado_existente_caso_03() {
		ListaOrdenada<Integer> lista = new ListaOrdenada<Integer>();
		lista.inserir(0);
		lista.inserir(10);
		lista.inserir(20);
		lista.inserir(30);
		lista.inserir(40);
		lista.inserir(50);
		lista.inserir(60);
		lista.inserir(70);
		lista.inserir(80);
		lista.inserir(90);
		lista.inserir(100);
		assertEquals(4, lista.buscar(40));
	}

	@Test
	void test_buscar_dado_existente_caso_04() {
		ListaOrdenada<Integer> lista = new ListaOrdenada<Integer>();
		lista.inserir(0);
		lista.inserir(10);
		lista.inserir(20);
		lista.inserir(30);
		lista.inserir(40);
		lista.inserir(50);
		lista.inserir(60);
		lista.inserir(70);
		lista.inserir(80);
		lista.inserir(90);
		lista.inserir(100);
		assertEquals(7, lista.buscar(70));
	}

	@Test
	void test_buscar_dado_existente_caso_05() {
		ListaOrdenada<Integer> lista = new ListaOrdenada<Integer>();
		lista.inserir(0);
		lista.inserir(10);
		lista.inserir(20);
		lista.inserir(30);
		lista.inserir(40);
		lista.inserir(50);
		lista.inserir(60);
		lista.inserir(70);
		lista.inserir(80);
		lista.inserir(90);
		lista.inserir(100);
		assertEquals(10, lista.buscar(100));
	}

	@Test
	void test_buscar_dado_inexistente_caso_06() {
		ListaOrdenada<Integer> lista = new ListaOrdenada<Integer>();
		lista.inserir(0);
		lista.inserir(10);
		lista.inserir(20);
		lista.inserir(30);
		lista.inserir(40);
		lista.inserir(50);
		lista.inserir(60);
		lista.inserir(70);
		lista.inserir(80);
		lista.inserir(90);
		lista.inserir(100);
		assertEquals(-1, lista.buscar(85));
	}
	
	@Test
	void test_prova_caso07() {
		ListaOrdenada<Integer> lista = new ListaOrdenada<Integer>();
		lista.inserir(1);
		lista.inserir(17);
		lista.inserir(20);
		lista.inserir(33);
		lista.inserir(43);
		lista.inserir(75);
		lista.inserir(80);
		lista.inserir(88);
		lista.inserir(92);
		lista.inserir(95);
		lista.inserir(98);
		assertEquals(5, lista.buscar(75));
	}
	
	@Test
	void test_prova_caso08() {
		ListaEstatica<Integer> lista = new ListaEstatica<Integer>();
		lista.inserir(1);
		lista.inserir(7);
		lista.inserir(20);
		lista.inserir(28);
		lista.inserir(33);
		lista.inserir(43);
		lista.inserir(55);
		lista.inserir(62);
		lista.inserir(66);
		lista.inserir(75);
		lista.inserir(98);
		assertEquals(-1, lista.buscar(35));
	}

}
