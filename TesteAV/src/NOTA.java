import java.util.Scanner;
public class NOTA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		double[] nota = new double[5];
		int[] matricula = new int[5];
		int i;
		for(i=1;i<=5;i++) {
			System.out.println("Digite a nota do aluno");
			nota[i]= sc.nextDouble();
			System.out.println("Digite o numero de matricula do aluno");
			matricula[i] = sc.nextInt();
			if (nota[i]>=0 && nota[i]<=4.9) {
				System.out.println("A nota do aluno " + matricula[i] +" foi D" );
			}
			if (nota[i]>=5 && nota[i]<=6.9) {
				System.out.println("A nota do aluno " + matricula[i] +" foi C" );
			}if (nota[i]>=7 && nota[i]<=8.9) {
				System.out.println("A nota do aluno " + matricula[i] +" foi B" );
			}if (nota[i]>=9 && nota[i]<=10) {
				System.out.println("A nota do aluno " + matricula[i] +" foi A" );
			}else {
				System.out.println("A nota digitada foi invalida");
			}
		}

	}

}
