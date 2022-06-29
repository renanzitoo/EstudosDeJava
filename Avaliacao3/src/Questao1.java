import java.util.Scanner;
public class Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		Scanner sc = new Scanner(System.in);
		int seletor;
		double pesoTerra, pesoCalculado;
		
		System.out.println("Qual o peso na terra?");
		pesoTerra = sc.nextDouble();
		System.out.println("Com qual gravidade voce gostaria de calcular? 1 para mercurio, 2 para venus, 3 para marte, 4 para jupiter, 5 para saturno e, 6 para urano");
		seletor = sc.nextInt();
		
		if(seletor == 1) {
			pesoCalculado = pesoTerra/10 * 0.37;
			System.out.println("O peso em Mercurio será " +  pesoCalculado);
		}if(seletor == 2) {
			pesoCalculado = pesoTerra/10 * 0.88;
			System.out.println("O peso em Vênus será " +  pesoCalculado);
		}if(seletor == 3) {
			pesoCalculado = pesoTerra/10 * 0.38;
			System.out.println("O peso em Marte será " +  pesoCalculado);
		}if(seletor == 4) {
			pesoCalculado = pesoTerra/10 * 2.64;
			System.out.println("O peso em Júpiter será " +  pesoCalculado);
		}if(seletor == 5) {
			pesoCalculado = pesoTerra/10 * 1.15;
			System.out.println("O peso em Saturno será " +  pesoCalculado);
		}if(seletor == 6) {
			pesoCalculado = pesoTerra/10 * 1.17;
			System.out.println("O peso em Urano será " +  pesoCalculado);
		}
		

	}

}
