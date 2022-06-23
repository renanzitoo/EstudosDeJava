import java.util.Scanner;
public class ExercDesafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int maior = 0, i;
		int vNumeral[] = new int[4];
		
		for(i=0; i<vNumeral.length; i++) {
			System.out.println("Digite a nota");
			vNumeral[i] = sc.nextInt();
		}
		maior = vNumeral[0];
				
		for(i=1; i<vNumeral.length; i++) {
			if(maior<vNumeral[i]) {
				maior=vNumeral[i];
			}
		}
		
		System.out.println("O maior valor foi "+ maior);
		
		

	}

}
