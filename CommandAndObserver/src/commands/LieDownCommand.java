package commands;

public class LieDownCommand implements Command {

	private TrainingGuy trainingGuy;
	
	public LieDownCommand(TrainingGuy trainingGuy) {
		this.trainingGuy = trainingGuy;
	}
	
	@Override
	public void execute() {
		this.trainingGuy.setStateToLying();
	}
}
