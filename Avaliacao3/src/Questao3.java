import java.util.Scanner;
public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i1;
		int counter=0;
		System.out.println("Digite o valor a ser divido");
		i1 = sc.nextInt();
		do {
			i1=i1/10;
			counter++;
		}while(i1>0);
		System.out.println("O numero contem " + counter + "Algarismos");
	}

}
