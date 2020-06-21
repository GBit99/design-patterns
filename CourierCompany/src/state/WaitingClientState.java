package state;

import models.Client;
import models.PackageType;

public class WaitingClientState implements IState {
	
	@Override
	public boolean canHandleClient(Client client, PackageType packageType) {
		return client.getPackageType() == packageType;
	}
}
