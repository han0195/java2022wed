package ���ΰ���;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Controller {
	static ArrayList<Board> Boardlist = new ArrayList<Board>();
	
	public static void listview() {
		// ���� ���
		int i = 0;
		for(Board temp : Boardlist) {
			System.out.println(i+"\t"+temp.getTitle()+"\t"+temp.getContent()+"\t\t"+temp.getDate()+"\t\t"+temp.getViews());
			i++;
		}
	}
	public static boolean view(int index) throws IOException {
		//�ε��� �޾Ƽ�
		if(Boardlist.get(index) != null) {
			//�ش�� ��ȸ�� ����
			Boardlist.get(index).setViews(Boardlist.get(index).getViews() + 1);
			//���̺�
			save();
			return true;
		}
		return false;
	}
	public static boolean write(String tit, String con, String pw) throws IOException {
		// ���� ���� �н����� �޾Ƽ�
		// Boardlist�� ����
		Boardlist.add(new Board(tit, con, pw, LocalDate.now(), 0));
		// ���̺�
		save();
		return true;
	}
	public static boolean edit(int index, String pw, String tit, String con) throws IOException {
		// �ε��� ��й�ȣ �޾Ƽ�
		// ��й�ȣ ��ġ�ϸ� ����
			if(Controller.Boardlist.get(index).getPassword().equals(pw)) {
				Controller.Boardlist.get(index).setTitle(tit);
				Controller.Boardlist.get(index).setContent(con);
				// ���̺�
				save();
				return true;
			}
		return false;
	}
	public static boolean delete(int index, String pw) {
		// �ε��� ��й�ȣ �޾Ƽ�
		// ��й�ȣ ��ġ�ϸ� ����
		// ���̺�
		return false;
	}
	public static boolean cwrite() { // ��۾���
		// �ε��� , ��۳���, ��ۺ��, �ۼ��� �޾Ƽ�
		// Board �ε�����ġ�ϴ� �Խ��� ��۸���Ʈ�� �߰�
		// ��ۼ��̺�
		return false;
	}
	public static void save() throws IOException { // �Խù�����
		FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/504/Desktop/ds/�Խù�.txt");
		for(Board temp : Boardlist) {
			String str = temp.getTitle()+","+temp.getContent()+","+temp.getPassword()+","+temp.getDate()+","+temp.getViews()+"\n";
			fileOutputStream.write(str.getBytes());
		}
	}
	public static void respone() throws IOException { // �Խù� �ҷ�����
		FileInputStream fileInputStream = new FileInputStream("C:/Users/504/Desktop/ds/�Խù�.txt");
		byte[] bytes = new byte[1024];
		fileInputStream.read(bytes);
		String strall = new String(bytes);
		String[] strs = strall.split("\n");
		for(int i = 0; i < strs.length - 1 ; i++) {
			String[] str = strs[i].split(",");
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate date =  LocalDate.parse(str[3], formatter);
			Boardlist.add(new Board(str[0],str[1],str[2],date,Integer.parseInt(str[4])));
		}
	}
	public static void commentSave() {// �������
		
	}
	public static void commentrespone() {// ��� �ҷ�����
		
	}
}
