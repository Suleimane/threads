package lista;

public class TarefaImprimir implements Runnable{
	
	private ListaNativa listaNativa;

	public TarefaImprimir(ListaNativa listaNativa) {
		this.listaNativa = listaNativa;
	}

	@Override
	public void run() {
		synchronized (listaNativa) {
			try {
				System.out.println("Indo dormir, aguardando notificação.");
				listaNativa.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for(int i = 0; i < listaNativa.tamanho(); i++) {
			System.out.println(i + " " + listaNativa.getElemento(i));
		}
	}

}
