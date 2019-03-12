import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WebServiceConection extends Conexao {

	Connection conexao;

	@Override
	public void driver() {
		try {
			Class.forName("com.br.driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void abrirConexao() {
		try {
			if (!(conexao.isClosed())) {
				try {
					conexao = DriverManager.getConnection("abrir");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void carregarDriver() {
		// TODO Auto-generated method stub

	}

	@Override
	public void logarAberturaDaconexao() {
		Logger.getGlobal().log(Level.ALL, "SUA CONEXÃO TA ATIVA. APROVEITE");
	}

}
