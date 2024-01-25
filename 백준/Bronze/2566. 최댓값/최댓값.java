import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[9][9];
		int max = 0;
		int maxIdxX = 0;
		int maxIdxY = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
				if(i==0 && j==0) max= arr[i][j];
				if(max<arr[i][j]) {
					max= arr[i][j];
					maxIdxX=i;
					maxIdxY=j;
				}
			}
			sc.nextLine();
		}
		System.out.print(max+"\n"+(maxIdxX+1)+" "+(maxIdxY+1));
	}
}