package Day10;

public class Audio implements RemoteContor, Searchable{
	//필드
	private int volume;
	
	//turnOn() 추상 메소드의 실체 메소드
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
		
	}
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
		
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
		System.out.println("현재 Audio 불륨 : " + this.volume);		
	}	
	@Override
	public void search(String url) {
		System.out.println(url + "구현합니다");
		
	}
		
	}
	
	

