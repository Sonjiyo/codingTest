import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int a = sc.nextInt();
       int b = sc.nextInt();
       
       sc.nextLine();
       
       int c= sc.nextInt();
       
       b+=c;
       while(b>=60) {
    	   b-=60;
    	   a+=1;
    	   
    	   if(a==24) a = 0;    	          
       }
       
       System.out.printf("%d %d",a,b);
    }
}