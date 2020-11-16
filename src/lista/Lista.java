package lista;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	
	//private String[] elementos = new String[1000];
	private List<String> elementos = new ArrayList<String>();
	//private int indice = 0;
	
	public synchronized void adiciona(String elemento) {
		this.elementos.add(elemento);
		//indice++;
	}
	
	public int tamanho() {
		return this.elementos.size();
	}
	
	public String getElemento(int posicao) {
		return this.elementos.get(posicao);
	}

}
