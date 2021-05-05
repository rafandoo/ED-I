
public class nodo {
	private comanda c;
	private nodo prox;
	
	public nodo(comanda c) {
		this.c = c;
		this.prox = null;
	}
	public comanda getC() {
		return c;
	}
	public void setC(comanda c) {
		this.c = c;
	}
	
	public nodo getProx() {
		return prox;
	}
	public void setProx(nodo prox) {
		this.prox = prox;
	}
}
