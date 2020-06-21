package models;

import chain.CounterEmployee;
import state.IState;
import state.PreparingPackageState;

public class PlovdivEmployee extends CounterEmployee {
	
	public PlovdivEmployee()
	{
		super(null);
	}
	
	public PlovdivEmployee(CounterEmployee successor, IState state) {
		super(successor, state);
	}
	
	public PlovdivEmployee(CounterEmployee successor)
	{
		super(successor);
	}
	
	@Override
	public void handleClient(Client client) {
		
		if(this.canHandleClient(client, PackageType.Plovdiv)) {
			System.out.println("A Plovdiv packages employee is handling the package of client: " + client.getName());
			this.setState(new PreparingPackageState());			
		}
		else {
			super.handleClient(client);	
		}
	}
}
