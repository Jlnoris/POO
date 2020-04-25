package trabalho;

public class Academico extends Pessoa {
	
	private int matricula;
	private int senha;
	private String curso;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
		
	}
	public void consultarGrade() {
		if(this.getLog() == true) {
			System.out.println("==============================");
			System.out.println("GRADE REFERENTE AO 5 SEMESTRE:");
			System.out.println("segunda: Programnação Orientada a Objeto");
			System.out.println("Quarta Projeto Orientado a Objeto");
			System.out.println("Quinta: Interface Humano Computador");
			System.out.println("ONLINE: Engenharia de Software");
			System.out.println("ONLINE: Direito da Computação");
		} else {
			System.out.println("=========================================");
			System.out.println("ERRO! Não foi possivel realizar consulta!");
			System.out.println("Você não está logado no Sistema!");
			System.out.println("=========================================");
		}
	}
	
	public void alterarSenha(int s) {
		if(this.getLog() == true) {
			this.setSenha(s);
			System.out.println("=============================");
			System.out.println("Senha alterada para " + s);
			System.out.println("=============================");
		} else {
			System.out.println("=====================================");
			System.out.println("ERRO! Não foi possivel alterar senha!");
			System.out.println("Você não está logado no Sistema!");
			System.out.println("=====================================");
			
		}
		
	}
	
	@Override
	public void status() {
		if(this.getLog() == true) {
			System.out.println("Nome Aluno: " + this.getNome());
			System.out.println("Idade: " + this.getIdade() + " anos.");
			System.out.println("Curso: " + this.getCurso());
			System.out.println("Matricula: " + this.getMatricula());
			System.out.println("Senha: " + this.getSenha());
			
		} else {
			System.out.println("=======================================");
			System.out.println("Status inaparente poís você não logado!");
			System.out.println("=======================================");
		}
	
	}

}
