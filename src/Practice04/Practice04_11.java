package Practice04;

public class Practice04_11 {
	public static void main(String[] args) {
		/*
		 * �Ǻ���ġ(Fibonnaci) ����(���)�� ���� �� ���� ���ؼ� ���� ���� ����� ���� �� �����̴�. ���� ��� ���� ��
		 * ���� 1�� 1�̶�� �� ���� ���� 2�� �ǰ� �� ���� ���� 1�� 2�� ���ؼ� 3�� �Ǿ
		 * 1,1,2,3,5,8,13,21,... �� ���� ������ ����ȴ�. 1�� 1���� �����ϴ� �Ǻ���ġ������ 10��° ���� ��������
		 * ����ϴ� ���α׷��� �ϼ��Ͻÿ�.
		 */
		int x = 1;
		int y = 1;
		int sum[]=new int[10];

		for (int i = 0; i < 10; i++) {
			if (i == 0){
				sum[i] = x;
			}else if (i == 1){
				sum[i] = y;
			}else if (i == 2){
				sum[i] = x + y;	
			}else{
				sum[i] = sum[i-2] + sum[i-1];
			}
			System.out.print(sum[i]+",");
		}
		System.out.println("�Ǻ���ġ ������ 10��° ���� "+sum[9]+"�Դϴ�.");
	}
}
