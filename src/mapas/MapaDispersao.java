package mapas;

import lista_dinamica.ListaEncadeada;
import lista_dinamica.NoLista;

public class MapaDispersao<T> {
	
	private ListaEncadeada<NoMapa<T>>[] info;
	
	@SuppressWarnings("unchecked")
	public MapaDispersao(int tamanho) {
		info = new ListaEncadeada[tamanho];
	}
	
	private int calcularHash(int chave) {
		return (chave % info.length);
	}
	
	public void inserir(int chave, T dado) {
		int indice = calcularHash(chave);
		
		if (info[indice] == null) {
			info[indice] = new ListaEncadeada<>();
		}
		
		NoMapa<T> no = new NoMapa<>();
		no.setChave(chave);
		no.setInfo(dado);
		
		info[indice].inserir(no);
	}
	
	public void remover(int chave) {
		int indice = calcularHash(chave);
		
		if (info[indice] != null) {
			NoMapa<T> no = new NoMapa<>();
			no.setChave(chave);
			info[indice].retirar(no);
		}
	}
	
	public T buscar(int chave) {
		int indice = calcularHash(chave);

		if (info[indice] != null) {
			NoMapa<T> noMapa = new NoMapa<>();
			noMapa.setChave(chave);
			
			NoLista<NoMapa<T>> no;
			no = info[indice].buscar(noMapa);
			if (no != null)
				return no.getInfo().getInfo();
		}
		
		return null;
	}
}
