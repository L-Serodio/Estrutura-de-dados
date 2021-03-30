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
		NoListaDupla<T> novo = new NoListaDupla<T>();
		novo.setInfo(valor);
		novo.setProximo(primeiro);
		novo.setAnterior(null);
		if (primeiro != null) {
			primeiro.setAnterior(novo);
		}
		primeiro = novo;
	}

	public NoListaDupla<T> buscar(T valor) {
		NoListaDupla<T> p = primeiro;
		
		while (p != null) {
			if (p.getInfo().equals(valor)) {
				return p;
			}
			p = p.getProximo();
		}
		return null;
	}

	public void retirar(T valor) {
		NoListaDupla<T> p = buscar(valor);
		
		if (p != null) {
			if (primeiro.equals(p)) {
				primeiro = p.getProximo();
			} else {
				p.getAnterior().setProximo(p.getProximo());
			}

			if (p.getProximo() != null) {
				p.getProximo().setAnterior(p.getAnterior());
			}
		}

	}

	public void exibirOrdemInversa() {
		NoListaDupla<T> p = primeiro;
		
		while(p.getProximo() != null) {
			p = p.getProximo();
		}
		
		while(p != primeiro) {
			System.out.println(p);
			p = p.getAnterior();
		}
	}

	public void liberar() {
		NoListaDupla<T> p = primeiro;
		while (p != null) {
			p.setAnterior(null);
			NoListaDupla<T> noTemp = p.getProximo();
			p.setProximo(null);
			p = noTemp;
		}
		primeiro = null;
	}

	@Override
	public String toString() {
		String str = "";
		NoListaDupla<T> p = primeiro;
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
