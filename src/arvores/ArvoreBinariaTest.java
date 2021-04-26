package arvores;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArvoreBinariaTest {

	@Test
	void test_arvore_vazia() {
		ArvoreBinaria<Integer> arvoreBinaria = new ArvoreBinaria<Integer>();
		assertTrue(arvoreBinaria.estaVazia());
	}
	
	@Test
	void test_arvore_nao_vazia() {
		ArvoreBinaria<Integer> arvoreBinaria = new ArvoreBinaria<Integer>();
		NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<Integer>(5);
		arvoreBinaria.setRaiz(no1);
		assertFalse(arvoreBinaria.estaVazia());
	}
	
	@Test
	void test_toString_pre_ordem() {
		ArvoreBinaria<Integer> arvoreBinaria = new ArvoreBinaria<Integer>();
		NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<Integer>(6);
		NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<Integer>(5);
		NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<Integer>(3, no5, no6);
		NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<Integer>(4);
		NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<Integer>(2, null, no4);
		NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<Integer>(1, no2, no3);
		arvoreBinaria.setRaiz(no1);
		assertEquals("<1<2<><4<><>>><3<5<><>><6<><>>>>", arvoreBinaria.toString());
	}
	
	@Test
	void test_pertence_no_raiz() {
		ArvoreBinaria<Integer> arvoreBinaria = new ArvoreBinaria<Integer>();
		NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<Integer>(6);
		NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<Integer>(5);
		NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<Integer>(3, no5, no6);
		NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<Integer>(4);
		NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<Integer>(2, null, no4);
		NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<Integer>(1, no2, no3);
		arvoreBinaria.setRaiz(no1);
		assertTrue(arvoreBinaria.pertence(1));
	}
	
	@Test
	void test_pertence_no_nao_raiz_e_nao_folha() {
		ArvoreBinaria<Integer> arvoreBinaria = new ArvoreBinaria<Integer>();
		NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<Integer>(6);
		NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<Integer>(5);
		NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<Integer>(3, no5, no6);
		NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<Integer>(4);
		NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<Integer>(2, null, no4);
		NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<Integer>(1, no2, no3);
		arvoreBinaria.setRaiz(no1);
		assertTrue(arvoreBinaria.pertence(3));
	}
	
	@Test
	void test_pertence_no_folha() {
		ArvoreBinaria<Integer> arvoreBinaria = new ArvoreBinaria<Integer>();
		NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<Integer>(6);
		NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<Integer>(5);
		NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<Integer>(3, no5, no6);
		NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<Integer>(4);
		NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<Integer>(2, null, no4);
		NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<Integer>(1, no2, no3);
		arvoreBinaria.setRaiz(no1);
		assertTrue(arvoreBinaria.pertence(6));
	}
	
	@Test
	void test_nao_pertence() {
		ArvoreBinaria<Integer> arvoreBinaria = new ArvoreBinaria<Integer>();
		NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<Integer>(6);
		NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<Integer>(5);
		NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<Integer>(3, no5, no6);
		NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<Integer>(4);
		NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<Integer>(2, null, no4);
		NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<Integer>(1, no2, no3);
		arvoreBinaria.setRaiz(no1);
		assertFalse(arvoreBinaria.pertence(10));
	}
	
	@Test
	void test_contar_nos_arvore_altura_2() {
		ArvoreBinaria<Integer> arvoreBinaria = new ArvoreBinaria<Integer>();
		NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<Integer>(6);
		NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<Integer>(5);
		NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<Integer>(3, no5, no6);
		NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<Integer>(4);
		NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<Integer>(2, null, no4);
		NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<Integer>(1, no2, no3);
		arvoreBinaria.setRaiz(no1);
		assertTrue(arvoreBinaria.contarNos() == 6);
	}
}
