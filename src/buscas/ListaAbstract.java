package buscas;

@SuppressWarnings("unchecked")

public abstract class ListaAbstract<T> {

	private T[] info;
	private int tamanho;

	public ListaAbstract() {
		info = (T[]) new Object[10];
		tamanho = 0;
	}
	
	protected void redimensionar() {
		T[] novo = (T[]) new Object[tamanho + 10];
		for (int i = 0; i < tamanho; i++) {
			novo[i] = info[i];
		}
		info = novo;
	}
	
	protected T[] getInfo() {
		return info;
	}

	public abstract void inserir(T dado);

	public void exibir() {
		for (int i = 0; i < info.length; i++) {
			System.out.println(info[i] + " ");
		}
	}

	public abstract int buscar(T dado);

	public void retirar(T dado) {
		int pos = buscar(dado);
		if (pos != -1) {
			for (int i = pos; i < tamanho - 1; i++)
				info[i] = info[i + 1];
			tamanho--;
		}
	}

	public int getLimite() {
		return info.length;
	}
	
	public void liberar() {
		info = (T[]) new Object[10];
		tamanho = 0;
	}

	public T obterElemento(int posicao) {
		if (posicao < 0 || posicao > tamanho)
			throw new IndexOutOfBoundsException();
		return info[posicao];
	}

	public boolean estaVazia() {
		return tamanho == 0;
	}

	public int getTamanho() {
		return this.tamanho;
	}
	
	protected void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public void inverter() {
		int j = tamanho - 1;
		T tmp;
		for (int i = 0; i < tamanho/2; i++) {
			tmp = info[i];
			info[i] = info[j];
			info[j] = tmp;
			j--;
		}
	}

	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < tamanho; i++) {
			if (i > 0 && i != tamanho)
				str += ",";
			str += info[i].toString();
		}
		return str;
	}
}
