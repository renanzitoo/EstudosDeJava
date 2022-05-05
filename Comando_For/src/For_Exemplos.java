import java.util.Scanner;
public class For_Exemplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Comando for dividos em parte for(part1;part2;part3);
		//part1 = valor inicial sempre int do comando for normalmente = i=0
		//part2 = valor de "check-in" vai ser oque determina se o comando ira rodar = i<5
		//part3 = valor de incremento adiciona mais 1 = i++
		Scanner sc = new Scanner(System.in);
		
		int i=0, i2=0, n=0;
		
		System.out.println("Digite o valor de N");
		n=sc.nextInt();
		
		for(i=0;i<=n;i++) {
			for(i2=1;i2<=i;i2++) {
			
			System.out.print("X");
			}
			System.out.println(" ");
		}
	}

}
