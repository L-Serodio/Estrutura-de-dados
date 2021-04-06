package pilhas;

@SuppressWarnings("unchecked")
public class PilhaVetor<T> implements IPilha<T> {

	private T[] info;
	private int limite;
	private int tamanho;
	
	public PilhaVetor(int limite) {
		info = (T[]) new Object[limite];
		this.limite = limite;
		tamanho = 0;
	}
	
	@Override
	public void push(T valor) {
		if(limite == tamanho) {
			throw new PilhaCheiaException("Capacidade esgotada da pilha!");
		}
		info[tamanho] = valor;
		tamanho++;
	}

	@Override
	public T pop() {
		T valor = peek();
		info[tamanho-1] = null;
		tamanho--;
		return valor;
	}

	@Override
	public T peek() {
		if(estaVazia()) {
			throw new PilhaVaziaException("Pilha está vazia");
		}
		return info[tamanho-1];
	}

	@Override
	public boolean estaVazia() {
		return tamanho == 0;
	}

	@Override
	public void liberar() {
		try {
			while(true) {
				pop();
			}
		} catch (PilhaVaziaException e) {
			throw new PilhaVaziaException("Pilha está vazia");
		}
	}
	
	@Override 
	public String toString() {
		String str = "";
		for (int i = tamanho-1; i >= 0; i--) {
			if (i != tamanho-1)
				str += ", ";
			str += info[i].toString();
		}
		return str;
	}
	
	public void concatenar(PilhaVetor<T> p) {
		int tamanhoP = p.tamanho;
		p.tamanho = 0;
		while(p.tamanho != tamanhoP) {
			p.tamanho++;
			this.push(p.peek());
		}
	}
}
