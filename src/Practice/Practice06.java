package Practice;

public class Practice06 {
	public static void main(String[] args) {
		//�� ���� �ֻ����� ������ ��, ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷�
		int x[]={1, 2, 3, 4, 5, 6};
		int y[]={1, 2, 3, 4, 5, 6};
		int sum=6;
		
		for(int i=0;i<x.length;i++){
			for(int j=0;j<y.length;j++){
				if(sum==x[i]+y[j]){
					System.out.println("("+x[i]+", "+y[j]+")");
				}
			}
		}
	}
}
