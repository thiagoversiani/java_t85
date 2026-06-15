import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//dados do usuário
		String nome;
		float nota;
		
		//entrada dos dados
		//usei nextLine para o usuário poder colocar o nome completo
		System.out.println("Nome: ");
		nome = leia.nextLine();
		
		System.out.println("Nota: ");
		nota = leia.nextFloat();
		
		System.out.println("Aluno: " + nome);
		
		//condição mais saída de resultado
		if (nota >= 7) {
			System.out.println("Situação: Aprovado");
		}else if (nota >= 5 && nota < 7) {
			System.out.println("Situação: Recuperação");

		} else {
			System.out.println("Situação: Reprovado");

		}
		
		
		
		
		leia.close();

	}

}
