import java.util.Scanner;
public class Data {
	Scanner entrada = new Scanner(System.in);
	
	String date = "";
	
	int DD, MM, AAAA = 0;
	boolean xd,xm,xa = true;
	boolean bix = false;
	
	public void entDataA() {
		xd = true;
		xm = true;
		xa = true;
		System.out.println("--Validador de datas--");
		System.out.print("Digite o dia: ");
		DD = entrada.nextInt();
		System.out.print("Digite o mes: ");
		MM = entrada.nextInt();
		System.out.print("Digite o ano: ");
		AAAA = entrada.nextInt();
		
		if ((DD > 32) && (0 <= DD)) {
			xd = false;
		}
		if (DD == 31) {
			if (MM == 4|MM == 6|MM == 9|MM == 11) {
				xd = false;
			}
		}
		if ((MM >= 13) && (0 <= MM)){
			xm = false;
		}
		if ((DD == 29) && (MM==02)){
			if((AAAA % 400 == 0) && (AAAA % 100 !=0)) {
				xa = true;
				bix = true;
			}
		}
		
		
		if ((xd == true) && (xm == true) && (xa == true)) {
			System.out.println("A data informada é valida!");
		} else {System.out.println("A data informada é invalida");}
				
	}
	
	public void entDataB() {
		xd = true;
		xm = true;
		xa = true;
		System.out.print("Digite a date (Formato DD/MM/AAAA)");
		date = entrada.nextLine();
		String Ddate = date.substring(0,2);
		int fDD = Integer.parseInt(Ddate);		
		String Mdate = date.substring(3,5);
		int fMM = Integer.parseInt(Mdate);		
		String Adate = date.substring(6,10);
		int fAAAA = Integer.parseInt(Adate);	
		if ((fDD > 32) && (0 <= fDD)) {
			xd = false;
		}
		if (fDD == 31) {
			if (fMM == 4|fMM == 6|fMM == 9|fMM == 11) {
				xd = false;
			}
		}
		if ((fMM >= 13) && (0 <= fMM)){
			xm = false;
		}
		if ((fDD == 29) && (fMM==02)){
			if((fAAAA % 400 == 0) && (fAAAA % 100 !=0)) {
				xa = true;
				bix = true;
			}
		}
		if ((xd == true) && (xm == true) && (xa == true)) {
			System.out.println("A data informada é valida!");
		} else {System.out.println("A data informada é invalida");}		
	}

	public void entDataC() {
		xd = true;
		xm = true;
		xa = true;
		String mes = "";
		System.out.print("Digite a date (Formato DD/MM/AAAA)");
		date = entrada.nextLine();
		String Ddate = date.substring(0,2);
		int fDD = Integer.parseInt(Ddate);		
		String Mdate = date.substring(3,5);
		int fMM = Integer.parseInt(Mdate);	
		String Adate = date.substring(6,10);
		int fAAAA = Integer.parseInt(Adate);		
		if ((fDD > 32) && (0 <= fDD)) {
			xd = false;
		}
		if (fDD == 31) {
			if (fMM == 4|fMM == 6|fMM == 9|fMM == 11) {
				xd = false;
			}
		}
		if ((fMM >= 13) && (0 <= fMM)){
			xm = false;
		}
		if ((fDD == 29) && (fMM==02)){
			if((fAAAA % 400 == 0) && (fAAAA % 100 !=0)) {
				xa = true;
				bix = true;
			}
		}
		switch (fMM) {
			case 1: 
				mes = "Janeiro";
				break;
			case 2:
				mes = "Fevereiro";
				break;
			case 3:
				mes = "Março";
				break;
			case 4:
				mes = "Abril";
				break;
			case 5:
				mes = "Maio";
				break;
			case 6:
				mes = "Junho";
				break;
			case 7:
				mes = "Julho";
				break;
			case 8:
				mes = "Agosto";
				break;
			case 9:
				mes = "Setembro";
				break;
			case 10:
				mes = "Outubro";
				break;
			case 11:
				mes = "Novembro";
				break;
			case 12:
				mes = "Dezembro";
				break;
		}
		if ((xd == true) && (xm == true) && (xa == true)) {
			System.out.println("A data informada é valida!");
			System.out.println("A data por extenso: "+fDD+" de "+mes+" de "+fAAAA);
		} else {System.out.println("A data informada é invalida");}		
	}
		
}