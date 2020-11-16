package lista;

import java.util.List;
import java.util.Vector;

public class Principal {
	
	public static void main(String[] args) throws InterruptedException {
		
		// Não é sincronizadp
		//List<String> lista = new ArrayList<String>();
		// Classe fachada para criar lista sincronozada
		//List<String> lista = Collections.synchronizedList(new ArrayList<>());
		List<String> lista = new Vector<String>();
		
		for(int i = 0; i < 10; i++) {
			new Thread(new TarefaAdicionaElemento(lista, i)).start();
		}
		
		Thread.sleep(2000);
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(i + " - " + lista.get(i));
		}

	}
}
