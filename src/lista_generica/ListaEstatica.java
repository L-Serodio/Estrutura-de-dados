package lista_generica;

@SuppressWarnings("unchecked")

public class ListaEstatica<ClasseParametrizada> {

	private ClasseParametrizada[] info;
	private int tamanho;

	public ListaEstatica() {
		info = (ClasseParametrizada[]) new Object[10];
		tamanho = 0;
	}

	private void redimensionar() {
		ClasseParametrizada[] novo = (ClasseParametrizada[]) new Object[tamanho + 10];
		for (int i = 0; i < tamanho; i++) {
			novo[i] = info[i];
		}
		info = novo;
	}

	public void inserir(ClasseParametrizada valor) {
		if (tamanho == info.length)
			redimensionar();
		info[tamanho] = valor;
		tamanho++;
	}

	public void exibir() {
		for (int i = 0; i < info.length; i++) {
			System.out.println(info[i] + " ");
		}
	}

	public int buscar(ClasseParametrizada valor) {
		for (int i = 0; i < tamanho; i++) {
			if (info[i] == valor) {
				return i;
			}
		}
		return -1;
	}

	public void retirar(ClasseParametrizada valor) {
		int pos = buscar(valor);
		if (pos != -1) {
			for (int i = pos; i < tamanho - 1; i++)
				info[i] = info[i + 1];
			tamanho--;
		}
	}

	public void liberar() {
		info = (ClasseParametrizada[]) new Object[10];
		tamanho = 0;
	}

	public ClasseParametrizada obterElemento(int posicao) {
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

	public void inverter() {
		int j = tamanho - 1;
		ClasseParametrizada tmp;
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
