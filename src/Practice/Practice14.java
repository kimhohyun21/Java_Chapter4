package Practice;

public class Practice14 {
	public static void main(String[] args) {
		/*
		 * ������ ���ڸ��߱� ������ �ۼ��� ���̴�. 1�� 100������ ���� �ݺ������� �Է� �ؼ� ��ǻ�Ͱ� ������ ���� ���߸� ������
		 * ������. ����ڰ� ���� �Է��ϸ�, ��ǻ�ʹ� �� ���� ������ ���� ���ؼ� ����� �˷��ش�. ����ڰ� ��ǻ�Ͱ� ������ ���ڸ�
		 * ���߸� ������ ������ �� �� ���� ���ڸ� ������� �˷��ش�. (1)~(2)�� �˸��� �ڵ带 �־� �� �α׷��� �ϼ��Ͻÿ�.		  
		 */
		
		// 1~100������ ������ ���� �� answer�� �����Ѵ�.
		int answer = (int)(Math.random()*100)+1;
		int input = 0; // ������Է��� ������ ����
		int count = 0; // �õ�Ƚ���� �������� ����
		// ȭ������ ���� ������Է��� �ޱ� ���ؼ� ScannerŬ���� ���
		java.util.Scanner s = new java.util.Scanner(System.in);
		do {
			count++;
			System.out.print("1�� 100������ ���� �Է��ϼ��� :");
			input = s.nextInt(); // �Է¹��� ���� ���� input�� �����Ѵ�.			
			if(input==answer){
				System.out.println("�����Դϴ�. "+count+"ȸ ���� ����!");
				break;
			}else if(input<answer){
				System.out.println("���� ū �� �Դϴ�.");
				continue;
			}else if(input>answer){
				System.out.println("���� ���� �� �Դϴ�.");
				continue;
			}
		} while(true); // ���ѹݺ���
		
	}
}
