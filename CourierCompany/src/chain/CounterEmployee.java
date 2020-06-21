package chain;

import java.util.ArrayList;

import models.Client;
import models.PackageType;
import observer.IObservable;
import observer.IObserver;
import state.IState;
import state.WaitingClientState;

public abstract class CounterEmployee implements IObservable {

	private ArrayList<IObserver> observers;
	private IState state;
	private CounterEmployee successor;
	
	public CounterEmployee(CounterEmployee successor) {
		this.successor = successor;
		this.observers = new ArrayList<IObserver>();
		this.state = new WaitingClientState();
	}

	public void handleClient(Client client)
	{
		if(successor != null) {
			successor.handleClient(client);
		}
		else
		{
			System.out.println("Unable to find the correct employee for the customer package: " + client.getPackageType().toString());
		}
	}
	
	protected boolean canHandleClient(Client client, PackageType packageType) {
		return state.canHandleClient(client, packageType);
	}
	
	@Override
	public void notifyObservers() {
		for (IObserver observer : this.observers)
		{
			observer.update(this);
		}
	}
	
	@Override
	public void attach(IObserver observer) {
		this.observers.add(observer);
	}

	@Override
	public void detach(IObserver observer) {
		this.observers.remove(observer);
	}
	
	public CounterEmployee getSuccessor() {
		return successor;
	}
	
	public void setSuccessor(CounterEmployee handler) {
		this.successor = handler;
	}
	
	public IState getState() {
		return this.state;
	}
	
	public void setState(IState state) {
		this.state = state;
		this.notifyObservers();
	}
	
	public void givePackageToStorageBoy() {
		System.out.println("Employee gives the package");
	}
}
