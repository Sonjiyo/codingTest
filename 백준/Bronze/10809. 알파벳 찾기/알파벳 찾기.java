import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26];
		String S = sc.next();
		for(int i =0; i<arr.length;i++) {
			arr[i] = -1;
		}
		
		for(int i=0; i<S.length(); i++) {
			for(int j = 97; j<123; j++) {
				if(S.charAt(i)==(char)j && arr[j-97]==-1) {
					arr[j-97] = i;
				}
			}
		}
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
    }
}