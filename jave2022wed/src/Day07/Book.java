package Day07;
	
public class Book {
	//1. �ʵ�
		int bisbn;
		String btitle;
		String bwriter;
		boolean brental;
		String bid;
		
	//2. ������
		Book() {}
		Book(int bisbn, String btitle, String bwriter, boolean brental, String bid){
			this.bisbn = bisbn;
			this.btitle = btitle;
			this.bwriter = bwriter;
			this.brental = brental;
			this.bid = bid;
		}
	//3. �޼ҵ�
		//1. �����˻�
		void �����˻�() {
			System.out.println("------------------------���� �˻�------------------------");
			System.out.println("������: "); String title = Day07_05Application.scanner.next();
			for(Book temp : Day07_05Application.book) {
				if(temp != null && temp.btitle.equals(title)) {// ��ġ�ϴ°�������
					System.out.println("ISBN\t������\t�۰�\t�����뿩����\t�뿩ȸ��");
					System.out.printf("%d\t%s\t%s\t%b\t%s\n", temp.bisbn, temp.btitle, temp.bwriter, temp.brental, temp.bid);
					return;
				}
			}
			System.out.println("�˻��Ͻ� ������ ����");
		}// �����˻� for�� end
		
		
		
		//2. �������
		void �������() {
			System.out.println("---------------------���� ���-----------------");
			System.out.println("ISBN\t������\t�۰�\t�����뿩����\t�뿩ȸ��");
			for(Book temp : Day07_05Application.book) {
				if(temp != null) {
					System.out.println();
					System.out.printf("%d\t%s\t%s\t%b\t%s\n", temp.bisbn, temp.btitle, temp.bwriter, temp.brental, temp.bid);
				}else {
					return;
				}
			}
				
		}
		//3. �����뿩
		void �����뿩(String result) { //**5 ���⼭ ���ڸ� �޾ƿ���
			System.out.println("----------------------�����뿩-------------------------");
			System.out.println("�뿩�� isbn: "); int isbn = Day07_05Application.scanner.nextInt();
			for(Book temp : Day07_05Application.book) {
				if(temp != null && temp.bisbn == isbn) {// ��ġ�ϸ�
					if(temp.brental == true) {//��Ż�� true�̸�
						temp.brental = false; // ����
						temp.bid = result; // �Ϸ��ش�
						System.out.println("�뿩 ����");
						return;
					}else {//��Ż�� false ��
						System.out.println("�̴̹뿩 ����ϴ�");
						return;
					}
				}
			}//for end
			System.out.println("�ش� ������ �����ϴ�");
		}//�����뿩 end
		
		
		//4. �����ݳ�
		void �����ݳ�(String result) {
			System.out.println("----------------------�����ݳ�-------------------------");
			System.out.println("�뿩�� isbn: "); int isbn = Day07_05Application.scanner.nextInt();
			for(Book temp : Day07_05Application.book) {
				if(temp != null && temp.bisbn == isbn && temp.bid == result) {// ��ġ�ϸ�
					if(temp.brental == false) {//��Ż�� true�̸�
						temp.brental = true; // ����
						temp.bid = null;
						System.out.println("�ݳ� ����");
						return;
					}else {//��Ż�� false ��
						System.out.println("�ݳ� ����");
						return;
					}
				}
			}//for end
			System.out.println("�뿩���� �ش� ������ �����ϴ�");
		}
		
		//5. �������
		void �������() {
			System.out.println("----------------------�������--------------------");
			System.out.println("ISBN: "); int isbn = Day07_05Application.scanner.nextInt();
			System.out.println("������: "); String title = Day07_05Application.scanner.next();
			System.out.println("�۰�: ");	  String bwriter = Day07_05Application.scanner.next();
			//�ߺ�üũ
			for(Book temp : Day07_05Application.book) {
				if( temp != null && temp.bisbn == isbn) {
					System.out.println("�ߺ��� ISBN�Դϴ�");
					return; // �����ߺ� ����
				}
			}
			
			//��üȭ
			Book book1 = new Book(isbn, title, bwriter , true, null);
			int i = 0;
			for(Book temp : Day07_05Application.book) {
				if(temp == null) {
					Day07_05Application.book[i] = book1;
					System.out.println("������ϼ���");
					return;
				}
				i++;
			}
			return;

		}// ������� ����
		
		
		//6. ��������
		void ��������() {
			System.out.println("-------------------------��������---------------------------");
			System.out.println("������ ISBN: "); int isbn = Day07_05Application.scanner.nextInt();
			int i = 0;//�ݺ�Ƚ��
			for(Book temp : Day07_05Application.book) {
				if(temp != null && temp.bisbn == isbn) {// ��ġ�ϸ�
					Day07_05Application.book[i] = null;
					if(Day07_05Application.book[i + 1] != null) {
						Day07_05Application.book[i] = Day07_05Application.book[i + 1];
						 Day07_05Application.book[i + 1] = null;
					}
					System.out.println("��������");
					return;
				}
				i++;
			}			
		}// �������� end
 		
		//����void ����() {
			
		//}
}
