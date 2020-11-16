package lista;

public class TarefaAdicionaElementoNativo implements Runnable {
	
	private ListaNativa lista;
	private int numeroThread;
	
	public TarefaAdicionaElementoNativo(ListaNativa lista, int numeroThread) {
			this.lista = lista;
			this.numeroThread = numeroThread;
	}

	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			this.lista.adiciona("Thread " + numeroThread + " - " + i);
		}
	}

}
