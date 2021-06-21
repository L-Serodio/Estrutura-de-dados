package mapas;

public class Aluno {
	//Classe para testar o mapa de dispersão :)
	private int matricula;
	private String nome;
	
	public Aluno(int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}

	protected int getMatricula() {
		return matricula;
	}

	protected void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}
}
