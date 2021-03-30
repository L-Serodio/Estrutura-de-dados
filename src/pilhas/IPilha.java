package pilhas;

public interface IPilha<T> {
	public void push(T valor);
	public T pop();
	public T peek();
	public boolean estaVazia();
	public void liberar();
}
