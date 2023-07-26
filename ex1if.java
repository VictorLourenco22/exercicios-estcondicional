import java.util.Scanner;
public class ex1if {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro, 
		 * e depois dizer se este número é negativo ou não
		 */
		
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		
		if (x < 0) {
			System.out.println("negativo.");
		}
		else {
			System.out.println("não é negativo.");
		}
		sc.close();
		
		
		
		
	}

}
