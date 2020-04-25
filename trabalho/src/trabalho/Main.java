package trabalho;

public class Main {

	public static void main(String[] args) {
Academico ac1 = new Academico();
		
		ac1.setMatricula(1307916);
		ac1.setSenha(555555);
		ac1.setNome("João Lucas");
		ac1.setIdade(19);
		ac1.setCurso("Sistemas de Informação");
		
		ac1.logar();
		ac1.status();
		ac1.deslogar();
		
		VirtAcademico vac1 = new VirtAcademico();
		
		vac1.setEmail("aluno.uniasselvi.com.br");
		vac1.setMatricula(1589017);
		vac1.setInicial("p");
		vac1.setCPF("01102021960");
		vac1.setNome("Pedro");
		vac1.setIdade(22);
		
		
		vac1.logar();
		vac1.status();
		vac1.acessoTeams();
		vac1.deslogar();
		
		
		Colaborador co1 = new Colaborador();
		
		co1.setAcesso(60128470);
		co1.setSenha(504030);
		co1.setCPF("099.120.438.81");
		co1.setNome("Everton");
		co1.setIdade(35);
		co1.setSalario(10000);
		co1.setLeciona("Programação Orientada a Objeto II");
		
		co1.logar();
		co1.status();
		co1.planejarAula();
		co1.efetuarChamada();
		co1.deslogar();
		
		Empresas em1 = new Empresas();
		
		em1.setCNPF(896231547);
		em1.setSenha(888888);
		em1.setNome("SESI");
		em1.setIdade(40);
		em1.setServico("Alimentação");
		
		em1.logar();
		em1.status();
		em1.prestarServico();
		em1.deslogar();
		
		Comunidade com1 = new Comunidade();
		
		com1.setAcesso(521304);
		com1.setSenha(464646);
		com1.setCPF("812.166.400.30");
		com1.setNome("Juriscleison");
		com1.setIdade(26);
		
		com1.logar();
		com1.status();
		com1.forum();
		com1.deslogar();
	}

}
