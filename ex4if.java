import java.util.Scanner;
public class ex4if {

	public static void main(String[] args) {
		/*
		 * Leia a hora inicial e a hora final de um jogo. 
		 * A seguir calcule a duração do jogo, sabendo que 
		 * o mesmo pode começar em um dia e terminar em outro, 
		 * tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 */
		
		Scanner sc = new Scanner (System.in);
		
		int horaInicial, horaFinal, duracao;
		
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();

		/*if (horaInicial > horaFinal) {
			duracao = 24 - horaInicial + horaFinal;
		}
		else {
			duracao = horaFinal - horaInicial;
		}*/
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.printf("Durou %d horas.", duracao);
		
		sc.close();
	}

}
