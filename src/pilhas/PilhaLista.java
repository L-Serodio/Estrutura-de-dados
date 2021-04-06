package pilhas;

import lista_dinamica.ListaEncadeada;

public class PilhaLista<T> extends ListaEncadeada<T> implements IPilha<T> {

	private ListaEncadeada<T> lista;
	
	public PilhaLista() {
		lista = new ListaEncadeada<T>();
	}
	@Override
	public void push(T valor) {
		lista.inserir(valor);
	}

	@Override
	public T pop() {
		T valor;
		valor = peek();
		lista.retirar(valor);
		return valor;
	}

	@Override
	public T peek() {
		if (estaVazia()) {
			throw new PilhaVaziaException("A pilha está vazia");
		}
		return lista.getPrimeiro().getInfo();
	}

	@Override
	public void liberar() {
		while(!estaVazia()) {
			pop();
		}
	}
	
	public boolean estaVazia() {
		return lista.estaVazia();
	}
	
	public String toString() {
		return lista.toString();
	}

}
