import java.util.Scanner;
public class Caracteristica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n2, n3, n4, n1c;
		String n1;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Digite um numero de 4 digitos");
		n1= sc.nextLine();
		n3 = Integer.parseInt(String.valueOf(n1.charAt(0)));
		n3 = n3*10 + Integer.parseInt(String.valueOf(n1.charAt(1)));
		
		n2 = Integer.parseInt(String.valueOf(n1.charAt(2)));
		n2 = n2*10 + Integer.parseInt(String.valueOf(n1.charAt(3)));
		
		n1c = n3*100 + n2;
		
		
		System.out.println(n3);
		System.out.println(n2);
		System.out.println(n1c);
		
		n4 = n2 + n3;
		
		if(n4*n4==n1c) { 
			System.out.println("O numero tem a caracteristica");
		}else {
			System.out.println("O numero não contem a caracteristica");
		}
		}while(n1c>1000 || n1c<9999);
		
		
		

	}

}
