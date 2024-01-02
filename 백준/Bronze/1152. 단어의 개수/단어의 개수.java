import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
        if(str.isBlank()){
            System.out.println("0");
        }else{
           String[] arr = str.trim().split(" ");
            System.out.println(arr.length); 
        }
        
		
    }
}