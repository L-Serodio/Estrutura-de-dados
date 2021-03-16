package lista_dinamica;

public class ListaEncadeada<T> {

	private NoLista<T> primeiro;

	public ListaEncadeada() {
		primeiro = null;
	}

	public NoLista<T> getPrimeiro() {
		return primeiro;
	}

	public void inserir(T info) {
		NoLista<T> novo = new NoLista<T>();
		novo.setInfo(info);
		novo.setProximo(primeiro);
		primeiro = novo;
	}

	public boolean estaVazia() {
		return primeiro == null;
	}

	public NoLista<T> buscar(T info) {
		NoLista<T> p = primeiro;
		while (p != null) {
			if (p.getInfo().equals(info)) {
				return p;
			}
			p = p.getProximo();
		}
		return null;
	}

	public void retirar(T info) {
		NoLista<T> p = primeiro;
		NoLista<T> anterior = null;
		while (p != null && !p.getInfo().equals(info)) {
			anterior = p;
			p = p.getProximo();
		}

		if (p != null) {
			if (anterior == null) {
				primeiro = p.getProximo();
			} else {
				anterior.setProximo(p.getProximo());
			}
		}
	}

	public int obterComprimento() {
		NoLista<T> p = primeiro;
		int tamanho = 0;
		while (p != null) {
			tamanho++;
			p = p.getProximo();
		}
		return tamanho;
	}

	public NoLista<T> obterNo(int idx) {
		if (idx < 0) {
			throw new IndexOutOfBoundsException();
		}

		NoLista<T> p = primeiro;
		for (int i = 0; (p != null) && i < idx; i++) {
			p = p.getProximo();
		}

		if (p == null) {
			throw new IndexOutOfBoundsException();
		}

		return p;
	}

	@Override
	public String toString() {
		String str = "";
		NoLista<T> p = primeiro;
		while (p != null) {
			if (p.getProximo().equals(null)) {
				str += p.getInfo();
				return str;
			}
			str += p.getInfo() + ", ";
			p = p.getProximo();
		}
		return str;
	}

}
