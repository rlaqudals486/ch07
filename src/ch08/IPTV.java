package ch08;

public class IPTV extends Television {
	
	int Vodchannel;
	
	void turnOnVOD() {
		System.out.println("VOD를 켭니다.");
	}
	
	void turnOffVOD() {
		System.out.println("VOD를 끕니다.");
	}
	
	void channel(int Vodchannel) {
		this.Vodchannel = Vodchannel;
		System.out.println(this.Vodchannel + " 번으로 채널을 변경합니다.");
	}
	
	void channelUp() {
		Vodchannel++;
		System.out.println(this.Vodchannel + " 번으로 채널을 변경합니다.");
	}
	
	void channelDown() {
		Vodchannel--;
		System.out.println(this.Vodchannel + " 번으로 채널을 변경합니다.");
	}
}
