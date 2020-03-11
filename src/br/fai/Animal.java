package br.fai;

public abstract class Animal {
	
	public void som(){
		System.out.println("Este é o som padrão do animal");
	}
	
	public void dizerMeuNome(){
		System.out.println("O nome do aminal é xxx");
	}
	
	private void dizerMinhaIdade() {
		System.out.println("Minha idade é: xxx");
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getIdade() {
		return idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	private String cor = "preto";
	private int idade = 5;
	private String nome = "não definido";

	
}
