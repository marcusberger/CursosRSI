
public abstract class FuncionarioAutenticavel extends Funcionario {

	private int senha = 2222;
	
	public void autentica(FuncionarioAutenticavel fa) {
		
		boolean autenticou = fa.autentica(this.senha);
		
			if(autenticou) {
				System.out.println("Acesso liberado!");
			}else {
				System.out.println("Acesso negado! \n Corre berg!");
		}
	}

}
