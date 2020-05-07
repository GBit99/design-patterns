package commands;

public class GetUpCommand implements Command {

	private TrainingGuy trainingGuy;
	
	public GetUpCommand(TrainingGuy trainingGuy) {
		this.trainingGuy = trainingGuy;
	}
	
	@Override
	public void execute() {
		this.trainingGuy.setStateToStanding();
	}
}
