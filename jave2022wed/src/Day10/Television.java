package Day10;

public class Television implements RemoteContor, Searchable{
			//클래스명 implements 인터페이스명
					//구현하다
	private int volume;
	// ctrl + 스페이스바
	@Override
	public void turnOn() {
		System.out.println("티비를 켭니다");	
	}
	@Override
	public void turnOff() {
		System.out.println("티비를 끕니다");		
	}
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteContor.MAX_VOLUME) {
			//리모콘의 최대소음보다 크면 소음을 10으로 대입
			this.volume = RemoteContor.MAX_VOLUME;
		}else if(volume < MIN_VOLUME) {
			this.volume = RemoteContor.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 tv 불륨 : " + this.volume);	
	}	
	
	@Override
	public void search(String url) {
		System.out.println(url + "구현합니다");
			
	}
	
	@Override // 디폴트 메소드 재정의가능
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		RemoteContor.super.setMute(mute);
	}
	
}
