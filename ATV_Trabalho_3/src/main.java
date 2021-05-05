import java.text.DecimalFormat;
import java.util.Scanner;

public class main {
	
	//METODO PARA LIMPAR A TELA DE SAIDA
	private static void limpaTela() {
		System.out.println("\n\n\n\n\n\n\n\n");
	}
	
	//METODO PARA LIMPAR BUFFER DO TECLADO \n
	private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
	}
	
	//METODO DE ARREDONDAMENTO MONETARIO
	private static String arredondar(double n) {
		return (new DecimalFormat("#,##0.00").format(n));
	}
	
	//CARDAPIO DE BEBIDAS
	public static float cardBebidas() {
		int esc;
		System.out.println("==            CARDAPIO DE BEBIDAS            ==");
		System.out.println("= 1- Soda Laranjadinha 600ml (R$4,50)         =");
		System.out.println("= 2- Suco natural de laranja 350ml (R$6,30)   =");
		System.out.println("= 3- Pepsh Cola 1,5L (R$7,25)                 =");
		System.out.println("= 4- Achocolatado Choque Leite 260ml (R$2,60) =");
		System.out.print("\n=Digite sua escolha: ");
		esc = new Scanner(System.in).nextInt();
		if(esc==1) {
			return (4.50f);
		}
		if(esc==2) {
			return (6.30f);
		}
		if(esc==3) {
			return (7.25f);
		} else {
			return (2.60f);
		}
	}
	
	//MENU PRINCIPAL
	public static char menu() {
		String msg;
		Scanner ent = new Scanner(System.in);
		limpaTela();
		
		System.out.println("** Sistema gerencial Dev's Restaurant **");
		System.out.println("**             Versão 2.0             **\n");
		
		System.out.println("======      MENU DE FUNÇÔES       ======");
		System.out.println("= 1- Abrir Restaurante                 =");
		System.out.println("= 2- Buffet                            =");
		System.out.println("= 3- Administração                     =");
		System.out.println("= 4- Caixa                             =");
		System.out.println("= 5- Relatorio de fluxo                =");
		System.out.println("= 6- Encerrar                          =");
		System.out.println("========================================");
		System.out.print("\n= Digite uma opção: ");
		msg = ent.next();
		clearBuffer(ent);
		return msg.charAt(0);
	}

	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		ListaS rest = new ListaS();
		filaRestaurante filaR = new filaRestaurante();
		adm admin = new adm();
		pratos pp = new pratos();
		comanda c;
		mesas m;
		char opc;
		boolean abrir = false;
		
		do {
			opc = menu();
			limpaTela();
			switch(opc) {
				case '1':
					if(abrir == false) {
						System.out.println("Deseja abrir o restaurante agora? (S/N)");
						String esclh = ent.next().toUpperCase();
						if(esclh.charAt(0) == 'S') {
							
							admin.setValorbuffet(15.00f);
							int i=1; //INICIALIZA AS MESAS, A FILA E OS PRATOS
							while(i!=11) {
								
								if(i==1) {
									m = new mesas();
									m.setMesa("1");
									rest.inserirIni(m);
									filaR.inserirFimR(i);
									pp.inserirPrato(i);
									i++;
								}
								if(i==2) {
									m = new mesas();
									m.setMesa("2");
									rest.inserirIni(m);
									filaR.inserirFimR(i);
									pp.inserirPrato(i);
									i++;
								}
								if(i==3) {
									m = new mesas();
									m.setMesa("3");
									rest.inserirIni(m);
									filaR.inserirFimR(i);
									pp.inserirPrato(i);
									i++;
								}
								if(i==4) {
									m = new mesas();
									m.setMesa("4");
									rest.inserirIni(m);
									filaR.inserirFimR(i);
									pp.inserirPrato(i);
									i++;
								}
								if(i==5) {
									m = new mesas();
									m.setMesa("5");
									rest.inserirIni(m);
									filaR.inserirFimR(i);
									pp.inserirPrato(i);
									i++;
								}
								if(i==6) {
									m = new mesas();
									m.setMesa("6");
									rest.inserirIni(m);
									filaR.inserirFimR(i);
									pp.inserirPrato(i);
									i++;
								}	
								if(i==7) {
									m = new mesas();
									m.setMesa("7");
									rest.inserirIni(m);
									filaR.inserirFimR(i);
									pp.inserirPrato(i);
									i++;
								}
								if(i==8) {
									m = new mesas();
									m.setMesa("8");
									rest.inserirIni(m);
									filaR.inserirFimR(i);
									pp.inserirPrato(i);
									i++;
								}
								if(i==9) {
									m = new mesas();
									m.setMesa("9");
									rest.inserirIni(m);
									filaR.inserirFimR(i);
									i++;
								}
								if(i==10) {
									m = new mesas();
									m.setMesa("10");
									rest.inserirIni(m);
									filaR.inserirFimR(i);
									i++;
								}
								System.out.println("Inicialização concluida com sucesso!");
								abrir = true;
							}
						} else {
							System.out.println("Restaurante não aberto!");
						}
					} else {
						System.out.println("Restaurante ja aberto!");
					}
					
					
				case '2':
					if (abrir) {
						c = new comanda();
						m = new mesas();
						
						if(filaR.ehVazioFR()) {
							System.out.println("Não tem ninguem na fila para o buffet");
						} else {
							System.out.println("Sirva-se em nosso buffet livre, valor R$"+arredondar(admin.getValorbuffet()) +" por pessoa");
							System.out.print("\nDigite o numero da comanda: ");
							c.setComanda(ent.next());
							System.out.println("Deseja incluir uma bebida? (S/N)");
							String esclh = ent.next().toUpperCase();
							if(esclh.charAt(0) == 'S') {
								c.setValor(cardBebidas()+admin.getValorbuffet());
							} else {
								c.setValor(admin.getValorbuffet());
							}
							
							boolean mmenu = true;
							while(mmenu) { 											//REVER ESSA PARTE URGENTE!!!!
								System.out.print("\nMesas disponiveis: ");
								System.out.print(rest.imprimirMesas());
								System.out.print("\nDigite a mesa desejada: ");
								String mesa = ent.next();
								if(rest.ocupaMesa(mesa)){
									c.setMesas(mesa);
									System.out.println("Mesa ocupada com sucesso!");
									mmenu = false;
								} else {
									System.out.println("Mesa indisponivel");
								}
							}
							admin.setQuantAtend(admin.getQuantAtend()+1);
							filaR.setTotalAlm(filaR.getTotalAlm()+1);
							rest.inserirIni(c);
							filaR.removeIniR();
						}
					} else {
						System.out.println("RESTAURANTE FECHADO!");
					}
					break;
					
				case '3':
					if(abrir) {
						System.out.println("===      ADMINISTAÇÃO      ===");
						System.out.println("= 1- Inserir pratos na pilha =");
						System.out.println("= 2- Inserir pessoas na fila =");
						System.out.println("= 3- Mudar valor do buffet   =");
						System.out.println("= 4- Pessoas que almocaram   =");
						System.out.println("==============================");
						System.out.print("\n=Digite a operação desejada: ");
						
						String op = ent.next();
						switch(op.charAt(0)) {
							case '1':
								System.out.print("\n\nDigite a quantidade de pratos a ser inserido: ");
								int quant = ent.nextInt();
								for(int i=0;i<=quant;i++) {
									pp.inserirPrato(i);
								}
								break;
								
							case '2':
								System.out.println("*Quantidade maxima de pessoas na fila é de 15");
								System.out.print("\nDigite a quantidade de pessoas para entrar na fila: ");
								quant = ent.nextInt();
								for(int i=0;i<quant;i++) {
									filaR.inserirFimR(i);
								}
								break;
								
							case '3':
								System.out.println("====              # ATENÇÃO #                ====");
								System.out.println("= Essa operação não altera comandas ja criadas! =");
								System.out.print("\nDigite o novo valor do buffet: R$");
								admin.setValorbuffet(ent.nextFloat());
								break;
								
							case '4':
								System.out.println("=====   CONTROLE REST   ====");
								System.out.print("\nQuantidade de pessoas almocando atualmente: "+filaR.getTotalAlm());
								System.out.print("\n\nDigite a quantidade de pessoas que acabaram de almocar: ");
								int p = ent.nextInt();
								if(filaR.getTotalAlm()<p) {
									System.out.println("Quantidade Invalida!");
								} else {
									for(int i=0;i<p;i++) {
										filaR.setTotalAlm(filaR.getTotalAlm()-1);
										filaR.inserirFimC(i);
									}
								}
								break;
								
							default:
								System.out.println("opção invalida!");
								break;
						}
					} else {
						System.out.println("Restaurante não aberto!");
					}
					break;
					
				case '4':
					if(abrir) {
						System.out.println("======      CAIXA       ======");
						boolean pag = true;
						if(filaR.ehVazioFC()) {
							System.out.println("A fila do caixa esta vazio!");
						} else {
							do {
								System.out.print("\n=Digite o numero da comanda: ");
								String numC = ent.next();
								double valor = rest.pesquisaValor(numC);
								if(valor != 0) {
									System.out.print("\n=Valor total devido: ");
									System.out.println(arredondar(valor));
									String mesa = rest.pesquisaMesa(numC);
									System.out.println("\n=Deseja realizar o pagamento? (S/N)");
									String escl = ent.next().toUpperCase();
									if(escl.charAt(0) == 'S') {
										m = new mesas();
										rest.pagaComanda(numC);
										m.setMesa(mesa);
										rest.inserirUlt(m);
										filaR.removeIniC();
										admin.setMovTotal(admin.getMovTotal()+valor);
										System.out.println("Comanda paga com sucesso!");
										pag = false;
									} else {
										System.out.println("Comanda não paga!");
										pag = false;
									}
								} else {
									System.out.println("Comanda não localizada!");
								}
							} while(pag);
						}
					} else {
						System.out.println("Restaurante não aberto!");
					}
					break;
					
					
					
					
					
				case '5':
					if(abrir) {
						System.out.println("=== RELATORIOS GERENCIAIS ===");
						System.out.print("\nDeseja emitir um relatorio do restaurante? (S/N)");
						String escl = ent.next().toUpperCase();
						if(escl.charAt(0) == 'S') {
							limpaTela();
							m = new mesas();
							System.out.println("=== RELATORIOS GERENCIAIS ===");
							System.out.print("\n\n= Numero de pessoas na fila do restaurante: "+filaR.getTotalRest());
							System.out.print("\n= Numero de pessoas na fila do caixa: "+filaR.getTotalCX());
							System.out.print("\n= Numero de pessoas almocando no atual momento: "+filaR.getTotalAlm());
							System.out.print("\n= Numero de pessoas atendidas no restaurante: "+admin.getQuantAtend());
							System.out.print("\n= Numero de pratos na pilha: "+pp.getQuantPrato());
							System.out.print("\n= Numero de mesas livres: "+rest.getQuantMesas());
							System.out.print("\n= Fluxo total de caixa: "+arredondar(admin.getMovTotal()));
							System.out.println("\n\nTecle <enter>, para continuar");
							String pause = ent.nextLine();
							clearBuffer(ent);
						} else {
							System.out.println("Fechando sistema de relarios!");
						}
					} else {
						System.out.println("Restaurante não aberto!");
					}
					
					break;
					
					
					
					
		
					
					
				default:
					System.out.println("");
			}
		} while(opc != '6');
		ent.close();
		System.exit(0);
	}	
}
