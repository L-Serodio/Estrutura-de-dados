package buscas_em_arvores;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArvoreBinariaBuscaTest {

	ArvoreBinariaBusca<Integer> arvore = new ArvoreBinariaBusca<Integer>();
	
	@Test
	void test_inserir_caso01() {
		arvore.inserir(50);
		arvore.inserir(30);
		arvore.inserir(70);
		arvore.inserir(40);
		arvore.inserir(25);
		arvore.inserir(75);
		arvore.inserir(65);
		arvore.inserir(35);
		arvore.inserir(60);
		String expected = "<50<30<25<><>><40<35<><>><>>><70<65<60<><>><>><75<><>>>>";
		assertEquals(expected, arvore.toString());
	}
	
	@Test
	void test_remover_no_folha_caso02() {
		arvore.inserir(50);
		arvore.inserir(30);
		arvore.inserir(25);
		arvore.inserir(40);
		arvore.retirar(40);
		String expected = "<50<30<25<><>><>><>>";
		assertEquals(expected, arvore.toString());
	}
	
	@Test
	void test_remover_no_com_um_filho_caso03() {
		arvore.inserir(80);
		arvore.inserir(52);
		arvore.inserir(90);
		arvore.inserir(48);
		arvore.inserir(71);
		arvore.inserir(63);
		arvore.inserir(67);
		arvore.retirar(71);
		String expected = "<80<52<48<><>><63<><67<><>>>><90<><>>>";
		assertEquals(expected, arvore.toString());
	}
	
	@Test
	void test_remover_no_com_dois_filhos_caso04() {
		arvore.inserir(250);
		arvore.inserir(38);
		arvore.inserir(26);
		arvore.inserir(72);
		arvore.inserir(55);
		arvore.inserir(90);
		arvore.inserir(41);
		arvore.inserir(60);
		arvore.inserir(43);
		arvore.inserir(78);
		arvore.inserir(92);
		arvore.inserir(74);
		arvore.retirar(38);
		String expected = "<250<41<26<><>><72<55<43<><>><60<><>>><90<78<74<><>><>><92<><>>>>><>>";
		assertEquals(expected, arvore.toString());
	}
	
}
