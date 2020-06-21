package models;

import chain.CounterEmployee;
import state.PreparingPackageState;
import state.WaitingClientState;

public class AbroadEmployee extends CounterEmployee {
	
	public AbroadEmployee() {
		super(null);
	};
	
	public AbroadEmployee(CounterEmployee successor) {
		super(successor);
	}

	@Override
	public void handleClient(Client client) {
		
		if(this.canHandleClient(client, PackageType.Abroad)) {
			this.setState(new PreparingPackageState());
			
			System.out.println("An abroad packages employee is handling the package of client: " + client.getName());
			
			this.setState(new WaitingClientState());
			
			System.out.println("The abroad employee is free to handle a new client package now.");
		}
		else {
			super.handleClient(client);	
		}
	}
}
