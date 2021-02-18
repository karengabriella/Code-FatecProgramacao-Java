//-----Exerc�cio 01 - Carregar um vetor [100] real de valores de saldos. 
// - Calcular e exibir:
// - M�dia dos saldos positivos entre 100 � 1000
// - M�dia geral dos saldos
// - Soma dos saldos negativos

package EDexercicios;
import java.util.Random;
import javax.swing.JOptionPane;

 public class exercicio01 {
	public static void main(String[] args) {
	    
    	Random aleatorios = new Random();
		int valores[] = new int [100];  	
        int i;
		for(i = 0; i<20; i++){
			valores[i] = aleatorios.nextInt(2500)-1500; //Valores aleat�rios de -1500 a 2500
	      }
		
//---Op��es - chamada de fun��es resolutivas.
		   int opc = 0;
		   while (opc != 4) {
			  opc = Integer.parseInt(JOptionPane.showInputDialog((" \n 1 - Media de Saldos Positivos \n 2 - Media Geral dos Saldos \n 3 - Media de Saldos Negativos \n 4 - Encerrar")));
		   switch (opc) {
		   	case 1:
		      Media(valores);
		      break;
		   	case 2:
		   	    MediaGeral(valores);
		   	    break;
		   	case 3:
		   		MediaNegativos(valores);
		   	case 4:
		   		break;
			 }
		   }
	  }

 //--- M�dia dos Positivos de 100 a 1000
			
       public static void Media(int valorestotais[]){	
		 	int i, aux = 0;
			double media = 0;
			for (i = 0; i< valorestotais.length; i++) {    
			   if(valorestotais[i] >= 10 && valorestotais[i] <= 100){
			        media += valorestotais[i];
			         aux ++;	   
			    }
					
			  }
				 media = media/aux;
			     System.out.println("M�dia dos Saldos positivos de 100 at� 1000:  " + media);
			  }
			
 //----Media Geral dos Saldos
			
	    public static void MediaGeral(int valorestotais[]){
			 int i;
			 double media = 0;
			 for (i = 0; i< valorestotais.length; i++) {   
			       media += valorestotais[i];   
			  }		
			  	media = media/valorestotais.length;
			    System.out.println("M�dia Geral dos Saldos:  " + media);
			  }
			
 //----Media dos Saldos Negativos
		 	
		 public static void MediaNegativos(int valorestotais[]){
			  int i, aux = 0;
		 	  double media = 0;
		 	   for (i = 0; i< valorestotais.length; i++) {    
		 		 if(valorestotais[i] < 0){
		 	         media += valorestotais[i];
		 	          aux ++;	   
		 		  }
		 			
		 		}
		 			media = media/aux;
		 	        System.out.println("M�dia dos Saldos negativos:  " + media);
		 	  }
      	
 }
