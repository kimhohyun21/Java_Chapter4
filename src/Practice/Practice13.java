package Practice;

public class Practice13 {
	public static void main(String[] args) {
		/*
		 * ������ �־��� ���ڿ�(value)�� ���������� �Ǻ��ϴ� ���α׷��̴�. (1)�� �˸� �� �ڵ带 �־ ���α׷��� �ϼ��Ͻÿ�.
		 */		
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;

		// charAt(int i)

		for (int i = 0; i < value.length(); i++) {
			ch = value.charAt(i);
			System.out.println(ch);
			if (!('0' <= ch && ch <= '9')) {
				isNumber = false;
				break;
			}
		}

		if (isNumber) {
			System.out.println(value + "���� ");
		} else {
			System.out.println(value + "���� ");
		}

	}
}
