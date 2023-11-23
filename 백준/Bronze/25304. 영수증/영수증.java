import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int X = sc.nextInt();
       sc.nextLine();
       int N = sc.nextInt();
       sc.nextLine();
       
       int sum = 0;
       for(int i=0; i<N; i++) {
    	   int a = sc.nextInt();
    	   int b = sc.nextInt();
    	   sc.nextLine();
    	   
    	   sum += a*b;
       }
       System.out.println(sum==X ? "Yes" : "No");
    }
}