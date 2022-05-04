import java.util.Scanner;
public class parte1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String Nome;
		double salario, salariof, vendas, vendasA;
		
		System.out.println("Olá digite seu nome");
		Nome = sc.nextLine();
		
		System.out.println("Digite seu salario fixo");
		salario = sc.nextDouble();
		
		System.out.println("Digite o valor de suas vendas");
		vendas = sc.nextDouble();
		
		vendasA = vendas * 0.15;
		
		salariof = vendasA + salario;
		
		System.out.println(Nome + " seu salario é " + salariof);

	}

}
