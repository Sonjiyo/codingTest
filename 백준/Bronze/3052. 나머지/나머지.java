import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] check = new boolean[42];
		
		int cnt = 0;
		for(int i =0; i<10; i++) {
			int num = sc.nextInt();
			if(!check[num%42]) {
				check[num%42] = true;
			} else {
				cnt++;
			}
		}
		System.out.println(10-cnt);
    }
}