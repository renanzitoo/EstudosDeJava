import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome e sobrenome :");
		String nomecompleto = sc.nextLine();
		int index = nomecompleto.indexOf(" ");
		int ult = nomecompleto.length();
		System.out.println("Nome = " + nomecompleto.substring(0, index) );
		System.out.println("Sobrenome = " + nomecompleto.substring(index+1, ult));
		
	}

}
