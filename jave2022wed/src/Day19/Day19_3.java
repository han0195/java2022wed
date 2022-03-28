package Day19;

import java.util.HashMap;

public class Day19_3 {
	public static void main(String[] args) {
		
		//1. Map �÷��� = json
			// *Ű(��ü) , ��(��ü) = ��Ʈ��
			// Ű : set�÷���(�ߺ��Ұ���) ��: list�÷���(�ߺ�����)
			// HashMap Ŭ����
				// 1. map��ü��.put(Ű , ��) : ��Ʈ��(Ű = ��) �߰�
				// 2. map��ü��.size() : ��Ʈ�� ����
				// 3. map��ü��.get( Ű��ü ) : �ش� Ű�� �� ȣ��
				// 4. map��ü��.keyset() : map��ü�� ��� Ű ȣ��
				// 5. map��ü��.values() : map��ü�� ��� �� ȣ��
					// * map �� Ű �� �˸� ����  �˼��ִ�.
					// for ( ���ӽð�ü�� : map.Keyset() ) {}
				// 6. map��ü��.remove( Ű��ü ) : �ش� Ű�� ��Ʈ�� ����
				// 7. map.��ü��.clear() : ��� ��Ʈ�� ����
	
		// * List�÷��� : ����(�ε���) ����
		// * Set�÷��� : �������� ����
		// * Map�÷��� : Ű(set)�� ��(list)���� �̷���� ��Ʈ�� �������� [����x]
		
		//1. HashMap Ŭ������ ��ü ����
		HashMap<String, Integer> map = new HashMap<>();
	//HachMap : �÷��������ӿ�ũ map Ŭ����
		//<���׸� , ���׸� > : key , value �� ������ ���׸�
			//map : map ��ü�� (�ƹ��ų�)
				//new : ��ü ������ �޸��Ҵ�
		
		//2. map ��ü�� �߰�
		map.put("�ſ��", 85); System.out.println("Ȯ�� : " + map);
			// ����Ʈ = [ ��ü, ��ü, ��ü ]
			// ��Ʈ = [ ��ü, ��ü, ��ü ]
			// �� = [ Ű = �� ]
		map.put("ȫ�浿", 90); System.out.println("Ȯ�� : " + map);
		map.put("���屺", 80); System.out.println("Ȯ�� : " + map);
		// key�� �ߺ� �Ұ���
		map.put("ȫ�浿", 95); System.out.println("Ȯ�� : " + map);
		// value �� �ߺ�����
		map.put("���缮", 95); System.out.println("Ȯ�� : " + map);
		// 3. map��ü��.size() : ��Ʈ��(Ű)�� ȣ��
		System.out.println("map ��ü�� ��Ʈ�� �� : " + map.size());
		// 4. map��ü��.get(Ű��) : �� ȣ�� 
		System.out.println("map ��ü�� �� ȣ�� (Űȣ���->��ȣ��) : " + map.get("���缮"));
		
		// 5. ��� key ȣ��
		System.out.println("map��ü�� ��� Ű ȣ��: " + map.keySet());
		// 6. ��� value  ȣ��
		System.out.println("map��ü�� ��� �� ȣ��: " + map.values());
		
		// 7. �ݺ��� [ key�� �ݺ��� �̿��ؼ� ��� value ȣ�� ���� ]
		for(String temp : map.keySet()) {
			System.out.println(temp + " : " + map.get(temp));
		}
		
		// 8. ����
		map.remove("ȫ�浿"); System.out.println("Ȯ�� : " + map);
		// 9. ��� �灴
		map.clear();         System.out.println("Ȯ�� : " + map);
		
		
	}
}
