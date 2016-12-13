package Practice;

public class Practice10 {
	public static void main(String[] args) {
		System.out.println("각 자리 합을 출력하라 int 버전");

		int num = 12345;
		System.out.println("num=" + num);
		int sum = 0;

		for (int i = 5; i > 0; i--) {
			//나머지 값을 활용하 계산
			sum = sum + (num % 10);
			//몫을 활용하여 계산
			num = num / 10;
		}
		System.out.println(sum);
	}
}
