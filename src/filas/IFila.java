package filas;

public interface IFila<T> {
	void inserir(T valor);
	boolean estaVazia();
	T peek();
	T retirar();
	void liberar();
}
