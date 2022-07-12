package primeiroProgramaJava.Gato;

import java.util.Objects;

public class Gato {
	private String name;
	private String cor;
	private String idade;

	public Gato() {

	}

	public Gato(String name, String cor, String idade) {
		super();
		this.name = name;
		this.cor = cor;
		this.idade = idade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Gato [name=" + name + ", cor=" + cor + ", idade=" + idade + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(name, other.name);
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

}
