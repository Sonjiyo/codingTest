import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int maxIdx = 0;
		for(int i =0; i<9; i++) {
			int num = sc.nextInt();
			sc.nextLine();
			if(i==0) max = num;
			
			if(max<num) {
				max = num;
				maxIdx = i;
			}
		}
		System.out.println(max+"\n"+(maxIdx+1));
    }
}