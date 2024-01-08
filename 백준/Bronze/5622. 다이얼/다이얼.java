import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String[] arr = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
		
		int cnt = 0;
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<str.length(); j++) {
				if(arr[i].contains(str.charAt(j)+"")) {
					cnt += i+3;
				}
			}
		}
		System.out.println(cnt);
    }
}