//02 - Carregar um vetor [5] inteiro. 
//Enviar cada elemento para uma fun��o e esta ir� retornar o seu fatorial 
//que ser� armazenado em um outro vetor. Exibir os dados dos vetores.

package EDexercicios;
import java.util.Random;

  public class exercicio02 {
	public static void main(String[] args) {
		
	 Random aleatorios = new Random();
	 metodosrecursivos operacoes = new metodosrecursivos(); //classe de m�todos resolutivos
	 
	
    	int valores[] = new int [5];
    	int fatoriais[] = new int[5];
        int i;
	    for(i = 0; i<valores.length; i++){
		 valores[i] = aleatorios.nextInt(15); //Valores aleat�rios at� 15
        }
	   for(i = 0; i<valores.length; i++){
	     fatoriais[i] = operacoes.fatorial(valores[i]);
	   }	
	
	   for(i = 0; i<valores.length; i++){
	     System.out.println("N�mero:  " + valores[i]);
	     System.out.println("Fatorial:  " + fatoriais[i] + "!");	
	   }
  }
}
