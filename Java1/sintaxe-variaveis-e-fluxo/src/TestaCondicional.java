
public class TestaCondicional {
	
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		
		int idade = 17;
		int quantidadePessoas = 3;
		
		if(idade < 18 && quantidadePessoas < 3) {
			System.out.println("Voc� � menor de idade");
		}else {
			System.out.println("Voc� � maior de idade");
		}
		
		if(quantidadePessoas > 3) {
			System.out.println("Voc� n�o pode entrar sem estar acompanhado com no minimo 3 pessoas");
		}else {
			System.out.println("Voc� pode entrar, pois est� acompanhado");
		}
	}

}
