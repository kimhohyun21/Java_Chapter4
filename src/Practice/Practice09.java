package Practice;

public class Practice09 {
	public static void main(String[] args) {
		System.out.println("�Ʒ� ���ڿ����� ���� ���϶�");
		String str = "12345";

		System.out.println(str);
		int sum = 0;

		// System.out.println(sum=sum+str.charAt(0));
		// System.out.println(str.charAt(3));
		for (int i = 0; i < str.length(); i++) {
			//charAt(index) ==> ���ڿ��� index ��ȣ�� �´� ���ڸ� ���� ==> char��
			char cha = str.charAt(i);
			String cha1 = String.valueOf(cha);
			int a = Integer.parseInt(cha1);
			sum = sum + a;

			//==> ��ü ���� sum+=str.charAt(i) -'0'
			//ACII�ڵ� '1'�� 49, '2'�� 50 ==> ���� ���ڿ� '0'�� 48�̱� ������  char�� '1'- char�� '0' = 1
		}
		System.out.println("sum=" + sum);
	}
}
