import java.util.Scanner;
public class IDADE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int idade=0, jovem, velho=0, abaixo=0, isuperior=0, contador=0, soma=0;
		double media;
		System.out.println("Digite a idade");
		idade = sc.nextInt();
		jovem = idade;
		do {
			
			contador++;
			if(idade==0) {
				break;
			}
			if(idade<jovem) {
				jovem = idade;
			}if(idade>velho) {
				velho=idade;
			}if(idade<30) {
				abaixo++;
			}if(idade>=30) {
				isuperior++;
			} soma = soma +idade;
			System.out.println("Digite a idade");
			idade = sc.nextInt();
		}while(idade!=0); 
		media = soma/contador;
		System.out.println("O mais jovem tem: " +jovem);
		System.out.println("O mais velho tem " + velho);
		System.out.println("A quantidade de pessoas abaixo de 30 = " +abaixo);
		System.out.println("Quantidade igual ou superior de 30 = "+ isuperior);
		System.out.println("A média é: "+ media);
		
	}
}


