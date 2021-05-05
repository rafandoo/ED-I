
public class filaRestaurante {
	
	//ATRIBUTOS
	private int[] filaRest;
	private int[] filaCX;
	
	private int primRest;
	private int primCX;
	
	private int ultRest;
	private int ultCX;
	
	private int totalRest;
	private int totalCX;
	
	private int totalAlm;
	
	//CONSTRUTOR
	public filaRestaurante() {
		this.filaRest = new int [15];
		this.filaCX = new int[15];
		
		this.primRest = 0;
		this.primCX = 0;
		
		this.ultRest = 0;
		this.ultCX = 0;
		
		this.totalRest = 0;
		this.totalCX = 0;
		this.totalAlm = 0;
	}
	
	
	//GETTER E SETTERS
	public int getTotalCX() {
		return totalCX;
	}
	public void setTotalCX(int totalCX) {
		this.totalCX = totalCX;
	}
	
	public int getTotalRest() {
		return totalRest;
	}
	public void setTotalRest(int totalRest) {
		this.totalRest = totalRest;
	}
	
	public int getTotalAlm() {
		return totalAlm;
	}
	public void setTotalAlm(int totalAlm) {
		this.totalAlm = totalAlm;
	}
	
	//METODO PARA INSERIR ELEMENTOS FILA REST
	public void inserirFimR(int num) {
		if(this.ehCheioFR()) {
			System.out.println("A fila esta cheia!");
		} else {
			this.filaRest [this.ultRest] = num;
			this.ultRest = ((this.ultRest + 1) % this.filaRest.length);
			this.totalRest++;	
		}
	}

	//METODO PARA INSERIR ELEMENTOS FILA CAIXA
	public void inserirFimC(int num) {
		if(this.ehCheioFC()) {
			System.out.println("A fila esta cheia!");
		} else {
			this.filaCX [this.ultCX] = num;
			this.ultCX = ((this.ultCX + 1) % this.filaCX.length);
			this.totalCX++;
		}
	}
	
	//METODO PARA RETIRAR DA FILA REST
	public int removeIniR() {
		if(this.ehVazioFR()) {
			System.out.println("A fila esta vazia!");
			return (0);
		} else {
			int aux = filaRest[this.primRest];
			this.primRest = ((this.primRest + 1) % this.filaRest.length);
			this.totalRest--;
			return aux;
		}
	}
	
	//METODO PARA RETIRAR DA FILA CAIXA
	public int removeIniC() {
		if(this.ehVazioFC()) {
			System.out.println("A fila esta vazia!");
			return (0);
		} else {
			int aux = filaRest[this.primRest];
			this.primCX = ((this.primCX + 1) % this.filaCX.length);
			this.totalCX--;
			return aux;
		}
	}
	
	//METODO PARA VERIFICAR SE ESTA VAZIO FILA REST
	public boolean ehVazioFR() {
		return (this.totalRest == 0);
	}
	
	//METODO PARA VERIFICAR SE ESTA CHEIO FILA REST
	public boolean ehVazioFC() {
		return (this.totalCX == 0);
	}
	
	
	//METODO PARA VERIFICAR SE ESTA CHEIO FILA REST
	public boolean ehCheioFR() {
		return (this.totalRest == this.filaRest.length);
	}
	
	//METODO PARA VERIFICAR SE ESTA CHEIO FILA CAIXA
	public boolean ehCheioFC() {
		return (this.totalCX == this.filaCX.length);
	}

}
