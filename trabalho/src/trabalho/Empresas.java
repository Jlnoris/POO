package trabalho;

public class Empresas extends PessoaJ {
	
	private int senha;
	private String servico;
			
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	
	public void prestarServico() {
		if(this.getLog() == true) {
			System.out.println("=======================================");
			System.out.println("SESI CANTINA");
			System.out.println("-Verificar Estoques.");
			System.out.println("-Verificar o Caixa.");
			System.out.println("-Contas a pagar");
			System.out.println("-Produtos cadastrados.");
			System.out.println("-Contratos registrados.");
			
			
		} else {
			System.out.println("=======================================");
			System.out.println("ERRO! N�o foi possivel realizar a��o!");
			System.out.println("Voc� n�o est� logado no Sistema!");
			System.out.println("=======================================");
		}
	}
	
	@Override
	public void status() {
		if(this.getLog() == true) {
			System.out.println("CNPJ: " + this.getCNPF());
			System.out.println("senha: " + this.getSenha());
			System.out.println("=======================================");
			System.out.println("Nome: " + this.getNome());
			System.out.println("Idade: " + this.getIdade() + " anos no mercado.");
			System.out.println("Servi�o prestado: " + this.getServico());
			
		} else {
			
			System.out.println("=======================================");
			System.out.println("Status inaparente po�s voc� n�o logado!");
			System.out.println("=======================================");
		}
		
	}

}
