package ���ΰ����������ϸ���;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class controller implements �������̽�{
	
	static ArrayList<�޸���> �޸�s = new ArrayList<�޸���>();
	static ArrayList<ȸ��> ȸ�� = new ArrayList<ȸ��>();
	
	@Override
	public boolean ȸ������(String id, String pw, String name) {
		//id pw name�޾ƿͼ� id �ߺ�üũ�� ���� ���		
		for(�޸��� temp : �޸�s) {// �ߺ�üũ
			if(temp.id.equals(id)) {
				return false;
			}
		}
		ȸ�� temp = new ȸ��(id, pw, name); // �ѱ��
		ȸ��.add(temp); // ����
		try {
			ȸ����������(temp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	@Override
	public String �α���(String id, String pw) {
		// id pw �޾ƿͼ� �ߺ�üũ
		for(ȸ�� temp : ȸ��) {
			if(temp.id.equals(id) && temp.pw.equals(pw)) {
				return id;
			}
		}
		return null;
	}
	@Override
	public void ������(String id) {
		for(�޸��� temp : �޸�s) {
			if(temp.id.equals(id)) {
				if(temp.getContent() != null) {
					System.out.println(temp.getContent() +"\t"+ temp.is�ϷῩ��());
				}	
			}
		}
	}
	@Override
	public void �޸����(String cen, String result) {
		// id �� �ε��� �޾ƿͼ� ����
		for(int i = 0; i < �޸�s.size() ; i++) {
			if(�޸�s.get(i).id.equals(result)&& �޸�s.get(i).getContent().equals(cen)) {
				�޸�s.remove(i);
			}
		}		
	}
	@Override
	public boolean �޸��ۼ�(String id, String cen) {
		//id �� ���� �޾ƿ� ó��
		for(ȸ�� temp : ȸ��) {
			if(temp.id.equals(id)) {
				�޸��� temp2 = new �޸���(cen , false , temp.id, temp.pw , temp.name);
				�޸�s.add(temp2);
				try {
					�޸�����������(temp2);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return true;
			}
		}
		return false;
	}
	@Override
	public void �޸�Ϸ�(String cen, String result) {//����, ���̵�
		// ���� id �޾ƿͼ� ��
		for(�޸��� temp : �޸�s) {
			if(temp.id.equals(result)&& temp.getContent().equals(cen)) {
				temp.set�ϷῩ��(!temp.is�ϷῩ��());
			}
		}
	}

	public void ���Ϻҷ�����() throws IOException {
		FileInputStream fileInputStream = new FileInputStream("C:/Users/gks01/Desktop/txtx/ȸ��.txt");
		byte[] beyte = new byte[1024];// ����Ʈ�迭����
		fileInputStream.read(beyte);  // ����Ʈ�б�
		String strall = new String(beyte); // ���ڿ� ��ü ����
		String[] strs = strall.split("\n"); // �������� ����
		for(int i = 0 ; i < strs.length - 1 ; i++) { // �ʵ� ����
			String[] str = strs[i].split(",");
			ȸ��.add(new ȸ��(str[0], str[1], str[2]));
		}	
	}
	public void �޸������Ϻҷ�����() throws IOException {
		FileInputStream fileInputStream = new FileInputStream("C:/Users/gks01/Desktop/txtx/�޸���.txt");
		byte[] beyte = new byte[1024];// ����Ʈ�迭����
		fileInputStream.read(beyte);  // ����Ʈ�б�
		String strall = new String(beyte); // ���ڿ� ��ü ����
		String[] strs = strall.split("\n"); // �������� ����
		for(int i = 0 ; i < strs.length - 1 ; i++) { // �ʵ� ����
			String[] str = strs[i].split(",");
			�޸�s.add(new �޸���(str[0], Boolean.parseBoolean(str[1]) , str[2], str[3], str[4]));
		}	
	}

	public void �޸�����������(�޸��� save) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/gks01/Desktop/txtx/�޸���.txt", true);
		String str = save.getContent()+","+save.is�ϷῩ��()+","+save.id+","+save.pw+","+save.name+"\n";
		fileOutputStream.write(str.getBytes());
		
	}
	public void ȸ����������(ȸ�� save) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/gks01/Desktop/txtx/ȸ��.txt", true);
		String str = save.id+","+save.pw+","+save.name+"\n";
		fileOutputStream.write(str.getBytes());
	}
	
}
