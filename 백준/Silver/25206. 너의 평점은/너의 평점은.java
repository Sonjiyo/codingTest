import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		double hakSum = 0;
		for(int i =0; i<20; i++) {
			String[] arr = sc.nextLine().split(" ");
			if(arr[2].equals("P")) continue;
			if(arr[2].equals("A+")) sum+=Double.parseDouble(arr[1])*4.5;
			if(arr[2].equals("A0")) sum+=Double.parseDouble(arr[1])*4; 
			if(arr[2].equals("B+")) sum+=Double.parseDouble(arr[1])*3.5; 
			if(arr[2].equals("B0")) sum+=Double.parseDouble(arr[1])*3; 
			if(arr[2].equals("C+")) sum+=Double.parseDouble(arr[1])*2.5; 
			if(arr[2].equals("C0")) sum+=Double.parseDouble(arr[1])*2; 
			if(arr[2].equals("D+")) sum+=Double.parseDouble(arr[1])*1.5; 
			if(arr[2].equals("D0")) sum+=Double.parseDouble(arr[1])*1; 
			if(arr[2].equals("F")) sum+=Double.parseDouble(arr[1])*0;
			hakSum+=Double.parseDouble(arr[1]);
		}
		System.out.printf("%.6f",sum/hakSum);
    }
}