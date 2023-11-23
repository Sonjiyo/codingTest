import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        
        if(A<2 || A>10000 || B<2 || B>10000 || C<2 || C>10000) {
        	System.out.println("입력 오류");
        } else {
        	System.out.println((A+B)%C);
        	System.out.println(((A%C)+(B%C))%C);
        	System.out.println((A*B)%C);
        	System.out.println(((A%C)*(B%C))%C);
        }
    }
}