import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//dados do usua´rio
		float numero1, numero2, resultado;
		int operação;
		
		//entrada de dados
		System.out.println("Número 1: ");
		numero1 = leia.nextFloat();

		System.out.println("Número 2: ");
		numero2 = leia.nextFloat();
		
		System.out.println("Operação: ");
		operação = leia.nextInt();
		
		//condição mais saída dos resultados
		switch (operação) {
		case 1:
			resultado = numero1 + numero2;
			System.out.println("Operação: Soma");
			System.out.println("Resultado: " + resultado);
			break;
			
		case 2:
			resultado = numero1 - numero2;
			System.out.println("Operação: Subtração");
			System.out.println("Resultado: " + resultado);
			break;
			
		case 3:
			resultado = numero1 * numero2;
			System.out.println("Operação: Multiplicação");
			System.out.println("Resultado: " + resultado);
			break;
			
		case 4:
			if (numero2 != 0) {
				resultado = numero1 / numero2;
				System.out.println("Operação: Divisão");
				System.out.println("Resultado: " + resultado);
			} else {
				System.out.println("Bloqueado: Divisão por zero não pode!");
			}
			break;
			
			default:
				System.out.println("Bloqueado: Operação inválida!");
		}
		
		
		
		leia.close();

	}

}
