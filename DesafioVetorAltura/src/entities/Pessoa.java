package entities;

public class Pessoa {
	// Atributos
	private String nome;
	private double altura;
	private int idade;
	
	// Contrutor
	public Pessoa(String nome, double altura, int idade) {
		this.nome = nome;
		this.altura = altura;
		this.idade = idade;
	}
	
	// Metodos
	
	
	// Getters & Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAltura() {
		return altura;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdae(){
		return idade;
	}
	
	// toString
	public String toString() {
		return String.format("Nome: %s%nIdade: %d%nAltura%.2f%n", this.nome, this.idade, this.altura);
	}

}
