package banco;
public class PrincipalBanco {

    public static void main(String[] args) {

        GerenciadorDeTransacao tx = new GerenciadorDeTransacao();
        PoolDeConexao pool = new PoolDeConexao();
        
        new Thread(new TarefaGerenciadorConexao(pool, tx)).start();
        new Thread(new TarefaGerenciadorAcesso(pool, tx)).start();

    }
}