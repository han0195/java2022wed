package Day10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class �Ե����� extends ����{
	//1.�ʵ�
	private String ����;
	ArrayList<��ǰ> ��ǰ����Ʈ = new ArrayList<��ǰ>();
	//2.������
	public �Ե�����() {
		
	};
	
	public �Ե�����(String ����, ArrayList<��ǰ> ��ǰ����Ʈ) {
		this.���� = ����;
		this.��ǰ����Ʈ = ��ǰ����Ʈ;
	}

	//3.�޼ҵ�
	@Override// ������
	public void ��ǰ���() {
		System.out.println("*** �Ե����� ��ǰ ��� ***");
		int i = 1;
		for(��ǰ temp : ��ǰ����Ʈ) {
			System.out.print(i + ". "+temp.get��ǰ��()+"("+temp.get����() + ")");
			i++;
		}
		System.out.println();
	}
	@Override
	public void ��ǰ�߰�()  {
		Scanner sca = new Scanner(System.in);
		System.out.println(" *** �Ե����� ��ǰ�߰� *** ");
		System.out.println(" ��ǰ��: "); String ��ǰ�� = sca.next();
		System.out.println(" ���: ");	int ��� = sca.nextInt();
		System.out.println(" ����: ");	int ���� = sca.nextInt();
		// 2. ��ü [ ���� ���� -> �ϳ� ��ü ]
		��ǰ ��ǰ = new ��ǰ(��ǰ��, ���, ����);
		// 3. ����Ʈ�� ����
		��ǰ����Ʈ.add(��ǰ);
		// 4. ����ó��
		try { // ����[����]�� �߻��Ұ� ���� �ڵ� ���� ( ���� ) 										// ���ϰ��    , �̾��[�ɼ�]
			FileOutputStream outputStream = new FileOutputStream("C:/Users/504/Desktop/�Ե��������.txt", true);
			String �������� = ��ǰ��+","+���+","+���� + "\n";// , : �ʵ� ����
			outputStream.write(��������.getBytes());// ���ڿ� -> ����Ʈ��
		}catch (Exception e){	// ����[����]	ó��[���] : Exception Ŭ����
			
		}
		System.out.println(" �˸�]] ��ǰ ���� �Ϸ� ~~~ ");
		
	}
	
	
}
