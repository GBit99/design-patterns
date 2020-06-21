package models;

import chain.CounterEmployee;
import state.PreparingPackageState;

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
			System.out.println("A country packages employee is handling the package of client: " + client.getName());
			this.setState(new PreparingPackageState());
		}
		else {
			super.handleClient(client);	
		}
	}
}
