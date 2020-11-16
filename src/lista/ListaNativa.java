package lista;

public class ListaNativa {
	
    private String[] elementos = new String[1000];
    private int indice = 0;
	
	public synchronized void adiciona(String elemento) {
		this.elementos[indice] = elemento;
		indice++;
		
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if(this.indice == this.tamanho()) {
			System.out.println("Lista cheia notificando...");
			this.notify();
		}
	}
	
	public int tamanho() {
		return this.elementos.length;
	}
	
	public String getElemento(int posicao) {
		return this.elementos[posicao];
	}

}
