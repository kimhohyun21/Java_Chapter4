package Practice;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
	      System.out.println("���ڸ� �Է��ϼ���");
	      int sum = 0;
	      String tmp;
	      int score;
	      Scanner scan = new Scanner(System.in);
	      tmp=scan.nextLine();
	      score=Integer.parseInt(tmp);
	      for(int i =1; i<=score; i++){
	         for(int j = 1; j<=i; j++){
	            sum=sum+j;
	         }
	      }
	      System.out.println(sum);
	   }
}
