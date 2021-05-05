
public class ListaS {

	
	mesas m = new mesas();
	
	//ATRIBUTOS
	private nodo prim;
	private nodo ult;
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
	public nodo getPrim() {
		return prim;
	}
	public void setPrim(nodo prim) {
		this.prim = prim;
	}
	
	public nodo getUlt() {
		return ult;
	}
	public void setUlt(nodo ult) {
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
	public void inserirIni(comanda c) {
		nodo NvNodo = new nodo(c);
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
			nodo atual = this.prim;
			while(atual != null) {
				msg += atual.getC().getComanda() + " -> ";
				atual = atual.getProx();
			}
		}
		return msg;
	}
	
	//METODO PAGA COMANDA
	public boolean pagaComanda(String numC) {
		nodo atual = this.prim;
		nodo ant = null;
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
		nodo atual = this.prim;
		while((atual != null) && (!atual.getC().getComanda().equals(numC))) {
			atual = atual.getProx();
		}
		return (atual.getC().getValor()); //RETORNA O VALOR ACUMULADO NA COMANDA
	}
	
	//METODO DE PESQUISA COMANDA MESA
		public String pesquisaMesa(String numC) {
			nodo atual = this.prim;
			while((atual != null) && (!atual.getC().getComanda().equals(numC))) {
				atual = atual.getProx();
			}
			return (atual.getC().getMesas()); //RETORNA O VALOR DA MESA
		}
	
	//MESAS
	
	//ATRIBUTOS
	private nodoMesas primM;
	private nodoMesas ultM;
	private int quantMesas;
	
	//GETTERS E SETTERS
	public void setPrimM(nodoMesas primM) {
		this.primM = primM;
	}
	public nodoMesas getPrimM() {
		return primM;
	}
	
	public void setUltM(nodoMesas ultM) {
		this.ultM = ultM;
	}
	public nodoMesas getUltM() {
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
	public void inserirIni(mesas m) {
		nodoMesas NvNodo2 = new nodoMesas(m);
		if(this.ehVazioM()) {
			this.ultM = NvNodo2;
		}
		NvNodo2.setProxM(this.primM);
		this.primM = NvNodo2;
		NvNodo2 = null;
		this.quantMesas++;
	}
	
	//METODO DE INSERSÂO 2
	public void inserirUlt(mesas m) {
		nodoMesas NvNodo2 = new nodoMesas(m);
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
		nodoMesas atual = this.primM;
		while(atual != null) {
			msg += atual.getM().getMesa() + " - ";
			atual = atual.getProxM();
		}
		return msg;
	}

	//METODO OCUPAR MESA
	public boolean ocupaMesa(String numM) {
		nodoMesas atualM = this.primM;
		nodoMesas antM = null;
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
		nodoMesas atual2 = this.primM;
		while((atual2 != null) && (!atual2.getM().getMesa().equals(numM))) {
			atual2 = atual2.getProxM();
		}
	return true;
		
	}
}
