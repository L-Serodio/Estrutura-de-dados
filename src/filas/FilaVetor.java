package filas;

@SuppressWarnings("unchecked")
public class FilaVetor<T> implements IFila<T> {

	private T info[];
	private int limite;
	private int tamanho;
	private int inicio;
	
	
	public FilaVetor(int limite) {
		info = (T[]) new Object[limite];
		this.limite = limite;
		this.tamanho = 0;
		this.inicio = 0;
	}
	
	public int getInicio() {
		return inicio;
	}
	
	@Override
	public void inserir(T valor) {
		if(tamanho == limite) {
			throw new FilaCheiaException("A fila está cheia!");
		}
		
		int posicao;
		posicao = (inicio + tamanho) % limite;
		info[posicao] = valor;
		tamanho++;
	}

	@Override
	public boolean estaVazia() {
		return tamanho == 0;
	}

	@Override
	public T peek() {
		if(estaVazia()) {
			throw new FilaVaziaException("A fila está vazia!");
		}
		
		return info[inicio];
	}

	@Override
	public T retirar() {
		if(estaVazia()) {
			throw new FilaVaziaException("A fila está vazia!");
		}
		
		T valor = peek();
		info[inicio] = null;
		
		inicio = (inicio + 1) % limite;
		tamanho--;
		return valor;
	}

	@Override
	public void liberar() {
		while(!estaVazia()) {
			retirar();
		}
	}
	
	public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2) {
		FilaVetor<T> f3 = new FilaVetor<T>(this.limite + f2.limite);
		
		int indice;
		
		indice = this.inicio;
		for (int i = 0; i < this.tamanho; i++) {
			f3.inserir(this.info[indice]);
			indice = (indice + 1) % this.limite;
		}
		
		indice = f2.inicio;
		for (int i = 0; i < f2.tamanho; i++) {
			f3.inserir(f2.info[indice]);
			indice = (indice + 1) % f2.limite;
		}
		
		return f3;
	}
	
	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i <= tamanho; i++) {
			str += info[i] + ",";
		}
		
		return str;
	}

}
