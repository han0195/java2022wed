package ���ΰ���Ű����ũ����ó��;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ���� implements Ű����ũ����{
	ArrayList<��ǰ> ��ǰ����Ʈ = new ArrayList<>();	
	ArrayList<��ٱ���> ��ٱ��� = new ArrayList<>();
	@Override
	public void ��ǰ���(String ����) throws IOException{
		System.out.println("��ǰ��\t����\t���");
		for(��ǰ temp : ��ǰ����Ʈ) {
			if(temp.get����().equals(����)) {
				System.out.println(temp.getName()+"\t"+temp.getPrice()+"\t"+temp.get���());
			}	
		}
	}
	@Override
	public boolean ��ٱ���(String ��ǰ��, String ����) {
		//��ǰ�� ���� �޾ƿͼ�
		for(��ǰ temp : ��ǰ����Ʈ) {
			if(temp.get����().equals(����) && temp.getName().equals(��ǰ��) && temp.get���() != 0) {
				��ٱ���.add(new ��ٱ���(��ǰ��, 1));
				return true;
			}
		}
		
		return false;
	}
	@Override
	public void ����() {
		
		
	}
	
	@Override
	public boolean ��ǰ�߰�(String name, String ��������, int price, int ���) throws IOException {
		��ǰ����Ʈ.add(new ��ǰ(name,��������,price,���));
		��������(name,��������,price,���);
		return true;
	}
	void ��������(String name, String ��������, int price, int ���) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/504/Desktop/�ܹ��Ż�ǰ����/�ܹ���.txt");
		String str = name+","+��������+","+price+","+���+"\n";// ���� , ���� | \n �Ѱ�ü �� ����
		fileOutputStream.write(str.getBytes());// ������ ����
	}
	void ���Ϻҷ�����() throws IOException {
		FileInputStream fileInputStream = new FileInputStream("C:/Users/504/Desktop/�ܹ��Ż�ǰ����/�ܹ���.txt");
		byte[] bytes = new byte[10000]; // ����Ʈ�迭����
		fileInputStream.read(bytes);	// ���� �б�
		String string = new String(bytes); // ����Ʈ -> ���ڿ�
		String[] str = string.split("\n"); //���ະ�� ����
		for(int i = 0; i < str.length - 1 ; i++) {// �Ѱ���
			String[] �ʵ��� = str[i].split(","); // �ʵ屸��
			��ǰ����Ʈ.add(new ��ǰ(�ʵ���[0],�ʵ���[1],Integer.parseInt(�ʵ���[2]) , Integer.parseInt(�ʵ���[3]))); // ��ü����Ʈ �߰�
		}
		
	}
}
