//Exercicios:
//6) Receba um n�mero inteiro. Calcule e mostre o seu fatorial recursivamente.
//7) Realize recursivamente a soma de todos os n�meros de 1 a 100.
//8) Realize recursivamente a soma de todos os n�meros pares de 1 a 200
//9) Realize recursivamente a soma de todos os n�meros �mpares de 1 a 300

package EDexercicios;
import javax.swing.*;
import java.util.Random;
import EDexercicios.metodosrecursivos;

public class exercicios06a09 {

	public static void main(String[] args) {
		
	//----Chamada de m�todos recursivos
		  metodosrecursivos operacoes = new metodosrecursivos();
		  
		   int opc = 0;
		   while (opc != 10) {
			  opc = Integer.parseInt(JOptionPane.showInputDialog((" \n Ex - 6 \n EX - 7 \n Ex - 8 \n Ex - 9 \n Ecerrar - 10")));
		   switch (opc) {
		     case 6:
		    	 System.out.println("� igual a " + operacoes.fatorial(exercicio06())+"!");
		    	 break;
		 	 case 7:
		 		System.out.println("Soma de todos os n�meros: " + operacoes.somatotal(100));
		   		break;
		 	 case 8:
		 		System.out.println("Soma dos pares de 1 a 200: " + operacoes.somapares(200,0));
		   		break;
		 	 case 9:
		 		System.out.println("Soma dos �mpares de 1 a 300: " + operacoes.somaimpares(5,0));
		   		break;		
		    }
		  }
	    }
	 

     public static int exercicio06() {
	   Random aleatorios = new Random();
	   int num;
	   num = aleatorios.nextInt(15); //Valores aleat�rios at� 15
	   System.out.println("Fatorial de " + num + "!");
	   return num;
    }

}
