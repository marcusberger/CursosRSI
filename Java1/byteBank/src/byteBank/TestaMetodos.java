package byteBank;

public class TestaMetodos {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 100;
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 1000.0;
		
		
		primeiraConta.deposita(100.0);
		primeiraConta.saca(50.0);
		segundaConta.transfere(500.0, primeiraConta);
		
		
		
		
		System.out.println(primeiraConta.saldo);
		System.out.println(segundaConta.saldo);
	}

}
