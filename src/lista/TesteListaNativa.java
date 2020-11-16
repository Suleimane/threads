package lista;

public class TesteListaNativa {
	
	public static void main(String[] args) throws InterruptedException {
		
		ListaNativa listaNativa = new ListaNativa();
		
		for(int i = 0; i < 10; i++) {
			new Thread(new TarefaAdicionaElementoNativo(listaNativa, i)).start();
		}
		
		new Thread(new TarefaImprimir(listaNativa), "Tarefa 1").start();
	}

}
