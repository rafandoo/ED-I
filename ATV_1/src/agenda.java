import java.util.ArrayList;
import java.util.Scanner;
public class agenda {

	public void inserirContato(Contato contato) throws ListaCheiaException {
	
		int tamanhoLista = this.registros.size();
		if (tamanhoLista < this.tamanhoMaximo) {
		
			this.registros.add(contato);
		} else {
		}
	}

	public void editarContato(String telefone, Contato contato) {
		for (int i = 0; i < this.registros.size(); i++) {
			if (this.registros.get(i).getTelefone() == telefone) {
				this.registros.get(i).setCodigo(contato.getCodigo());
				this.registros.get(i).setNome(contato.getNome());
				return;
			}
		}

	System.out.println("**********************************************");
	System.out.println("Registro Não Encontrado.");
	System.out.println("**********************************************\n");

}

	public void apagarContato(Contato contato) {
		this.registros.remove(contato);
	}

	public void apagarTodos() {
		this.registros.clear();
	}

	public void imprimirMemoria() {
		int memoria = this.registros.size();
		System.out.println("Memória: " + memoria + "/10");
	}
}