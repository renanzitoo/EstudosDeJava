import java.util.Scanner;
public class SearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int vNumeral[] = new int[4];
		int i;
		int search, answer=0;
		
		for(i=0; i<vNumeral.length; i++) {
			System.out.println("Write a number");
			vNumeral[i] = sc.nextInt();
		}
		
		System.out.println("Write the number that you want");
		search = sc.nextInt();
		
		for(i=0;i<vNumeral.length;i++) {
			if(search == vNumeral[i]) {
				break;
			}
			answer++;
		}
		if(answer>=vNumeral.length) {
			System.out.println("The number that you write is invalid");
		}else {
			System.out.println("The number that you want is in the position : " + answer);
		}
		

	}

}
