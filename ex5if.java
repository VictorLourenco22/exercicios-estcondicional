import java.util.Scanner;
public class ex5if {

	public static void main(String[] args) {
		
		/*
		 * Com base na tabela abaixo, 
		 * escreva um programa que leia o código de um item 
		 * e a quantidade deste item. 
		 * A seguir, calcule e mostre o valor da conta a pagar.
		 */
		
		Scanner sc = new Scanner (System.in);
		
		int codigo, quantidade;
		
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		double conta;
		if (codigo > 5 || codigo <= 0) {
			System.out.println("Código inválido, tente novamente.");
		}
		else if (codigo == 1) {
			conta = (double) quantidade * 4.00;
			System.out.printf("Total: %.2fR$", conta);
		}
		else if (codigo == 2) {
			conta = (double) quantidade * 4.50;
			System.out.printf("Total: %.2fR$", conta);
		}
		else if (codigo == 3) {
			conta = (double) quantidade * 5.00;
			System.out.printf("Total: %.2fR$", conta);
		}
		else if (codigo == 4) {
			conta = (double) quantidade * 2.00;
			System.out.printf("Total: %.2fR$", conta);
		}
		else if (codigo == 5) {
			conta = (double) quantidade * 1.50;
			System.out.printf("Total: %.2fR$", conta);
		}
		
		
		sc.close();

		
	}

}
