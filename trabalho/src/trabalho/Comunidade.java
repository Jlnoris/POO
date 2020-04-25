package trabalho;

public class Comunidade extends PessoaF {
	
	private int acesso;
	private int senha;
	
	
	public int getAcesso() {
		return acesso;
	}
	public void setAcesso(int acesso) {
		this.acesso = acesso;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public void forum() {
		if(this.getLog() == true) {
			System.out.println("=======================================");
			System.out.println("-----------------FORUM-----------------");
			System.out.println("-Compartilhar Artigos.");
			System.out.println("-Fazer publicações");
			System.out.println("-Verificar novidades");
			
			
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
			System.out.println("Acesso: " + this.getAcesso());
			System.out.println("senha: " + this.getSenha());
			System.out.println("CFP: " + this.getCPF());
			System.out.println("=======================================");
			System.out.println("Nome: " + this.getNome());
			System.out.println("Idade: " + this.getIdade() + " anos.");
			
		} else {
			
			System.out.println("=======================================");
			System.out.println("Status inaparente poís você não logado!");
			System.out.println("=======================================");
		}
		
	}
	

}
