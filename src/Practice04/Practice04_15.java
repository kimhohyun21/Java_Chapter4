package Practice04;

public class Practice04_15 {
	public static void main(String[] args) {
		System.out.println("������ ȸ������ ���ϴ� ���α׷��̴�. \n"
				+ "ȸ����(palindrome)��, ���ڸ� �Ųٷ� �о ������ �д� �Ͱ� ���� ���� ���Ѵ�. \n" 
				+ "���� ��� ��12321���̳� ��13531������ ���� ���Ѵ�. \n"
				+ "(1)�� �˸��� �ڵ带 �־ ���α׷��� �ϼ��Ͻÿ�.[Hint] ������ �����ڸ� �̿��Ͻÿ�.");
		System.out.println();
		
		int number = 13321;
		int tmp = number;

		int result = 0;

		while (tmp != 0) {
			result = result * 10 + tmp % 10;
			System.out.println("���ٷ� ��"+result);
			tmp = tmp / 10;
		}

		if (number == result)
			System.out.println("������"+number + "�� ȸ�����̴�");
		else
			System.out.println("������"+number + "�� ȸ������ �ƴϴ�");
	}	
}
