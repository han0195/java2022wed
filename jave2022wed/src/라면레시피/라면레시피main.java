package ��鷹����;

import java.util.Scanner;

public class ��鷹����main {
	/*	����Ƚ�� : 4
	 *
	 *  ��� Ŭ���� �����
	 * 1. �ʱ�޴� (1.��鷹���ǵ�� 2.�����)
	 * 2. ����� ��� �ٶ����
	 * 		(1.��鷹���� ���� 2.��鷹���� ���� 3.��鷹���� ����)
	 * 			
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		
		Scanner scanner = new Scanner(System.in);// �Է� ��ü ����
		
		Recipe[] recipe = new Recipe[100]; // �����Ǹ� ������� �迭����
		int ������Ű = 1234;
		
		while (true) { // ���α׷� ����
			System.out.println("---------------------------��� ������------------------------------");
			System.out.println("1.��鷹���� ��� 2.�����"); int ch = scanner.nextInt();// ���� �Է¹ޱ�
			
			if(ch == 1) {// 1�����ý� ��鷹���� ��� �޴�
				System.out.println("-----------------------������ ���-----------------------");
				System.out.println("�������� �̸��� �Է����ּ���: "); 	String name = scanner.next(); // �������̸� �Է¹ޱ�
				System.out.println("������ �Է����ּ���: ");		 	String ���� = scanner.next(); // ���� �Է¹ޱ�
				System.out.println("����������� �Է����ּ���: ");		String time = scanner.next(); // �ð� �Է¹ޱ�
				System.out.println("�߰���Ḧ �Է��ּ��� ������ 0�Է�: ");			String add = scanner.next(); // �߰���� �Է¹ޱ�
				Recipe ������ = new Recipe(name, ����, time, add); // ������ ��ü����
				for(int i = 0; i < recipe.length; i++) { // �� ���ڿ� ã�Ƽ� ����
					if(recipe[i] == null) { // ���ڿ��̶��
						recipe[i] = ������; // recipe[i] �迭�� ������ ����
						break; // ���������� ������
					}
				}// ���� for end
			}// 1�����ý� ��鷹���� ��� �޴� end
			else if ( ch == 2) {// 2�����ý� �����
				System.out.println("-----------------------------------��� ���-----------------------------------");
				System.out.println("��ȣ\t�̸�");
				//��鷹���� ���
				for(int i = 0; i < recipe.length; i++) { // ������ null �ƴ϶�� ���� ��
					if(recipe[i] != null) {// recipe[i] null �ƴ϶��
						System.out.printf("%s\t%s\n", i, recipe[i].name);// ������ ���
					}
				}// null�ƴ� ã�� for�� end
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("1.��鷹���� ���� 2.��鷹���� ���� 3.��鷹���� ����"); int ch2 = scanner.nextInt(); // �޴����� �Է¹ޤ���
				
				if(ch2 == 1){//1, ��鷹���� ����
					System.out.println("������� �ε����� �Է�: "); int index = scanner.nextInt(); // �ε��� �Է¹ޱ�
					if(recipe[index] != null) {	// �Է¹��� �ε����� null �ƴ϶��
						System.out.println("�������̸�: " + recipe[index].name); //�̸� ���
						System.out.println("����: " + recipe[index].����);		 //���� ���
						System.out.println("�����ð�: " + recipe[index].�ð�);  //�ð� ���
						System.out.println("�߰���� ������ 0: " + recipe[index].�߰����); //�߰�������
					}else {// �Է¹��� �ε����� null ���
						System.out.println("�ش� �����ǰ������ϴ�.");
					}
				}//1, ��鷹���� ���� end
				else if(ch2 == 2){//2. ��鷹���� ����
					System.out.println("--------------------------------����---------------------------------");
					System.out.println("������ �������ε����� �Է�: "); int index2 = scanner.nextInt(); // ������ �ε��� �Է¹ޱ�
					System.out.println("������Ű�� �Է����ּ���: "); int key = scanner.nextInt(); // key �Է¹ޱ�
					if(������Ű == key) { // ������Ű�� Ű�� ��ȣ�� ��ġ�ϴ���
						recipe[index2] = null;	//�ε��� ����
						System.out.println("���� ����");
						if(index2 != recipe.length - 1) { // index2�� recipe���̺��� ũ���ʴٸ� 
							recipe[index2] = recipe[index2 + 1];// �ϳ��� ������ ����� 
							recipe[index2 + 1] = null;			// �ڿ� �ε����� ����
						}else {
							recipe[index2] = null;				// �ƴ϶�� �׳� ����
						}
					}// if e
					else {// ������Ű�� ��ġ�����ʴ´ٸ�
						System.out.println("������Ű�� ��ġ���� �ʽ��ϴ�");
					}
					
				}//2. ��鷹���� ���� end
				else if(ch2 == 3){//3. ��鷹���� ����
					System.out.println("---------------------------����-------------------------------");
					System.out.println("������ �ε����� ����: "); int index = scanner.nextInt(); // �ε��� �Է¹ޱ�
					if(recipe[index] != null) { // �ش��ε����� null ���̾ƴ϶��
						System.out.println("�̸�: "); String name = scanner.next();
						System.out.println("����: ");	 String of = scanner.next();
						System.out.println("�ð�: "); String time = scanner.next();
						System.out.println("�߰����: "); String add = scanner.next();
						
						Recipe temp = new Recipe(name, of, time, add);
						recipe[index] = temp;
					}else {//�ش��ε����� ���ٸ�
						System.out.println("�ش� �����ǰ������ϴ�.");
					}
					
					
					
				}//3. ��鷹���� ���� end
				else {//�׿�
					System.out.println("����))�˼����� �ൿ�Դϴ�");
				}//�׿� 
				
			}// 2�����ý� ����� end
			else {//�׿�
				System.out.println("����))�˼����� �ൿ�Դϴ�");
			}
		}
	}// me	

}// ce
