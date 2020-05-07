package main;

import commands.Command;
import commands.FitnessInstructor;
import commands.GetUpCommand;
import commands.LieDownCommand;
import commands.TrainingGuy;
import observer.OnlineViewer;

public class ObserverAndCommandMain {

	public static void main(String[] args) {
		FitnessInstructor fitnessInstructor = new FitnessInstructor();
		TrainingGuy trainingGuy = new TrainingGuy();
		
		OnlineViewer firstViewer = new OnlineViewer("FirstViewer", trainingGuy);
		OnlineViewer secondViewer = new OnlineViewer("SecondViewer", trainingGuy);
		OnlineViewer thirdViewer = new OnlineViewer("ThirdViewer", trainingGuy);
		
		trainingGuy.attach(firstViewer);
		trainingGuy.attach(secondViewer);
		trainingGuy.attach(thirdViewer);
		
		trainingGuy.notifyObservers();
		
		Command getUpCommand = new GetUpCommand(trainingGuy);
		Command lieDownCommand = new LieDownCommand(trainingGuy);
		
		fitnessInstructor.setCommand(lieDownCommand);
		fitnessInstructor.instruct();
		
		fitnessInstructor.setCommand(getUpCommand);
		fitnessInstructor.instruct();
		
		fitnessInstructor.setCommand(lieDownCommand);
		fitnessInstructor.instruct();
		
		fitnessInstructor.setCommand(getUpCommand);
		fitnessInstructor.instruct();
		
		fitnessInstructor.setCommand(lieDownCommand);
		fitnessInstructor.instruct();
		
		fitnessInstructor.setCommand(getUpCommand);
		fitnessInstructor.instruct();
		
		fitnessInstructor.setCommand(lieDownCommand);
		fitnessInstructor.instruct();
		
		fitnessInstructor.setCommand(getUpCommand);
		fitnessInstructor.instruct();
	} 

}
