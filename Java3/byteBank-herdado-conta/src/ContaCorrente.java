
public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		
	}
	
	@Override
	public boolean saca(double valor) {
		double valorSerSacado = valor + 0.20;
		return super.saca(valorSerSacado);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

}
