package Practice;

public class Practice09 {
	public static void main(String[] args) {
		System.out.println("아래 문자열들의 합을 구하라");
		String str = "12345";

		System.out.println(str);
		int sum = 0;

		// System.out.println(sum=sum+str.charAt(0));
		// System.out.println(str.charAt(3));
		for (int i = 0; i < str.length(); i++) {
			//charAt(index) ==> 문자열의 index 번호에 맞는 문자를 추출 ==> char형
			char cha = str.charAt(i);
			String cha1 = String.valueOf(cha);
			int a = Integer.parseInt(cha1);
			sum = sum + a;

			//==> 대체 가능 sum+=str.charAt(i) -'0'
			//ACII코드 '1'은 49, '2'는 50 ==> 따라서 문자열 '0'은 48이기 때문에  char형 '1'- char형 '0' = 1
		}
		System.out.println("sum=" + sum);
	}
}
