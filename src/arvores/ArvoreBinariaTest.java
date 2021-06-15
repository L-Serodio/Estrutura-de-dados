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
	
	@Test
	void test_prova_caso01() {
		ArvoreBinaria<Integer> ar = new ArvoreBinaria<Integer>();
		NoArvoreBinaria<Integer> no7 = new NoArvoreBinaria<Integer>(7, null, null);
		NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<Integer>(6, no7, null);
		NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<Integer>(5, null, null);
		NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<Integer>(4, null, null);
		NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<Integer>(3, no4, no5);
		NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<Integer>(2, null, no3);
		NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<Integer>(1, no2, no6);
		ar.setRaiz(no1);
		String expected = "<1<2<><3<4<><>><5<><>>>><6<7<><>><>>>";
		assertEquals(expected, ar.toString());
	}
	
	@Test
	void test_prova_caso02() {
		ArvoreBinaria<Integer> ar = new ArvoreBinaria<Integer>();
		NoArvoreBinaria<Integer> no10 = new NoArvoreBinaria<Integer>(10, null, null);
		NoArvoreBinaria<Integer> no20 = new NoArvoreBinaria<Integer>(20, null, null);
		NoArvoreBinaria<Integer> no80 = new NoArvoreBinaria<Integer>(80, null, null);
		NoArvoreBinaria<Integer> no70 = new NoArvoreBinaria<Integer>(70, no10, no20);
		NoArvoreBinaria<Integer> no90 = new NoArvoreBinaria<Integer>(90, no70, no80);
		ar.setRaiz(no90);
		String expected = "<90<70<10<><>><20<><>>><80<><>>>";
		assertEquals(expected, ar.toString());
	}
	
	@Test
	void test_prova_caso03() {
		ArvoreBinaria<Integer> ar = new ArvoreBinaria<Integer>();
		NoArvoreBinaria<Integer> no10 = new NoArvoreBinaria<Integer>(10, null, null);
		NoArvoreBinaria<Integer> no20 = new NoArvoreBinaria<Integer>(20, null, null);
		NoArvoreBinaria<Integer> no80 = new NoArvoreBinaria<Integer>(80, null, null);
		NoArvoreBinaria<Integer> no70 = new NoArvoreBinaria<Integer>(70, no10, no20);
		NoArvoreBinaria<Integer> no90 = new NoArvoreBinaria<Integer>(90, no70, no80);
		ar.setRaiz(no90);
		assertEquals(3, ar.contarFolhas());
	}
}
