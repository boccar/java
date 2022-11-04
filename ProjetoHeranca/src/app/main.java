package app;

public class main {

	public static void amain(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Henrique");
		funcionario.setRg("035.937.050-01");
		System.out.println(funcionario.getNome());
	}

}
