import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int[] arr= new int[26];
		str = str.toUpperCase();
		
		for(int i =0; i<str.length(); i++) {
			arr[str.charAt(i)-65] +=1;
		}
		int max = 0;
		int maxIdx = 0;
		for(int i =0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
				maxIdx = i;
			}
		}
		str = (char)(maxIdx+65)+"";
		for(int i =0; i<arr.length; i++) {
			if(i!=maxIdx && max==arr[i]) str = "?";
		}
		System.out.println(str);
    }
}