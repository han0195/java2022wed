package �������̽�����;

import java.util.Scanner;

public class ���ӱ� {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		while (true) {// ���α׷�����
			System.out.println("�ؽ�Ʈ��������");
			���̽�ƽ ���̽�ƽ = new �ؽ�Ʈ����();
			System.out.println("1.ĳ���ͻ��� 2.�غ���");
			int ch = s.nextInt();

			if (ch == 1) {
				System.out.println("name: ");
				String name = s.next();
				ĳ���� my = new ĳ����(name, 10, 50);
				while (true) {
					int �¸��� = 0;
					System.out.println("----- ���糪�� ĳ���� ------");
					System.out.println("���ݷ�: " + my.get���ݷ�() + "\t" + "����: " + my.get����());
					System.out.println("���ǽ¸���: " + �¸���); // ?? �¸����� �ȿ���
					System.out.println("1.����� ã�� 2.����");
					int ch2 = s.nextInt();
					if (ch2 == 1) {	
							ĳ���� com = ĳ����.��Ī();	
							System.out.println("--- ��Ī ---");
							while (true) {
							System.out.println("��뽺��");
							System.out.println("���ݷ�: " + com.get���ݷ�() + "\t" + "����: " + com.get����());
							System.out.println("���̽�ƽ : 1.���� 2.��Ű���� 3.����");
							int ch3 = s.nextInt();
							if (ch3 == 1) {
								int a = ���̽�ƽ.A��ư(my, com);
								System.out.println(a);
								if (a == 1) {
									System.out.println("�¸�");
									�¸���++; // �¸����ȿø�
									break;
								} else if (a == 2) {
									System.out.println("���");
									System.out.println("1.ĳ���ͻ��� 2.�غ���");
									int ch4 = s.nextInt();

									if (ch4 == 1) {
										System.out.println("name: ");
										String name3 = s.next();
										my = new ĳ����(name, 10, 30);
										break;
									}
								}
							} else if (ch3 == 2) {
								int a = ���̽�ƽ.B��ư(my, com);
								System.out.println(a);
								if (a == 1) {
									System.out.println("�¸�");
									�¸���++;
									break;
								} else if (a == 2) {
									System.out.println("���");
									System.out.println("1.ĳ���ͻ��� 2.�غ���");
									int ch4 = s.nextInt();

									if (ch == 1) {
										System.out.println("name: ");
										String name3 = s.next();
										my = new ĳ����(name, 10, 30);
										break;
									}
								}
							} else if (ch3 == 3) {
								���̽�ƽ.C��ư(my, com);
								break;
							} else {
								System.out.println("�˼����� ����");
							}
						}
					} else if (ch2 == 2) {
						System.out.println("�غ���");
					} else {
						System.out.println("�˼����� ����");
					}

				}
			} else if (ch == 2) {
				System.out.println("���ľ�����Ʈ����");
			} else {
				System.out.println("�˼����� ����");
			}

		}

	}
}
