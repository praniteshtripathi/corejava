package rnd.designpattern.command;

public class CommandDemo {
   
	public static void main(String[] args) {
		 Remote remote= new Remote();
		 remote.on();
		 remote.off();
		 remote.setTmp(100);
	}

}
