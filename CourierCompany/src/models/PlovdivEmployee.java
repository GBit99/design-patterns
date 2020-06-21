package models;

import chain.CounterEmployee;
import state.PreparingPackageState;
import state.WaitingClientState;

public class PlovdivEmployee extends CounterEmployee {
	
	public PlovdivEmployee()
	{
		super(null);
	}
	
	public PlovdivEmployee(CounterEmployee successor)
	{
		super(successor);
	}
	
	@Override
	public void handleClient(Client client) {
		
		if(this.canHandleClient(client, PackageType.Plovdiv)) {
			this.setState(new PreparingPackageState());
			
			System.out.println("A Plovdiv packages employee is handling the package of client: " + client.getName());
			
			this.notifyObservers();
			
			this.setState(new WaitingClientState());
			
			System.out.println("The Plovdiv employee is free to handle a new client package now.");
		}
		else {
			super.handleClient(client);	
		}
	}
}
