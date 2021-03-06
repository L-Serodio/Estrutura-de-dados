
public class ListaEstatica {

	private int[] info;
	private int tamanho;

	public ListaEstatica() {
		this.info = new int[10];
		this.tamanho = 0;
	}

	private void redimensionar() {
		 int[] novo = new int[this.info.length + 10];
		 
		 for (int i = 0; i < this.info.length; i++) {
			novo[i] = this.info[i];
		}
		 
		 this.info = novo;
	}

	public void inserir(int valor) {
		if (this.tamanho == this.info.length) {
			redimensionar();
		} else {
			this.info[this.tamanho] = valor;
		}
		tamanho++;
	}

	public void exibir() {
		for (int i = 0; i < info.length; i++) {
			System.out.println(info[i] + "");
		}
	}

	public int buscar(int valor) {
		return 0;
	}

	public int retirar(int valor) {
		return 0;
	}

	public void liberar() {
		int[] novo = new int[10];
		info = novo;
	}

	public int obterElemento(int posicao) {
		return 0;
	}

	public boolean estaVazia() {
		if (this.tamanho == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int getTamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < info.length; i++) {
			if (i != (info.length -1)) {
				str += info[i] + ", ";
			} else {
				str += info[i];
			}
		}
		return str;
	}
	
}
