
public class ListaEstatica {

	private int[] info;
	private int tamanho;

	public ListaEstatica() {
		this.info = new int[10];
		this.tamanho = 0;
	}

	private void redimensionar() {
		int[] novo = new int[tamanho + 10];
		for (int i = 0; i < tamanho; i++) {
			novo[i] = info[i];
		}
		info = novo;
	}

	public void inserir(int valor) {
		if (this.tamanho >= info.length)
			redimensionar();
		info[this.tamanho] = valor;
		tamanho++;
	}

	public void exibir() {
		for (int i = 0; i < tamanho; i++) {
			System.out.println(info[i] + " ");
		}
	}

	public int buscar(int valor) {
		for (int i = 0; i < tamanho; i++) {
			if (info[i] == valor) {
				return i;
			}
		}
		return -1;
	}

	public void retirar(int valor) {
		int pos = buscar(valor);
		if (pos != -1) {
			for (int i = pos; i < tamanho; i++)
				info[i] = info[i + 1];
			tamanho--;
		}
	}

	public void liberar() {
		int[] novo = new int[10];
		info = novo;
		tamanho = 0;
	}

	public int obterElemento(int posicao) {
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

	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < tamanho; i++) {
			str += info[i];
			if(i != tamanho-1)
				str += ", ";
		}
		return str;
	}

}
