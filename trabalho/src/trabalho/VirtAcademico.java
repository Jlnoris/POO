package trabalho;

public class VirtAcademico extends PessoaF {
	
	private String inicial;
	private String email;
	private int matricula;
	
	
	public String getInicial() {
		return inicial;
	}
	public void setInicial(String inicial) {
		this.inicial = inicial;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void acessoTeams(){
		if(this.getLog() == true) {
			System.out.println("==============");
			System.out.println("-----TEAMS----");
			System.out.println("-Atrividades");
			System.out.println("-Chat");
			System.out.println("-Tarefas");
		} else {
			System.out.println("=======================================");
			System.out.println("ERRO! Não foi possivel realizar ação!");
			System.out.println("Você não está logado no Sistema!");
			System.out.println("=======================================");
		}
	}

	@Override
	public void status() {
		System.out.println("Nome:" + this.getNome());
		System.out.println("Idade: " + this.getIdade() + " anos.");
		System.out.println("Email:" + this.getMatricula() + "@" + this.getEmail());
		System.out.println("Senha: " + this.inicial + "@" + this.getCPF());
	}

}
