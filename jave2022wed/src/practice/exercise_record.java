package practice;
import java.util.Scanner;

public class exercise_record {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);// �Է°�ü �ޱ�
		
		String[][] mem = new String[100][4];// id /pw /�̸� /�ҷ�  : ȸ�� 2�����迭
		String[][] bor = new String[100][5];// id / �̸� / Ƚ�� / ��Ʈ / ���� : ��� 2�����迭 
		int �����ҷ� = 0;
		
		while (true) {// ���α׷�����
			try {
				System.out.println("�����!! ����");
				System.out.println("1.ȸ������ 2.�α���"); int ch = s.nextInt();
				
				if(ch == 1) {
					System.out.println("***** ȸ������ *****");
					System.out.println("���̵�: ");		String id = s.next(); // id �Է¹ޱ�
					System.out.println("��й�ȣ: ");		String pw = s.next();	// pw �Է¹ޱ�
					System.out.println("�̸�: ");			String name = s.next(); // name �Է¹ޱ�
					boolean pass = true;
					//�ߺ�üũ
					for(int i = 0; i < mem.length ; i++) { // mem ���̸�ŭ �ݺ��ϸ鼭
						if(mem[i][0] != null && mem[i][0].equals(id)) {			// id ���ٸ�
							System.out.println("���̵� �ߺ�"); 
							pass = false;					// ���� x
							break;							// �ߺ�üũ �ݺ��� ����������
						}
					}
					// ����
					if(pass) {// ���� pass true���
						for(int i = 0; i < mem.length ; i++) { // mem ���̸�ŭ�ݺ�
							if(mem[i][0] == null) {				// mem�� null �̶��
								mem[i][0] = id;				//3���� ����
								mem[i][1] = pw;
								mem[i][2] = name;
								mem[i][3] = "0";
								System.out.println("ȸ������ ����");
								break;						// �ݺ��� ����������
							}
						}
						
					}// ���� if �� end
				}else if(ch == 2) {
					System.out.println("���̵�: ");   	String id = s.next(); // id �Է¹ޱ�
					System.out.println("��й�ȣ: ");		String pw = s.next(); // pw �Է¹ޱ�
					boolean pass = false; // pass �� ���
					//�ߺ�üũ
					for(int i = 0; i < mem.length ; i++) { // mem �迭���̸�ŭ �ݺ�
						if(mem[i][0] != null && mem[i][0].equals(id)) {// ���̵� ������
							if(mem[i][0] != null && mem[i][1].equals(pw)) { // ��й�ȣ�� ������
								pass = true; // �α��� ��� true
							}
						}
					}// �ߺ�üũ for�� ����
					if(pass == false) {System.out.println("�α��ν���");}
					while (pass) {// �α��ν� �޴� ���ѹݺ�
						System.out.println("***** ���� *****");
						//���
						System.out.println("�̸�\t\tȽ��\t\t��Ʈ\t\t1ȸ����");
						for(int i = 0; i < bor.length ; i++) { // bor���� ��ŭ �ݺ�
							if(bor[i][0] != null && bor[i][0].equals(id) ) { // id ���� ��ġ�ϸ� ��� �����ֱ�
								System.out.printf("%s\t\t%s\t\t%s\t\t%s\n", bor[i][1],bor[i][2],bor[i][3],bor[i][4]);
							}
						}// ��� for�� end
						System.out.println("-------------------");
						System.out.println("1.��߰� / 2.����� / 3.����� / 4.�α׾ƿ�"); int ch2 = s.nextInt();
						
						if(ch2 == 1) { // � �߰�
							System.out.println("***** ��߰� *****");
							System.out.println("��̸�: "); String name = s.next(); // �̸��Է¹ޱ�
							System.out.println("Ƚ��: ");	String count = s.next();// Ƚ���Է¹ޱ�
							System.out.println("��Ʈ: ");	String set = s.next();// ��Ʈ�Է¹ޱ�
							System.out.println("1ȸ����: ");  String weight = s.next();// �����Է¹ޱ�
							//������� ���� ���Ը� ���ϱ� ���� int������ ��ȯ
							int Ƚ�� = Integer.parseInt(count);
							int ��Ʈ = Integer.parseInt(set);
							int ���� = Integer.parseInt(weight);
							int ���� = (���� * Ƚ��) * ��Ʈ;
							
							for(int i = 0; i < bor.length ; i++) { // bor ���̸�ŭ �ݺ�
								if(bor[i][0] == null) { // null �̶��
									bor[i][0] = id;	//����
									bor[i][1] = name;
									bor[i][2] = count;
									bor[i][3] = set;
									bor[i][4] = weight;
									
									break;
								}
							}// ������� end
							for(int i = 0; i < bor.length ; i++) {
								if(mem[i][0] != null && mem[i][0].equals(id)) {
									mem[i][3] = Integer.toString(����);
								}
							}
						}else if(ch2 == 2) {// � ����
							System.out.println("***** ����� *****");
							System.out.println("��̸�: "); String name = s.next(); // �̸��Է¹ޱ�
							//��ϻ���
							for(int i = 0; i < bor.length ; i++) { // bor ���̸�ŭ �ݺ�
								if(bor[i][0] != null && bor[i][1].equals(name) && bor[i][0].equals(id)) { // ������ id �� ���������
									
									bor[i][0] = null; //�ʱ�ȭ
									bor[i][1] = null;
									bor[i][2] = null;
									bor[i][3] = null;
									bor[i][4] = null;
									break;
								}
							}// ��ϻ��� end
						}else if(ch2 == 3) {// � ����
							System.out.println("***** � ���� *****");
							
							for(int i = 0; i < mem.length ; i++) { // mem ���̸�ŭ �ݺ�
								if(mem[i][0] != null && mem[i][0].equals(id)) { // ������ id �� ã��
									System.out.println(mem[i][2] + "���� �ѿ �ҷ��� : " + mem[i][3] + "Kg"); // ���
									int ����ҷ� = Integer.parseInt(mem[i][3]); // int����ȯ 
									if(����ҷ� > �����ҷ�) {
										System.out.println("��������" +(����ҷ� - �����ҷ�)+"kg �����ϼ̽��ϴ�");
									}else if(����ҷ� < �����ҷ�) {
										System.out.println("��������" +(����ҷ� - �����ҷ�)+"kg ���µǼ̽��ϴ�");
									}
									
									�����ҷ� = Integer.parseInt(mem[i][3]); //����ҷ��� ���� �ҷ��� ���ϱ����� ����
									mem[i][3] = null;						//������ ����ҷ� �� �����ϱ����� ������ �ش��ϴ¤� �ε��� �ʱ�ȭ
									// �󸶳� �����ߴ��� �߰� bor �迭 �ʱ�ȭ 
									for(int j = 0; j < bor.length ; j++) { // bor ���̸�ŭ �ݺ�
										if(bor[j][0] != null && bor[j][0].equals(id)) { // ������ id �� ���������
											
											bor[j][0] = null; //�ʱ�ȭ
											bor[j][1] = null;
											bor[j][2] = null;
											bor[j][3] = null;
											bor[j][4] = null;
		
										}
									}
								}					
							}// ����� for �� end
							
						}else if(ch2 == 4) {// �α׾ƿ�
							break;
						}else {
							System.out.println("�˼����� �ൿ�Դϴ�");
						}
						
						
						 
					}//�α��ν� �޴� ���ѹݺ� end
				
				}else {
					System.out.println("�˼����� �ൿ");
				}
				
				
				
				
			}catch(Exception e) {
				System.out.println("�ý��� ���� [������ ȣ��]���" + e);
			}	
		}// while end
		
		
		

	}// me

}// ce
