package buscas;

public class ListaEstatica<T> extends ListaAbstract<T> {

	private Object[] info = getInfo();

	public ListaEstatica() {
		super();
	}

	@Override
	public void inserir(T dado) {
		if (getTamanho() == info.length)
			redimensionar();
		info[getTamanho()] = dado;
		setTamanho(getTamanho() + 1);
	}

	@Override
	public int buscar(T dado) {
		//Busca linear
		for (int i = 0; i < getTamanho(); i++) {
			if (info[i] == dado) {
				return i;
			}
		}
		return -1;
	}

}
