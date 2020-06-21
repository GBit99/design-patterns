package state;

import models.Client;
import models.PackageType;

public class PreparingPackageState implements IState {

	@Override
	public boolean canHandleClient(Client client, PackageType packageType) {
		System.out.println("The employee is currently handling another client's package.");
		return false;
	}

}
