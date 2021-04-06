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
		return f2; //TO-DO
	}
	
	@Override
	public String toString() {
		return ""; //TO-DO
	}

}
