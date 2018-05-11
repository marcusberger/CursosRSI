package byteBank;

public class CriarConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Primeira conta: " + primeiraConta.saldo);
		System.out.println("Segunda conta: " + segundaConta.saldo);
	}

}
