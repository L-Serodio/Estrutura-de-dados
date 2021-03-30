package pilhas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PilhaVetorTest {
	
	@Test
	void testEstaVazia() {
		PilhaVetor<Integer> pilha = new PilhaVetor<Integer>(5);
		assertTrue(pilha.estaVazia());
	}
	
	@Test
	void testNaoEstaVazia() {
		PilhaVetor<Integer> pilha = new PilhaVetor<Integer>(5);
		pilha.push(10);
		assertFalse(pilha.estaVazia());
	}
	
	@Test
	void testPushPop() {
		PilhaVetor<Integer> pilha = new PilhaVetor<Integer>(10);
		pilha.push(10);
		pilha.push(20);
		pilha.push(30);
		assertEquals(pilha.pop(), 30);
		assertEquals(pilha.pop(), 20);
		assertEquals(pilha.pop(), 10);
		assertTrue(pilha.estaVazia());
	}
	
	@Test
	void testPilhaCheiaException() {
		PilhaVetor<Integer> pilha = new PilhaVetor<Integer>(3);
		pilha.push(10);
		pilha.push(20);
		pilha.push(30);
		Assertions.assertThrows(PilhaCheiaException.class, () -> {
			pilha.push(40);
		  });
	}
	
	@Test
	void testPilhaVaziaException() {
		PilhaVetor<Integer> pilha = new PilhaVetor<Integer>(5);
		Assertions.assertThrows(PilhaVaziaException.class, () -> {
		    pilha.pop();
		  });
	}
	
	@Test
	void testPeek() {
		PilhaVetor<Integer> pilha = new PilhaVetor<Integer>(5);
		pilha.push(10);
		pilha.push(20);
		pilha.push(30);
		assertEquals(pilha.peek(), 30);
		assertEquals(pilha.pop(), 30);
	}
	
	@Test
	void testLiberar() {
		PilhaVetor<Integer> pilha = new PilhaVetor<Integer>(5);
		pilha.push(10);
		pilha.push(20);
		pilha.push(30);
		pilha.liberar();
		assertTrue(pilha.estaVazia());
	}
	
	@Test
	void testConcatenarPilhas() {
		PilhaVetor<Integer> pilha = new PilhaVetor<Integer>(5);
		pilha.push(10);
		pilha.push(20);
		pilha.push(30);
		PilhaVetor<Integer> p = new PilhaVetor<Integer>(2);
		p.push(40);
		p.push(50);
		pilha.concatenar(p);
		assertEquals(pilha.toString(), "50, 40, 30, 20, 10");
		assertEquals(p.toString(), "50, 40");
	}
}
