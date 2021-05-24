package buscas;

public class ListaEstatica<T> extends ListaAbstract<T> {

	@Override
	public void inserir(T dado) {
		if (getTamanho() == getLimite())
			redimensionar();

		T[] info = getInfo();
		info[getTamanho()] = dado;
		setTamanho(getTamanho() + 1);
	}

	@Override
	public int buscar(T dado) {
		//Busca linear
		T[] info = getInfo();
		for (int i = 0; i < getTamanho(); i++) {
			if (info[i].equals(dado)) {
				return i;
			}
		}
		return -1;
	}

}
