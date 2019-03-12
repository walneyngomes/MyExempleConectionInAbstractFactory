
public abstract class FactoryWindow {

	public Conexao criarWindownsComConexaoEm(String tipo) {
		Conexao conexao = null;
		conexao = obter(tipo);
		conexao.abrirConexao();
		conexao.carregarDriver();
		conexao.logarAberturaDaconexao();
		return conexao;

	}

	public abstract Conexao obter(String tipo);

}
