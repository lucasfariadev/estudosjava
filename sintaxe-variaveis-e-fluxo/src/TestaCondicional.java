
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		int quantidadePessoas = 1;
		int idade = 15;
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos");
			System.out.println("Seja Bem vindo!");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Voc� n�o tem 18 anos mas pode entrar pois est� acompanhado! ");
			} else {
				System.out.println("Infelizmente voc� n�o pode entrar!");
			}
		}
	}
}