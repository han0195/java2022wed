package application.Day26;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Day26_client {
	public static void main(String[] args) {
		// 1. ���� �����
		Socket socket = new Socket();
		try {
			// 2. ������������ �����ϱ�
			while(true) { // 2. ������������ �����ϱ� []
				socket.connect( new InetSocketAddress("127.168.102.50",5000));
				System.out.println("[[������ ���� ���� ]]");
				
				Scanner scanner = new Scanner(System.in);
				//3. �������� ������ �۽��ϱ�[������] : ��Ʈ�� �̿��� �ܺ� ��Ʈ��ũ ���
					// 1. ������ �Է¹ޱ�
				System.out.println("�������� ���� �޼���: "); String msg = scanner.next();
					// 2. ������ ��� ��Ʈ��(��Ŵ���:����Ʈ) ��������
				OutputStream outputStream = socket.getOutputStream();
					// 3. �������� [ ���ڿ� -> ����Ʈ�� ]
				outputStream.write(msg.getBytes());
				
				// 4. �������� ������ ����[�ޱ�] �ޱ�
					// 1. ������ �Է� ��Ʈ��
				InputStream inputStream = socket.getInputStream();
				byte[] bytes = new byte[1000];
				inputStream.read(bytes);
				System.out.println("������ ���� �޼���: " + new String(bytes));
 			}
		} catch (Exception e) {
			
		}
	
	}
}
