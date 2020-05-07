package observer;

import commands.TrainingGuy;

public class OnlineViewer implements Observer{
	private String viewerName;
	private String position;
	private TrainingGuy trainingGuy;

	public OnlineViewer(String viewerName, TrainingGuy trainingGuy) {
		this.viewerName = viewerName;
		this.trainingGuy = trainingGuy;
	}
	
	@Override
	public void update() {
		this.position = trainingGuy.getPosition();
		System.out.println(String.format("Online viewer %s has changed his position to %s.", this.viewerName, this.position));
	}
}
