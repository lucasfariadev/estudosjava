
public class testaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 2444);

		System.out.println(conta.getNumero());
		
		
		Cliente paulo = new Cliente();
		
		//conta.titular = paulo;
		
		conta.setTitular(paulo);
		
		paulo.setNome("Lucas Faria");
		
		System.out.println(conta.getTitular().getNome());
		
		
		conta.getTitular().setProfissao("programador");
		
		
	}

}
