//Exercicio 11 - Receba um n�mero. Calcule e mostre a s�rie 
//1 + 1/2 + 1/3 + ... + 1/N recursivamente. 

package EDexercicios;
import javax.swing.JOptionPane;

public class exercicio11 {

	public static void main(String[] args) {
	    int num;
    	num = Integer.parseInt(JOptionPane.showInputDialog("Termo final da S�rie: "));
		System.out.print("S�rie: \n 1 ");
		for (int i = 0; i < num; i++) {
		  System.out.print(" + 1/" + (i+1));
		}		
		  System.out.println("\n Soma: " + serie(num));
	  	}

//---M�todo Recursivo Calculo da S�rie 
	
	public static double serie(int num) {
	   if (num == 1)
		 return 1.0;
	  else
        	return 1.0 / num + serie(num - 1);
			}
    }
		
	

