import java.util.Scanner;
public class ExercQuadro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int idades=0 , i=0, soma =0;
		double media;
		
		do {
			System.out.println("Digite a idade");
			idades=sc.nextInt();
			soma= soma + idades;
			i++;
			
		}while(idades!=-1);
		media=soma/i;
		System.out.println("A soma é" +soma+ "a media é" + media);

	}

}
