import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		
		int[] arr = new int[N];
		
		int max = 0;
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
			if(max<arr[i]) max = arr[i];
		}
		double sum = 0;
		for(int i =0; i<N; i++) {
			sum += arr[i]*1.0/max*100;
		}
		
		System.out.println(sum/N);
    }
}