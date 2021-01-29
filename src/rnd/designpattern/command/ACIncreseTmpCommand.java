package rnd.designpattern.command;

public class ACIncreseTmpCommand implements Command{
    private AC ac;
    public ACIncreseTmpCommand(AC ac) {
    	this.ac=ac;
    }
	@Override
	public void execute() {
		ac.increaseTMP();
	}

}
