package ���ΰ���;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BoardApp {
	/*
	 * �Խ��� + ��� ���α׷� [ ����ó�� , ����ó�� , ����Ʈ ]
	 * 		// [m]�Խ��� Ŭ����
	 * 				// ����, ����, �ۼ���, �ۼ���, ��ȸ��, ��۸���Ʈ
	 * 		// [m]��� Ŭ����
	 * 				// ����, �н�����, �ۼ���, �ۼ���
	 * 		// [c]��Ʈ�ѷ� Ŭ����
	 * 				// 1.��� 2.���� 3.���� 4.���� 5.���� 6.��۾���	
	 * 				// 7.�Խù����� 8.�Խù��ҷ�����edit document 9.������� 10.��ۺҷ�����
	 * 		// [v]Day11_04 Ŭ����
	 * 				// ����� [ �Է¹޾� ��Ʈ�ѷ����� �Է¹��� �� ���� ]
	 * 
	 */
	/*
	 *  ��ȸ���� �Խ���/��� ���α׷� [ ����ó�� , ����ó�� , ����Ʈ ]
	 * 		// [m]�Խù� Ŭ���� 
	 * 				// ���� , ���� , �н����� , �ۼ��� , �ۼ��� , ��ȸ�� , ��۸���Ʈ
	 * 		// [m]��� Ŭ���� 
	 * 				// ���� , �н����� , �ۼ��� , �ۼ��� 
	 * 		// [c]��Ʈ�ѷ� Ŭ����
	 * 				// 1.��� 2.���� 3.���� (3)4.���� 5.���� 6.��۾���
	 * 				// 7.�Խù����� 8.�Խù��ҷ����� 9.������� 10.��ۺҷ����� 
	 * 		// [v]Day11_4_BoardApp Ŭ���� 
	 * 				// ����� [ �Է¹޾� ��Ʈ�ѷ����� �Է¹��� �� ���� ] 
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		while(true) {
			try {
				Controller.respone();
				System.out.println("*** ��ȸ�� �Խ��� ���α׷� ***");
				System.out.println("��ȣ\t����\t����\t\t��¥\t\t��ȸ��");
				// �Խù� ���
				Controller.listview();
				System.out.println("------------------------------------");
				System.out.println("1.���� 2.����"); int ch = s.nextInt();
				if(ch == 1) {// 1. ����
					System.out.println("*** �Խù� ���� ***");
					System.out.println("����: "); String tit = s.next();
					System.out.println("����: "); String con = s.next();
					System.out.println("�н�����: "); String pw = s.next();
					Controller.write(tit, con, pw);
				}else if(ch == 2){// 2. ����
					System.out.println("���� �ε���: "); int index = s.nextInt();
					boolean view = Controller.view(index);
						if(view) {// ������
							while(true) {
								System.out.println("����\t����\t\t��¥\t\t��ȸ��");
								System.out.println(Controller.Boardlist.get(index).getTitle()+"\t"+Controller.Boardlist.get(index).getContent()+"\t\t"+Controller.Boardlist.get(index).getDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd "))+"\t\t"+Controller.Boardlist.get(index).getViews());
								System.out.println("-----------���â---------------");
								System.out.println("����\t����");
								//������
								for(Comment temp : Controller.Boardlist.get(index).getCommentlist()) {
									System.out.println(temp.getContent()+"\t"+temp.getWriter());
								}
								System.out.println("--------------------------------");
								System.out.println("1.���� 2.���� 3.��۾��� 4.�ڷΰ���"); int ch2 = s.nextInt();
								if(ch2 == 1) {
									System.out.println("���� ����: "); String tit = s.next();
									System.out.println("���� ����: "); String con = s.next();
									System.out.println("�н�����: "); String pw = s.next();
									boolean result = Controller.edit(index, pw, tit, con);
									if(result) {
										System.out.println("��������");
									}else {
										System.out.println("����] ��������");
									}
								}else if(ch2 == 2) {
									
								}else if(ch2 == 3) {
									
								}else if(ch2 == 4) {
									break;
								}
								else {
									System.out.println("�˼����� �ൿ");
								}
							}			
						}else {// ����
							
						}//���� ���� end
					
				}else {// ����
					System.out.println("�߸��� ����");
				}
			} catch (Exception e) {
				System.out.println("���α׷����� " + e);
			}	
		}// ���α׷� �ݺ���
		
		
	}
}
