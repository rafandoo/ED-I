import java.util.Scanner;
public class VerificarCPF {
	
	Scanner entrada = new Scanner(System.in);
	String digcpf = "", origcpf = "";
	int s = 0;
	int dig1 = 0, dig2 = 0;
	boolean x = true;
	
	public void entcpf() {
		System.out.print("Digite seu CPF (apenas números): ");
		digcpf = entrada.nextLine();
		origcpf = digcpf;
	}
	
	public void dv1() {
		s = 0;
		int i = 0, vd1 = 10;
		while(i<9) {
			s += (Integer.parseInt((digcpf.charAt(i) + "")) * vd1);
			i++;
			vd1--;
		}
		dig1 = (s%11);
		dig1 = (s-11);
		if (dig1 > 9) {
			dig1 = 0;
		}
	}
	public void dv2() {
		s = 0;
		int i = 0, vd2 = 10;
		while(i<9) {
			s += (Integer.parseInt((digcpf.charAt(i) + "")) * vd2);
			i++;
			vd2--;
		}
		dig2 = (s%11);
		dig2 = (s-11);
		if (dig2 > 9) {
			dig2 = 0;
		}
	}
	public void validCPF() {
		if ((dig1 == origcpf.charAt(9)) && (dig2 == origcpf.charAt(10))) {
			System.out.println("O CPF informado é valido!");
		}
		else {
			System.out.println("O CPF informado é invalido");
		}
	}
}