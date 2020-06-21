package chain;

import models.Client;
import models.PackageType;

public abstract class Employee {

	private Employee successor;
	
	public void HandleClient(Client client)
	{
		if(successor != null) {
			successor.HandleClient(client);
		}
		else
		{
			System.out.println("Unable to find the correct employee for the customer package: " + client.getPackageType().toString());
		}
	}
	
	protected boolean canHandleClient(Client client, PackageType packageType) {
		return client.getPackageType() == packageType;
	}
	
	public Employee getSuccessor() {return successor;}
	
	public void setSuccessor(Employee handler) {this.successor = handler;}
}
