import java.util.Locale;
import java.util.Scanner;

public class ex7if {

	public static void main(String[] args) {
		/*
		 * Leia 2 valores com uma casa decimal (x e y), que devem representar as
		 * coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao
		 * qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem
		 * (x = y = 0). Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o
		 * ponto estiver sobre um dos eixos, escreva “Eixo X” ou “Eixo Y”, conforme for
		 * a situação
		 */

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double x, y;

		x = sc.nextDouble();
		y = sc.nextDouble();

		boolean q1, q2, q3, q4, xh, yv;

		q1 = x > 0 && y > 0;
		q2 = x < 0 && y > 0;
		q3 = x < 0 && y < 0;
		q4 = x > 0 && y < 0;
		xh = (x > 0 || x < 0) && y == 0 ;
		yv = x == 0 && (y > 0 || y < 0);
		
		if (x == 0 && y == 0) {
			System.out.println("Origem.");
		}
		else if (q1 == true) {
			System.out.println("Q1.");
		}
		else if (q2 == true) {
			System.out.println("Q2.");
		}
		else if (q3 == true) {
			System.out.println("Q3.");
		}
		else if (q4 == true) {
			System.out.println("Q4.");
		}
		else if (xh == true) {
			System.out.println("Eixo X.");
		}
		else if (yv == true) {
			System.out.println("Eixo Y.");
		}
		
		sc.close();
	}

}
