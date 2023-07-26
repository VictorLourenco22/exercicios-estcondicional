import java.util.Scanner;
import java.util.Locale;

public class ex8if {

	public static void main(String[] args) {
		/*
		 * Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em
		 * pagar seus impostos, pois sabem que nele não existem políticos corruptos e os
		 * recursos arrecadados são utilizados em benefício da população, sem qualquer
		 * desvio. A moeda deste país é o Rombus, cujo símbolo é o R$. Leia um valor com
		 * duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em
		 * seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de
		 * Renda, segundo a tabela abaixo.
		 */

		// 0.00 - 2000.00 "Isento"
		// 2000.01 - 3000.00 "8%"
		// 3000.01 - 4500.00 "18%"
		// < 4500.01 "28%"

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double salario = sc.nextDouble();

		double imposto;
		/*
		 * if (salario >= 0.00 && salario <= 2000.00) { imposto = 0.00;
		 * System.out.println("Isento."); } else if (salario >= 2000.01 && salario <=
		 * 3000.00) { imposto = salario * 0.08; System.out.println("R$ "+ imposto); }
		 * else if (salario >= 3000.01 && salario <= 4500.00) { imposto = salario *
		 * 0.18; System.out.println("R$ "+ imposto); } else if (salario >= 4500.01) {
		 * imposto = salario * 0.28; System.out.println("R$ "+ imposto); }
		 */

		if (salario <= 2000.0) {
			imposto = 0.0;
		} else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		} else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		} 
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		if (imposto == 0.0) {
			System.out.println("Isento");
		} 
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}

		sc.close();
	}

}
