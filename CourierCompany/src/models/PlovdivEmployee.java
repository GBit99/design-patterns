package models;

import chain.Employee;

public class PlovdivEmployee extends Employee {
	
	public PlovdivEmployee(Employee successor)
	{
		this.setSuccessor(successor);
	}
	
	@Override
	public void HandleClient(Client client) {
		
		if(this.canHandleClient(client, PackageType.Plovdiv)) {
			System.out.println("A Plovdiv packages employee is handling the package of client: " + client.getName());
		}
		else {
			super.HandleClient(client);	
		}
	}
}
