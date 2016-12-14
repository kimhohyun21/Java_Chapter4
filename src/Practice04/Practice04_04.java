package Practice04;

public class Practice04_04 {	
	public static void main(String[] args) {
		System.out.println("1+(-2)+3+(-4)...로 갔을때 총합이 100이상이 될때의 숫자를 구하시오");
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
		System.out.println("총합 : "+sum);
		System.out.println("100이 넘는 수 : "+i);
	}
}
