package Practice;

public class Practice07 {
	public static void main(String[] args) {
		System.out.println("Math.random�� �̿��ؼ� 1~6 ������ ������ ������ ���� value��" + "�����ϴ� �ڵ带 �ϼ��ض�");
		//Math.random() ==> 0~0.99 ==> 6�� ���ϸ� 0~5.9999999 
		int value = (int) (Math.random() * 6 + 1);
		System.out.println("value=" + value);
	}
}
