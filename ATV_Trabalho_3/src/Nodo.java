
public class Nodo {
	private Comanda c;
	private Nodo prox;
	
	public Nodo(Comanda c) {
		this.c = c;
		this.prox = null;
	}
	public Comanda getC() {
		return c;
	}
	public void setC(Comanda c) {
		this.c = c;
	}
	
	public Nodo getProx() {
		return prox;
	}
	public void setProx(Nodo prox) {
		this.prox = prox;
	}
}
