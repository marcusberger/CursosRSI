
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario marcus = new Funcionario();
		
		marcus.setNome("Marcus");
		marcus.setCpf("1234678");
		marcus.setSalario(2500);
		
		System.out.println("Nome: " + marcus.getNome());
		System.out.println("CPF: " + marcus.getCpf());
		System.out.println("Salario: " + marcus.getSalario());
		
		System.out.println("Bonificação: " + marcus.getBonificacao());
		
		System.out.println("Total salario: " + (marcus.getSalario() + marcus.getBonificacao()));
		
		

	}

}
