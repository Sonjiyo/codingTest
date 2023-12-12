import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		
		int[] arr = new int[N];
		for(int i =0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int n =0; n<M; n++) {
			int i = sc.nextInt()-1;
			int j = sc.nextInt()-1;
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		for(int i =0; i<N; i++) {
			System.out.print(arr[i] + " ");
		}
    }
}