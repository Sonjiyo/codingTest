import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       sc.nextLine();
       
       int[] arr = new int[n];
       
       for(int i =0; i<n; i++) {
    	   arr[i] = sc.nextInt();
       }
       sc.nextLine();
       
       int v = sc.nextInt();
       int cnt = 0;
       for(int a : arr) {
    	   if(a==v) cnt++;
       }
       System.out.println(cnt);
    }
}