package banco;

public class TarefaGerenciadorConexao implements Runnable {

	private PoolDeConexao pool;
	private GerenciadorDeTransacao tx;

	public TarefaGerenciadorConexao(PoolDeConexao pool, GerenciadorDeTransacao tx) {
		this.pool = pool;
		this.tx = tx;
	}

	@Override
	public void run() {
		synchronized (pool) {
			System.out.println("Iniciando pool de conexao");
			pool.getConnection();
			
			synchronized (tx) {
				System.out.println("Gerenciado transação");
				tx.begin();
			}
		}
	}

}
