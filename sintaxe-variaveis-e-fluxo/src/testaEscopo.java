
public class testaEscopo {

	public static void main(String[] args) {
		System.out.println("Testando Condicionais");

		int idade = 20;
		int quantidadePessoas = 3;

		// boolean acompanhado = quantidadePessoas >=2;
		
		boolean acompanhado = true;
		
		System.out.println(acompanhado);

		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} 
		System.out.println("Valor de acompanhado = " + acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}

	}
}
