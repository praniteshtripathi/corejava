package rnd.designpattern.command;

public class ACONCommand implements Command{
    private AC ac;
    public ACONCommand(AC ac) {
    	this.ac=ac;
    }
	@Override
	public void execute() {
		ac.on();
	}

}
