import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro de 1 a 7 representando um dia da semana (1 = domingo, 2
		 * = segunda, e assim por diante) e escreva na tela o dia da semana
		 * correspondente.
		 */

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		String dia;

		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sábado";
			break;
		default:
			dia = "valor inválido";
		}
		System.out.println("O dia correspondente é: "+ dia);
		sc.close();
	}

}
