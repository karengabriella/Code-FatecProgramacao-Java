//Exercicio 10 - Receba um n�mero inteiro. 
//Calcule e mostre a s�rie de Fibonacci recursivamente at� o
//n�mero recebido

package EDexercicios;
import javax.swing.JOptionPane;

public class exercicio10 {

    public static void main(String[] args) {
    	
    	int termo;
        termo = Integer.parseInt(JOptionPane.showInputDialog(("Termo Fibonacci: ")));
        System.out.print("Sequ�ncia: ");
        fibonacci(termo,0,0,1);
    			
     }  
    
//M�todo Recursivo
    
     public static int fibonacci(int num, int aux, int var1, int var2){
  	  
 	   if(num == 0)
 		   return aux;  
 	   else
         
 	    aux = var1 + var2;
 	    var1 = var2;
 	    var2 = aux;
 	    System.out.print(" " + aux);
 	    
 	   return fibonacci(num-1, aux, var1, var2);  
    }			
	
  }
