package byteBank;

public class TesteCliente {
	
	public static void main(String[] args) {
		
		
		Conta cliente1 = new Conta();
		
		cliente1.titular = new Cliente();
		
		cliente1.titular.nome = "marcus";
				
		System.out.println(cliente1.titular.nome);
	}

}
