package ch08;

public class Television {
	int channel;
	int volume;
	
	final int ch1 = 15;
	final int ch2 = 1;
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println(this.channel + "번 채널로 변경합니다.");
	}
	
	void channelUp() {
		channel++;
		System.out.println(this.channel + "번 채널로 변경합니다.");
		if (channel > 15) {
			channel = ch2;
			System.out.println(channel + "채널로 돌아갑니다.");
		}
	}
	
	void channelDown() {
		channel--;
		System.out.println(this.channel + "번 채널로 변경합니다.");
		if (channel < 1) {
			channel = ch1;
			System.out.println(channel + "채널로 돌아갑니다.");
		}
	}
	
	void changeVolume(int volume) {
		this.volume = volume;
		System.out.println(this.volume + " 만큼 볼륨을 바꿉니다.");
	}
	
	void volumeUp() {
		volume++;
		System.out.println("볼륨을 1 올립니다.\n현재 볼륨 " + volume);
		if (volume > 25) {
			System.out.println("최대 볼륨을 넘어섰습니다.");
			volume--;
			System.out.println("볼륨을 1 낮춥니다.\n현재 볼륨" + volume);
		}
		
	}
	
	void volumeDown() {
		volume--;
		System.out.println("볼륨을 1 낮춥니다.\n현재 볼륨 " + volume);
		if (volume < 0) {
			System.out.println("최소 볼륨을 넘어섰습니다.");
			volume++;
			System.out.println("볼륨을 1 올립니다.\n현재 볼륨" + volume);
		}
	}
	
}
