package rnd.designpattern.command;

public class AC {
	int tmp;

	public void on() {
		System.out.println("AC on");
	}
	public void off() {
		System.out.println("AC off");
	}
	public void increaseTMP() {
		System.out.println("AC tempatrure incresed by"+tmp);
	}
	
	public void decreseTMP(int tmp) {
		System.out.println("AC tempatrure decresed by"+tmp);
	}
	
	public void setTmp(int tmp) {
		this.tmp=tmp;
	}
	
}
