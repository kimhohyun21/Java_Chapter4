package Practice04;

public class Practice04_15 {
	public static void main(String[] args) {
		System.out.println("다음은 회문수를 구하는 프로그램이다. \n"
				+ "회문수(palindrome)란, 숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수를 말한다. \n" 
				+ "예를 들면 ‘12321’이나 ‘13531’같은 수를 말한다. \n"
				+ "(1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.[Hint] 나머지 연산자를 이용하시오.");
		System.out.println();
		
		int number = 13321;
		int tmp = number;

		int result = 0;

		while (tmp != 0) {
			result = result * 10 + tmp % 10;
			System.out.println("꺼꾸로 값"+result);
			tmp = tmp / 10;
		}

		if (number == result)
			System.out.println("원래수"+number + "는 회문수이다");
		else
			System.out.println("원래수"+number + "는 회문수가 아니다");
	}	
}
