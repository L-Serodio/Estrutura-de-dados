package mapas;

import lista_dinamica.ListaEncadeada;

public class MapaDispersao<T> {
	
	private ListaEncadeada<NoMapa<T>> info[];
	//TODO: Lógica de tudo aqui
	@SuppressWarnings("unchecked")
	public MapaDispersao(int tamanho) {
		info = (ListaEncadeada<NoMapa<T>>[]) new Object[tamanho];
	}
	
	private int calcularHash(int chave) {
		return (1);
	}
	
	public void inserir(int chave, T dado) {
		calcularHash(chave);
	}
	
	public void remover(int chave) {
		calcularHash(chave);
	}
	
	public T buscar(int chave) {
		calcularHash(chave);
		return null;
	}
}
