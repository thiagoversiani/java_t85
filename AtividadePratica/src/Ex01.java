import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//dados do usuário
		String nome;
		int idade;
		boolean autorização;
		
		//entrada dos dados
		//usei nextLine para o usuário poder colocar o nome completo
		System.out.println("Nome: ");
		nome = leia.nextLine();
		
		System.out.println("Idade: ");
		idade = leia.nextInt();
		
		System.out.println("Autorização: ");
		autorização = leia.nextBoolean();
		
		//as condições e saída
		if (idade >= 18) {
			System.out.println("Acesso liberado para " + nome + ".");
		} else if (idade < 18 && autorização) {
			System.out.println("Acesso liberado com autorização para " + nome + ".");
		} else {
			System.out.println("Acesso negado para " + nome + ".");

		}
		
		
		
		
		
		leia.close();
	}

}
