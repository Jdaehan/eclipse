package four;
import java.util.Scanner;
public class ContinueExample {
	public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  
	  System.out.println("������ 5�� �Է��ϼ���.");
	  int sum=0;
	  for(int i=0; i<5; i++) {
		  int n=scanner.nextInt(); // Ű���忡�� ���� �Է�
		  if(n<=0) continue; // 0�̳� ������ ��� ������ �ʰ� ���� �ݺ����� ����
		  else sum += n; //����� ��� ����
	  }
	  System.out.println("����� ���� " + sum);
	  
	  scanner.close();
	}

}