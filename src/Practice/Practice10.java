package Practice;

public class Practice10 {
	public static void main(String[] args) {
		System.out.println("�� �ڸ� ���� ����϶� int ����");

		int num = 12345;
		System.out.println("num=" + num);
		int sum = 0;

		for (int i = 5; i > 0; i--) {
			//������ ���� Ȱ���� ���
			sum = sum + (num % 10);
			//���� Ȱ���Ͽ� ���
			num = num / 10;
		}
		System.out.println(sum);
	}
}
