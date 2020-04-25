package trabalho;

public abstract class Pessoa {
	
	private String nome;
	private int idade;
	private boolean log;
	
	public Pessoa() {
		this.setLog(false);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public boolean getLog() {
		return log;
	}
	public void setLog(boolean log) {
		this.log = log;
	}
	public void logar() {
		this.setLog(true);
		System.out.println("================");
		System.out.println("Você está logado");
		System.out.println("================");
	}
	
	public void deslogar() {
		this.setLog(false);
		System.out.println("===============");
		System.out.println("Deslogando ....");
		System.out.println("===============");
	}
	
	public void status(){
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
	}
	
}

