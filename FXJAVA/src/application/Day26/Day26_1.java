package application.Day26;

import java.net.InetAddress;

public class Day26_1 {
	
	// ��Ʈ��ũ : �� �� �̻��� ��ǻ�͵��� �����ϰ� ����Ҽ� �ִ� ��
		// ��Ÿ� : ���ڽ�ȣ�� ���� ����ϴ� ��� ��Ⱑ ���� ����ϱ� ���� �ϳ��� ��
			// �������� : ��ǻ�ͳ��� / ��ǻ�ͻ��� ������ ��ȯ ����� �����ϴ� ��Ģ[ü��]
				// SMTP : ���� ���� ��������
				// IP : ���ͳ� ��������
	// TCP / IP 
		// TCP : Transmission Control Protocol : ��� ����
		// IP : Inertnet Protocol address : ��� �ν� ��ȣ[�ּ� - PC�ּ� - ���ּ�] : 0.0.0.0 ~ 255.255.255.255
			// ��ǻ�� <-----------> ��ǻ��
			// 					  ģ������ ���ּ�
			// ����ǻ�� <---------> ���̹���ǻ��[Ȩ������]
			//					  www.naver.com [������ �ּ�: �����̱⶧���� ��� �ܿ�� ����]
	public static void main(String[] args) {
		try {
			//1. ���� ip �ּ� Ȯ��
			// �������ư -> cmd �˻� -> ���������Ʈ
			// ipconfig �Է½� ��Ʈ��ũ(ip) ������ �˼��ִ�.
		//2. �ڹٿ��� ip �ּ� Ȯ��
			InetAddress address = InetAddress.getLocalHost();
				// InetAddress Ŭ����
					// InetAddress.getLocalHost();
						//�ڹ� �� ����� ��� �Ϲݿ��� �߻�
			System.out.println(" ���� pc�� ��Ʈ��ũ ��ü: " + address);
			System.out.println(" ���� pc�� �̸�: " + address.getHostName());
			System.out.println(" ���� pc�� ip�ּ�: " + address.getHostAddress());
		// 3. ���̹�ȸ�翡 ip �ּ� Ȯ��
			InetAddress address2 = InetAddress.getByName("www.naver.com");
			System.out.println(" ���̹� pc�� ��ü: " + address2);
			System.out.println(" ���̹� pc�� �̸�: " + address2.getHostName());
			System.out.println(" ���̹� pc�� ip�ּ�: " + address2.getHostAddress());
		// 4. ���̽���ȸ�翡 IP �ּ� Ȯ��
			InetAddress address3 = InetAddress.getByName("www.facebook.com");
			System.out.println(" ���̽��� pc�� ��ü: " + address3);
			System.out.println(" ���̽��� pc�� �̸�: " + address3.getHostName());
			System.out.println(" ���̽��� pc�� ip�ּ�: " + address3.getHostAddress());
		} catch (Exception e) {
			System.out.println("���� " + e);
		}	
	}
	
}
