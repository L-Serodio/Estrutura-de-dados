package mapas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MapaDispersaoTest {
	
	@Test
	void test_case01() {
		MapaDispersao<Aluno> mapa = new MapaDispersao<>(53);
		Aluno aluno1 = new Aluno(12000, "Aluno1");
		mapa.inserir(aluno1.getMatricula(), aluno1);
		Aluno a = mapa.buscar(aluno1.getMatricula());
		assertEquals(a, aluno1);
	}
	
	@Test
	void test_case02() {
		MapaDispersao<Aluno> mapa = new MapaDispersao<>(53);
		Aluno aluno1 = new Aluno(12000, "Aluno1");
		mapa.inserir(aluno1.getMatricula(), aluno1);
		Aluno a = mapa.buscar(aluno1.getMatricula());
		assertEquals(a, aluno1);
		Aluno aluno2 = new Aluno(14000, "Aluno2");
		mapa.inserir(aluno2.getMatricula(), aluno2);
		Aluno b = mapa.buscar(aluno2.getMatricula());
		assertEquals(b, aluno2);
		Aluno aluno3 = new Aluno(12500, "Aluno3");
		mapa.inserir(aluno3.getMatricula(), aluno3);
		Aluno c = mapa.buscar(aluno3.getMatricula());
		assertEquals(c, aluno3);
		Aluno aluno4 = new Aluno(13000, "Aluno4");
		mapa.inserir(aluno4.getMatricula(), aluno4);
		Aluno d = mapa.buscar(aluno4.getMatricula());
		assertEquals(d, aluno4);
	}
	
	@Test
	void test_case03() {
		MapaDispersao<Aluno> mapa = new MapaDispersao<>(53);
		Aluno aluno1 = new Aluno(12000, "Aluno1");
		mapa.inserir(aluno1.getMatricula(), aluno1);
		Aluno a = mapa.buscar(aluno1.getMatricula());
		assertEquals(a, aluno1);
		Aluno aluno2 = new Aluno(14000, "Aluno2");
		mapa.inserir(aluno2.getMatricula(), aluno2);
		Aluno b = mapa.buscar(aluno2.getMatricula());
		assertEquals(b, aluno2);
		Aluno aluno3 = new Aluno(14226, "Aluno3");
		mapa.inserir(aluno3.getMatricula(), aluno3);
		Aluno c = mapa.buscar(aluno3.getMatricula());
		assertEquals(c, aluno3);
		Aluno aluno4 = new Aluno(17180, "Aluno4");
		mapa.inserir(aluno4.getMatricula(), aluno4);
		Aluno d = mapa.buscar(aluno4.getMatricula());
		assertEquals(d, aluno4);
	}
}
