import java.util.Scanner;
public class LetrasMaiusculas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String frase;
		int i=0, cont=0;
		char c;
		System.out.println("Digite a frase");
		frase = sc.nextLine();
		frase = frase.toUpperCase();
		for(i=0;i<frase.length();i++) {
			 c = frase.charAt(i);
			 if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				 cont++;
			 }
		}
		System.out.println("O numero de vogais " + cont);
	}

}
