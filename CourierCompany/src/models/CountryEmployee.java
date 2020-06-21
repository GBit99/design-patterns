package models;

import chain.Employee;

public class CountryEmployee extends Employee {

	public CountryEmployee(Employee successor)
	{
		this.setSuccessor(successor);
	}
	
	@Override
	public void HandleClient(Client client) {
		
		if(this.canHandleClient(client, PackageType.Country)) {
			System.out.println("A country packages employee is handling the package of client: " + client.getName());
		}
		else {
			super.HandleClient(client);	
		}
	}
}
