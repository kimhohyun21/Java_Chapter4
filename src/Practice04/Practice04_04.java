package Practice04;

public class Practice04_04 {	
	public static void main(String[] args) {
		System.out.println("1+(-2)+3+(-4)...�� ������ ������ 100�̻��� �ɶ��� ���ڸ� ���Ͻÿ�");
		int sum = 0;
		int i;
		for (i = 1; true; i++) {
			if (i % 2 == 1)
				sum = sum + i;
			if (i % 2 == 0)
				sum = sum + (i * -1);
			if (sum >= 100)
				break;
		}
		System.out.println("���� : "+sum);
		System.out.println("100�� �Ѵ� �� : "+i);
	}
}
