package trabalho;

public class Colaborador extends PessoaF {
	
	private long acesso;
	private int senha;
	private float salario;
	private String leciona;
	
	
	public long getAcesso() {
		return acesso;
	}

	public void setAcesso(long acesso) {
		this.acesso = acesso;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getLeciona() {
		return leciona;
	}

	public void setLeciona(String leciona) {
		this.leciona = leciona;
	}
	

	public void planejarAula() {
		if(this.getLog() == true) {
			System.out.println("=======================================");
			System.out.println("Planejamendo de Aula: " + this.getLeciona());
			System.out.println("-Incerir dados de aula");
			System.out.println("-Incerir DOCUMENTOS");
			System.out.println("-Incerir endereço On-line");
			
		} else {
			System.out.println("=======================================");
			System.out.println("ERRO! Não foi possivel realizar ação!");
			System.out.println("Você não está logado no Sistema!");
			System.out.println("=======================================");
		}
	
	}
	
	public void efetuarChamada() {
		if(this.getLog() == true) {
			System.out.println("=======================================");
			System.out.println("Presença de Aula:");
			System.out.println("01 - joão lucas Noris [] []");
			System.out.println("02 - Wagner Eduardo   [] []");
			System.out.println("03 - Nathan Hanzs     [] []");
			
		} else {
			System.out.println("=======================================");
			System.out.println("ERRO! Não foi possivel realizar ação!");
			System.out.println("Você não está logado no Sistema!");
			System.out.println("=======================================");
		}
		
	}
	
	@Override
	public void status() {
		if(this.getLog() == true) {
			System.out.println("acesso: " + this.getAcesso());
			System.out.println("senha: " + this.getSenha());
			System.out.println("CPF:" + this.getCPF());
			System.out.println("=======================================");
			System.out.println("Nome: " + this.getNome());
			System.out.println("Idade: " + this.getIdade() + " anos.");
			System.out.println("Salario: " + this.getSalario());
			System.out.println("Materia Lecioda: " + this.getLeciona());
			
			
			
		} else {
			System.out.println("=======================================");
			System.out.println("Status inaparente poís você não logado!");
			System.out.println("=======================================");
		}
		
	}
	
}
