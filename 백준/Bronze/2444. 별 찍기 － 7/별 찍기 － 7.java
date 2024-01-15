import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i =0; i<N-1; i++) {
			for(int k=N-1; k>i; k--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i*2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=N-1; i>=0; i--) {
			for(int k=N-1; k>i; k--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i*2; j++) {
				System.out.print("*");
			}
			System.out.println();				
		}
    }
}