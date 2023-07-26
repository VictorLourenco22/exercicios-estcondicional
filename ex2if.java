import java.util.Scanner;

public class ex2if {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro e dizer se este número é par ou
		 * ímpar.
		 */

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		if (x % 2 == 0) {
			System.out.println("par.");
		} else {
			System.out.println("ímpar.");
		}

		sc.close();
	}

}
