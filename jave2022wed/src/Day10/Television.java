package Day10;

public class Television implements RemoteContor, Searchable{
			//Ŭ������ implements �������̽���
					//�����ϴ�
	private int volume;
	// ctrl + �����̽���
	@Override
	public void turnOn() {
		System.out.println("Ƽ�� �մϴ�");	
	}
	@Override
	public void turnOff() {
		System.out.println("Ƽ�� ���ϴ�");		
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
		System.out.println("���� tv �ҷ� : " + this.volume);	
	}	
	
	@Override
	public void search(String url) {
		System.out.println(url + "�����մϴ�");
			
	}
	
	@Override // ����Ʈ �޼ҵ� �����ǰ���
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		RemoteContor.super.setMute(mute);
	}
	
}
