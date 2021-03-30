package pilhas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PilhaListaTest {

	@Test
	void testEstaVazia() {
		PilhaLista<Integer> pilha = new PilhaLista<Integer>();
		assertTrue(pilha.estaVazia());
	}
	
	@Test
	void testNaoEstaVazia() {
		PilhaLista<Integer> pilha = new PilhaLista<Integer>();
		pilha.push(10);
		assertFalse(pilha.estaVazia());
		//assertEquals("10", pilha.toString());
	}
	
	@Test
	void testPushPop() {
		PilhaLista<Integer> pilha = new PilhaLista<Integer>();
		pilha.push(10); pilha.push(20); pilha.push(30);
		assertEquals(30, pilha.pop());
		assertEquals(20, pilha.pop());
		assertEquals(10, pilha.pop());
		assertTrue(pilha.estaVazia());
	}
	
	@Test
	void testPeek() {
		PilhaLista<Integer> pilha = new PilhaLista<Integer>();
		pilha.push(10); pilha.push(20); pilha.push(30);
		assertEquals(30, pilha.peek());
		assertEquals(30, pilha.pop());
	}
	
	@Test
	void testLiberar() {
		PilhaLista<Integer> pilha = new PilhaLista<Integer>();
		pilha.push(10); pilha.push(20); pilha.push(30);
		pilha.liberar();
		assertTrue(pilha.estaVazia());
	}
}
