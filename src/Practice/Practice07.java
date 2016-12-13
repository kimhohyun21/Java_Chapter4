package Practice;

public class Practice07 {
	public static void main(String[] args) {
		System.out.println("Math.random을 이용해서 1~6 사이의 임의의 정수를 변수 value에" + "저장하는 코드를 완성해라");
		//Math.random() ==> 0~0.99 ==> 6을 곱하면 0~5.9999999 
		int value = (int) (Math.random() * 6 + 1);
		System.out.println("value=" + value);
	}
}
