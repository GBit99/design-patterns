package models;

import chain.CounterEmployee;
import state.PreparingPackageState;

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
			System.out.println("An abroad packages employee is handling the package of client: " + client.getName());
			this.setState(new PreparingPackageState());
		}
		else {
			super.handleClient(client);	
		}
	}
}
