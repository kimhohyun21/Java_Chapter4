package Practice;

public class Practice02 {
	public static void main(String[] args) {
		//1~20 ���� ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ����	
		int[] num={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		int sum=0;
		
		for(int i=0; i<num.length; i++){
			if(num[i]%2!=0 && num[i]%3!=0){
				System.out.println(num[i]);
				sum+=num[i];
			}
		}
		
		System.out.println("1~20 ���� ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ���� : "+sum);
	}	
}
