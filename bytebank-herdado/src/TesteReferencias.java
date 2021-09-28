
public class TesteReferencias {

	public static void main(String[] args) {
		Gerente gerenteDeTeste = new Gerente();

		gerenteDeTeste.setNome("Senhor Teste");
		String nome = gerenteDeTeste.getNome();

		gerenteDeTeste.setSalario(5000.0);

		EditorDeVideo ev = new EditorDeVideo();
		ev.setSalario(2500);

		Designer d = new Designer();
		d.setSalario(2000);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerenteDeTeste);

		controle.registra(ev);
		controle.registra(d);

		System.out.println(controle.getSoma());

		System.out.println(nome);

	}

}
