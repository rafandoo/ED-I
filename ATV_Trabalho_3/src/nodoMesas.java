
public class nodoMesas {
	private mesas m;
	private nodoMesas prox;
	
	public nodoMesas(mesas m) {
		this.m = m;
		this.prox = null;
	}

	public mesas getM() {
		return m;
	}
	public void setM(mesas m) {
		this.m = m;
	}
	
	public nodoMesas getProxM() {
		return prox;
	}
	public void setProxM(nodoMesas prox) {
		this.prox = prox;
	}
}
