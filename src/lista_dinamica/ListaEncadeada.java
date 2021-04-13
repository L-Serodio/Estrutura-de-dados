package lista_dinamica;

public class ListaEncadeada<T> {

	private NoLista<T> primeiro;
	private NoLista<T> ultimo;

	public ListaEncadeada() {
		primeiro = null;
		ultimo = null;
	}

	public NoLista<T> getPrimeiro() {
		return primeiro;
	}

	public void inserir(T info) {
		NoLista<T> novo = new NoLista<T>();
		novo.setInfo(info);
		novo.setProximo(primeiro);
		
		if(estaVazia()) {
			ultimo = novo;
		}
		
		primeiro = novo;
	}

	public void inserirNoFinal(T info) {
		NoLista<T> novo = new NoLista<>();
		novo.setInfo(info);
		novo.setProximo(null);
		if(estaVazia())
			primeiro = novo;
		else
			ultimo.setProximo(novo);
		
		ultimo = novo;
	}
	
	public boolean estaVazia() {
		return primeiro == null;
	}

	public NoLista<T> buscar(T valor) {
		NoLista<T> p = primeiro;
		while (p != null) {
			if (p.getInfo().equals(valor)) {
				return p;
			}
			p = p.getProximo();
		}
		return null;
	}

	public void retirar(T valor) {
		NoLista<T> p = primeiro;
		NoLista<T> anterior = null;
		
		while (p != null && !p.getInfo().equals(valor)) {
			anterior = p;
			p = p.getProximo();
		}

		if (p != null) {
			if (p == primeiro) {
				primeiro = primeiro.getProximo();
			} else {
				anterior.setProximo(p.getProximo());
			}
		}
		
		if(p == ultimo) {
			ultimo = anterior;
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
			if (p.equals(primeiro)) {
				str += p.getInfo().toString();
			} else {
				str += ", " + p.getInfo().toString();
			}
			p = p.getProximo();	
		}
		return str;
	}

}
