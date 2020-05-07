package commands;

import java.util.ArrayList;

import observer.Observable;
import observer.Observer;

public class TrainingGuy implements Observable {
	private String position;
	private ArrayList<Observer> observers;
	
	public TrainingGuy()
	{
		this.observers = new ArrayList<Observer>();
		this.position = "standing";
	}
	
	public String getPosition()
	{
		return this.position;
	}
	
	public void setStateToStanding() {
		System.out.println("Training guy is standing.");
		this.position = "standing";
		this.notifyObservers();
	}
	
	public void setStateToLying() {
		System.out.println("Training guy is lying down.");
		this.position = "lying";
		this.notifyObservers();
	}

	@Override
	public void attach(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		this.observers.remove(observer);
	}
	
	@Override
	public void notifyObservers() {
		for (Observer observer : this.observers)
		{
			observer.update();
		}
	}
}
