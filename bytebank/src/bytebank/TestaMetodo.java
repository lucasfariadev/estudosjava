package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoLucas = new Conta();
		contaDoLucas.saldo = 100;
		contaDoLucas.deposita(50);
		
		System.out.println(contaDoLucas.saldo);
		
		boolean conseguiuRetirar = contaDoLucas.saca(20);
		System.out.println(contaDoLucas.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		if (contaDaMarcela.transfere(300, contaDoLucas)) {
			System.out.println("Transferência feita com sucesso!");
		} else {
			System.out.println("Faltou dinheiro!");
		}
		
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoLucas.saldo);
		
		contaDoLucas.titular = "Lucas Faria";
		System.out.println(contaDoLucas.titular);
		
	}

}
