package lista_duplamente_encadeada;

public class ListaDupla<T> {
	
	private NoListaDupla<T> primeiro;
	
	public ListaDupla() {
		primeiro = null;
	}

	public NoListaDupla<T> getPrimeiro() {
		return primeiro;
	}
	
	public void inserir(T valor) {
		
	}
	
	public NoListaDupla<T> buscar(T valor) {
		return new NoListaDupla<T>();
	}
	
	public void retirar(T valor) {
		
	}
	
	public void exibirOrdemInversa() {
		
	}
	
	public void liberar() {
		
	}
	
	@Override
	public String toString() {
		return "";
	}
	
}
