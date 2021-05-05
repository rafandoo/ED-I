
public class ListaS {

	
	Mesas m = new Mesas();
	
	//ATRIBUTOS
	private Nodo prim;
	private Nodo ult;
	private int QuantComandas;
	
	//CONSTRUTOR 
	public ListaS() {        
		this.prim = null;
		this.ult = null;
		this.QuantComandas = 0;
		
		this.primM = null;
		this.ultM = null;
		this.quantMesas = 0;
		
	}
	
	//GETTERS E SETTERS
	public Nodo getPrim() {
		return prim;
	}
	public void setPrim(Nodo prim) {
		this.prim = prim;
	}
	
	public Nodo getUlt() {
		return ult;
	}
	public void setUlt(Nodo ult) {
		this.ult = ult;
	}
	
	public int getQuantComandas() {
		return QuantComandas;
	}
	public void setQuantComandas(int quantComandas) {
		this.QuantComandas = quantComandas;
	}
	
	//METODO DE TESTE NODO VAZIO
	public boolean ehVazio() {
		return(this.prim == null);
	}
	
	//METODO INSERIR NO INICIO
	public void inserirIni(Comanda c) {
		Nodo NvNodo = new Nodo(c);
		if(this.ehVazio()) {
			this.ult = NvNodo;
		}
		NvNodo.setProx(this.prim);
		this.prim = NvNodo;
		this.QuantComandas++;
	}
	
	
	//METODO IMPRIMIR COMANDA
	public String imprimirLista() {
		String msg = "";
		if(this.ehVazio()) {
			msg = "A lista está vazia!";
		} else {
			Nodo atual = this.prim;
			while(atual != null) {
				msg += atual.getC().getComanda() + " -> ";
				atual = atual.getProx();
			}
		}
		return msg;
	}
	
	//METODO PAGA COMANDA
	public boolean pagaComanda(String numC) {
		Nodo atual = this.prim;
		Nodo ant = null;
		if(this.ehVazio()) {
			return false;
		} else {
			while((atual != null)&&(!atual.getC().getComanda().equals(numC))) {
			ant = atual;
			atual = atual.getProx();
			}
			if(atual == this.prim) {
				if(this.prim == this.ult) {
					this.ult = null;
				}
				this.prim = this.prim.getProx();
			} else {
				if(atual == this.ult) {
					this.ult = ant;
				}
				ant.setProx(atual.getProx());
		}
		return true;
		}
	}
	
	//METODO DE PESQUISA COMANDA VALOR
	public double pesquisaValor(String numC) {
		Nodo atual = this.prim;
		while((atual != null) && (!atual.getC().getComanda().equals(numC))) {
			atual = atual.getProx();
		}
		return (atual.getC().getValor()); //RETORNA O VALOR ACUMULADO NA COMANDA
	}
	
	//METODO DE PESQUISA COMANDA MESA
		public String pesquisaMesa(String numC) {
			Nodo atual = this.prim;
			while((atual != null) && (!atual.getC().getComanda().equals(numC))) {
				atual = atual.getProx();
			}
			return (atual.getC().getMesas()); //RETORNA O VALOR DA MESA
		}
	
	//MESAS
	
	//ATRIBUTOS
	private NodoMesas primM;
	private NodoMesas ultM;
	private int quantMesas;
	
	//GETTERS E SETTERS
	public void setPrimM(NodoMesas primM) {
		this.primM = primM;
	}
	public NodoMesas getPrimM() {
		return primM;
	}
	
	public void setUltM(NodoMesas ultM) {
		this.ultM = ultM;
	}
	public NodoMesas getUltM() {
		return ultM;
	}
	
	public void setQuantMesas(int quantMesas) {
		this.quantMesas = quantMesas;
	}
	public int getQuantMesas() {
		return quantMesas;
	}

	
	//METODOS EHVAZIO
	public boolean ehVazioM() {
		return (this.primM == null);
	}
	
	//METODO DE INSERSÂO
	public void inserirIni(Mesas m) {
		NodoMesas NvNodo2 = new NodoMesas(m);
		if(this.ehVazioM()) {
			this.ultM = NvNodo2;
		}
		NvNodo2.setProxM(this.primM);
		this.primM = NvNodo2;
		NvNodo2 = null;
		this.quantMesas++;
	}
	
	//METODO DE INSERSÂO 2
	public void inserirUlt(Mesas m) {
		NodoMesas NvNodo2 = new NodoMesas(m);
		if(this.ehVazioM()) {
			this.primM = NvNodo2; 
		} else {
			this.ultM.setProxM(NvNodo2);
		}
		this.ultM = NvNodo2;
		this.quantMesas++;
	}
	
	//METODO IMPRESSÃO
	public String imprimirMesas() {
		String msg = "";
		NodoMesas atual = this.primM;
		while(atual != null) {
			msg += atual.getM().getMesa() + " - ";
			atual = atual.getProxM();
		}
		return msg;
	}

	//METODO OCUPAR MESA
	public boolean ocupaMesa(String numM) {
		NodoMesas atualM = this.primM;
		NodoMesas antM = null;
		if(this.ehVazioM()) {
			return false;
		} else {
			while((atualM != null)&&(!atualM.getM().getMesa().equals(numM))) {
			antM = atualM;
			atualM = atualM.getProxM();
			}
			if(atualM == this.primM) {
				if(this.primM == this.ultM) {
					this.ultM = null;
				}
				this.primM = this.primM.getProxM();
			} else {
				if(atualM == this.ultM) {
					this.ultM = antM;
				}
				antM.setProxM(atualM.getProxM());
		}
		this.quantMesas--;
		return true;
		}
	}
	
	//METODO DE PESQUISA COMANDA
	public boolean pesquisaNodo2(String numM) {
		NodoMesas atual2 = this.primM;
		while((atual2 != null) && (!atual2.getM().getMesa().equals(numM))) {
			atual2 = atual2.getProxM();
		}
	return true;
		
	}
}
