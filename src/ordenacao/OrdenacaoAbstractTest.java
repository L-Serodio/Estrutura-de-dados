package ordenacao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OrdenacaoAbstractTest {

	private void testar(OrdenacaoAbstract<Integer> ordenacao) {
		Integer[] dados = new Integer[] { 70, 2, 88, 15, 90, 30 };
		ordenacao.setInfo(dados);
		ordenacao.ordenar();
		
		assertEquals(2, dados[0].intValue());
		assertEquals(15, dados[1].intValue());
		assertEquals(30, dados[2].intValue());
		assertEquals(70, dados[3].intValue());
		assertEquals(88, dados[4].intValue());
		assertEquals(90, dados[5].intValue());
	}

	@Test
	public void testOrdenacaoBolha() {
		OrdenacaoAbstract<Integer> ordenacao = new OrdenacaoBolha<>();
		testar(ordenacao);
	}
	
	@Test
	public void testOrdenacaoBolhaOtimizada() {
		OrdenacaoAbstract<Integer> ordenacao = new OrdenacaoBolhaOtimizada<>();
		testar(ordenacao);
	}
	
	@Test
	public void testOrdenacaoQuickSort() {
		OrdenacaoAbstract<Integer> ordenacao = new OrdenacaoQuickSort<>();
		testar(ordenacao);
	}
	
	@Test
	public void testOrdenacaoMergeSort() {
		OrdenacaoAbstract<Integer> ordenacao = new OrdenacaoMergeSort<>();
		testar(ordenacao);
	}
}
