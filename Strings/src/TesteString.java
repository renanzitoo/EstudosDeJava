import java.util.Scanner;

public class TesteString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite algo: ");
		String palavra = sc.nextLine();
		
		// .length() usado para contar caracteres
		
		System.out.println("Tamanho: " + palavra.length());
		
		//Selecao de caracter
		
		System.out.println("Primeiro caractere: " + palavra.charAt(0));
		
		//Equal
		
		System.out.println("Digite algo novamente: ");
		String palavra0 = sc.nextLine();
		
		System.out.println("Iguais :" + palavra.equals(palavra0));
		
		System.out.println("Iguais ignoreCase: " + palavra.equalsIgnoreCase(palavra0));
		
		System.out.println("Esta vazio? " + palavra0.isEmpty());
		
		String str= new String("quick brown fox jumps over the lazy dog");
	       System.out.println("Substring starting from index 15:");
	       System.out.println(str.substring(15));
	       System.out.println(str.substring(0,15));
	       System.out.println(str.substring(12,15));
	       System.out.println(str.substring(22,27));
	       
	       System.out.println("Posição: " +str.indexOf("fox"));
	       System.out.println("Posição: " +str.indexOf("jumps"));
	       
	       System.out.println("O trocado por x :" + str.replace('o', 'x'));
	  
	       
	       
		
		

	}

}
