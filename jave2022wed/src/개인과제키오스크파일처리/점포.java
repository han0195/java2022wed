package 개인과제키오스크파일처리;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class 점포 implements 키오스크인터{
	ArrayList<상품> 상품리스트 = new ArrayList<>();	
	ArrayList<장바구니> 장바구니 = new ArrayList<>();
	@Override
	public void 제품목록(String 점포) throws IOException{
		System.out.println("제품명\t가격\t재고");
		for(상품 temp : 상품리스트) {
			if(temp.get점포().equals(점포)) {
				System.out.println(temp.getName()+"\t"+temp.getPrice()+"\t"+temp.get재고());
			}	
		}
	}
	@Override
	public boolean 장바구니(String 제품명, String 점포) {
		//제품명 점포 받아와서
		for(상품 temp : 상품리스트) {
			if(temp.get점포().equals(점포) && temp.getName().equals(제품명) && temp.get재고() != 0) {
				장바구니.add(new 장바구니(제품명, 1));
				return true;
			}
		}
		
		return false;
	}
	@Override
	public void 결제() {
		
		
	}
	
	@Override
	public boolean 상품추가(String name, String 점포종류, int price, int 재고) throws IOException {
		상품리스트.add(new 상품(name,점포종류,price,재고));
		파일저장(name,점포종류,price,재고);
		return true;
	}
	void 파일저장(String name, String 점포종류, int price, int 재고) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/504/Desktop/햄버거상품파일/햄버거.txt");
		String str = name+","+점포종류+","+price+","+재고+"\n";// 저장 , 구분 | \n 한객체 별 구분
		fileOutputStream.write(str.getBytes());// 파일의 쓰기
	}
	void 파일불러오기() throws IOException {
		FileInputStream fileInputStream = new FileInputStream("C:/Users/504/Desktop/햄버거상품파일/햄버거.txt");
		byte[] bytes = new byte[10000]; // 바이트배열선언
		fileInputStream.read(bytes);	// 파일 읽기
		String string = new String(bytes); // 바이트 -> 문자열
		String[] str = string.split("\n"); //개행별로 구분
		for(int i = 0; i < str.length - 1 ; i++) {// 한개당
			String[] 필드목록 = str[i].split(","); // 필드구분
			상품리스트.add(new 상품(필드목록[0],필드목록[1],Integer.parseInt(필드목록[2]) , Integer.parseInt(필드목록[3]))); // 객체리스트 추가
		}
		
	}
}
