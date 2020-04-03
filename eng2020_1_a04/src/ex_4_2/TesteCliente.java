package ex_4_2;

public class TesteCliente {

	public static void main(String[] args) {
		SomadorExistente existente = new SomadorExistente();
		ExistenteToEsperadoAdapter adapter = new ExistenteToEsperadoAdapter(existente);
		
		Cliente cliente = new Cliente(adapter);
		
		cliente.executar();

	}

}