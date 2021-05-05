public class MainCPF {
	public static void main (String[] args) {
		VerificarCPF cpf = new VerificarCPF();
		try {
			cpf.entcpf();
			cpf.dv1();
			cpf.dv2();
			cpf.validCPF();
		}
		catch( Error e) {
			System.out.println(e);
		}
	}
}
