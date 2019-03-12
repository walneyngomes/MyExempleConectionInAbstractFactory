
public class Windowns7Factory extends FactoryWindow {

	@Override
	public Conexao obter(String tipo) {

		Conexao con = null;
		if ("mysql".equals(tipo)) {
			con = new MySqlConection();
		} else if ("webservice".equals(tipo)) {
			con = new WebServiceConection();
		}

		return con;
	}

}
