
public class TesteGerente {
	
	
	public static void main(String[] args) {
		
		Autenticavel referencia = new Cliente();
		
		Gerente gerente1 = new Gerente();
		gerente1.setNome("Marco");
		gerente1.setCpf("222.222.111-11");
		gerente1.setSalario(5000.0);
		
		
		System.out.println(gerente1.getNome());
		System.out.println(gerente1.getCpf());
		System.out.println(gerente1.getSalario());
		
		gerente1.setSenha(2222);
		
		boolean autenticou = gerente1.autentica(2222);
		
		System.out.println(autenticou);
		
		
		System.out.println(gerente1.getBonificacao());
		
	}

}
