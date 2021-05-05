
public class NodoMesas {
	private Mesas m;
	private NodoMesas prox;
	
	public NodoMesas(Mesas m) {
		this.m = m;
		this.prox = null;
	}

	public Mesas getM() {
		return m;
	}
	public void setM(Mesas m) {
		this.m = m;
	}
	
	public NodoMesas getProxM() {
		return prox;
	}
	public void setProxM(NodoMesas prox) {
		this.prox = prox;
	}
}
