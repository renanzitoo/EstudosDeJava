import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) {
		// classe de Scanner deve sempre ser declarada com um nome para variavel ex :
		// Scanner scan = new Scanner(System.in)
				
		// scanner de string : String name = scan.nextLine
		// scanner de char : char gender = scan.next().charAt(0);
		// scanner de int : int age = sc.nextInt();
		// scanner de double :  double salario = sc.nextDouble();
		
				
		// charAt(0) vai pegar uma string e pegar o primeiro caractere de uma string.
		
		System.out.println("Digite seu nome: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		
		System.out.println("Nome = "+name);
		
		System.out.println("Digite um caractere");
		char ch = sc.next().charAt(0);
		System.out.println("Caractere = " +ch);
		
		
		System.out.println("Digite sua idade");
		int idade = sc.nextInt();
		System.out.println("Idade = " +idade);
		
		System.out.println("Digite seu salário : ");
		double salario = sc.nextDouble();
		System.out.println("Salario = " +salario);
		
	}

}
