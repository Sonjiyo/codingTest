import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int cnt = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==str.charAt(str.length()-1-i)) {
				cnt++;
			}
		}
		System.out.println(cnt==str.length() ? 1 : 0);
    }
}