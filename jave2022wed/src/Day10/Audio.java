package Day10;

public class Audio implements RemoteContor, Searchable{
	//�ʵ�
	private int volume;
	
	//turnOn() �߻� �޼ҵ��� ��ü �޼ҵ�
	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�");
		
	}
	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�");
		
	}
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteContor.MAX_VOLUME) {
			//�������� �ִ�������� ũ�� ������ 10���� ����
			this.volume = RemoteContor.MAX_VOLUME;
		}else if(volume < MIN_VOLUME) {
			this.volume = RemoteContor.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� Audio �ҷ� : " + this.volume);		
	}	
	@Override
	public void search(String url) {
		System.out.println(url + "�����մϴ�");
		
	}
		
	}
	
	

