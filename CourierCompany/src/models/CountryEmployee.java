package models;

import chain.CounterEmployee;
import state.PreparingPackageState;
import state.WaitingClientState;

public class CountryEmployee extends CounterEmployee {

	public CountryEmployee() {
		super(null);
	};
	
	public CountryEmployee(CounterEmployee successor)
	{
		super(successor);
	}
	
	@Override
	public void handleClient(Client client) {
		
		if(this.canHandleClient(client, PackageType.Country)) {
			this.setState(new PreparingPackageState());
			
			System.out.println("A country packages employee is handling the package of client: " + client.getName());
			
			this.notifyObservers();
			
			this.setState(new WaitingClientState());
			
			System.out.println("The country employee is free to handle a new client package now.");
		}
		else {
			super.handleClient(client);	
		}
	}
}
