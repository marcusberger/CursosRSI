
public class TestesSistema {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setSenha(222);
		
		
		Administrador adm = new Administrador();
		adm.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);

	}

}
