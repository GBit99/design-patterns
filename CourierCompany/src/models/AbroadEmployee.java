package models;

import chain.Employee;

public class AbroadEmployee extends Employee {

	public AbroadEmployee(Employee successor)
	{
		this.setSuccessor(successor);
	}
	
	@Override
	public void HandleClient(Client client) {
		
		if(this.canHandleClient(client, PackageType.Abroad)) {
			System.out.println("An abroad packages employee is handling the package of client: " + client.getName());
		}
		else {
			super.HandleClient(client);	
		}
	}
}
