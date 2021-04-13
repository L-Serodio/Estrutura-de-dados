package filas;

import lista_dinamica.ListaEncadeada;

public class FilaLista<T> implements IFila<T> {

	private ListaEncadeada<T> lista;
	
	public FilaLista() {
		lista = new ListaEncadeada<>();
	}
	
	@Override
	public void inserir(T valor) {
		lista.inserirNoFinal(valor);
	}

	@Override
	public boolean estaVazia() {
		return lista.estaVazia();
	}

	@Override
	public T peek() {
		if(estaVazia())
			throw new FilaVaziaException("Está vazia!");
		
		return lista.getPrimeiro().getInfo();
	}

	@Override
	public T retirar() {
		T valor;
		valor = peek();
		lista.retirar(valor);
		return valor;
	}

	@Override
	public void liberar() {
		lista = new ListaEncadeada<>();
	}
	
	@Override
	public String toString() {
		return lista.toString();
	}

}
