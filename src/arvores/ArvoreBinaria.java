package arvores;

public class ArvoreBinaria<T> {
	
	private NoArvoreBinaria<T> raiz;
	
	public ArvoreBinaria() {
		raiz = null;
	}
	
	public void setRaiz(NoArvoreBinaria<T> raiz) {
		this.raiz = raiz;
	}
	
	public boolean estaVazia() {
		return raiz == null;
	}
	
	public boolean pertence(T info) {
		return true; //TODO
	}
	
	private boolean pertence(NoArvoreBinaria<T> no, T info) {
		return true; //TODO
	}
	
	@Override
	public String toString() {
		return ""; //TODO
	}
	
	private String arvorePre(NoArvoreBinaria<T> no) {
		return ""; //TODO
	}
	
	public int contarNos() {
		return 0; //TODO
	}
	
	private int contarNos(NoArvoreBinaria<T> no) {
		return 0; //TODO
	}
	
}
