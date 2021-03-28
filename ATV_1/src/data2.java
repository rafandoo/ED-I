import java.util.Scanner;
public class data2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x = 0;
		boolean y = true;
		data tdata = new data();
		while (y=true) {
			System.out.println("Sistema validador de datas");
			System.out.println("\n1- Validação separada");
			System.out.println("2- Validação completa");
			System.out.println("3- Transformar data por extenso");
			System.out.println("0- Sair");
			System.out.println("\n Digite a opção desejada: ");
			x = entrada.nextInt();
		
			switch(x) {
			case 1:
				tdata.entDataA();
				break;
			case 2:
				tdata.entDataB();
				break;
			case 3:
				tdata.entDataC();
				break;
			case 0:
				y = false;
				break;
			default:
				System.out.println("opção invalida!");
			}

		}
	}
}
