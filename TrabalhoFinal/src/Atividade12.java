import java.util.Scanner;
public class Atividade12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		double rendimento, rendimentoPOP=0, mediaFilhos=0, percentualFamilias, dolarValor, rendimentoDolar; 
		int contDolar=0,contMedia=0,contMediaPorDolar, filhos;
		do {
			rendimento = sc.nextDouble();
			rendimentoPOP = rendimentoPOP + rendimento;
			
			filhos = sc.nextInt();
			mediaFilhos = mediaFilhos + filhos;
			
			dolarValor= sc.nextDouble();
			rendimentoDolar = rendimento / dolarValor;
			if(rendimentoDolar>=100) {
			contDolar++;
			}
			
			contMedia++;
			
		}while(rendimento<=0);
		
		mediaFilhos = mediaFilhos / contMedia;
		rendimentoPOP = rendimentoPOP / contMedia;
		
		contDolar = contMedia - contDolar;
		
		System.out.println("A media de filhos � " +mediaFilhos);
		System.out.println("A media de rendimento da popula��o � " + rendimentoPOP);
		System.out.println("A rela��o de pessoas com rendimento maior que 100 Dolares � de " +contDolar + "para" + contMedia );
		
	}

}
