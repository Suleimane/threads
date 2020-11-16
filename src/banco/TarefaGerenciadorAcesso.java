package banco;

public class TarefaGerenciadorAcesso implements Runnable {

	private PoolDeConexao pool;
	private GerenciadorDeTransacao tx;

	public TarefaGerenciadorAcesso(PoolDeConexao pool, GerenciadorDeTransacao tx) {
		this.pool = pool;
		this.tx = tx;
	}

	@Override
	public void run() {
		synchronized (pool) {
			System.out.println("Iniciando pool");
			pool.getConnection();
			
			synchronized (tx) {
				System.out.println("Iniciando tx");
				tx.begin();
			}
		}
	}

}
