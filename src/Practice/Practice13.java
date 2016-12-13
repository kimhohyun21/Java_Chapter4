package Practice;

public class Practice13 {
	public static void main(String[] args) {
		/*
		 * 다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다. (1)에 알맞 은 코드를 넣어서 프로그램을 완성하시오.
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
			System.out.println(value + "숫자 ");
		} else {
			System.out.println(value + "문자 ");
		}

	}
}
