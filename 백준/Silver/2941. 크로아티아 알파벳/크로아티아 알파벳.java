import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for(int i =0; i<arr.length; i++) {
			str = str.replace(arr[i], " ");			
		}
		System.out.println(str.length());
    }
}