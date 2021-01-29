package rnd.designpattern.command;


public class Remote {
	AC ac= new AC();
	public void	on() {	
		Command acon= new ACONCommand(ac);
		acon.execute();
	}
	
	public void	off() {	
		Command acon= new ACOffCommand(ac);
		acon.execute();
	}
	
	public void setTmp(int tmp) {
		ac.setTmp(tmp);
		Command acon= new ACIncreseTmpCommand(ac);
		acon.execute();
	}
	
}
