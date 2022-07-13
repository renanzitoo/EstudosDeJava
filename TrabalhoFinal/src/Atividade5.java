import java.util.Scanner;	
public class Atividade5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double kwpreco, salMin, kwprecDesc, kwprecoUn;
		int kwUsado;
			System.out.println("Digite a quantidade de KW usados");
			kwUsado = sc.nextInt();
			System.out.println("Digite o salario minimo");
			salMin = sc.nextDouble();
			kwpreco = (kwUsado/100) * (salMin/7);
			System.out.println("O preço a ser pago"+kwpreco);
			kwprecoUn = kwpreco/kwUsado;
			System.out.println("O valor da unidade do KW"+kwprecoUn);
			kwprecDesc = kwpreco - (kwpreco*0.1);
			System.out.println("O valor com desconto"+kwprecDesc);
			
		
	}
}
