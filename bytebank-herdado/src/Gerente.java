
//Gerente � um funcionario. herda a Class Funcionario. assina o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel {

	
	

	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonifica��o do gerente");
		return super.getSalario();
	}


	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);

	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
