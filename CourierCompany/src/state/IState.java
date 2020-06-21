package state;

import models.Client;
import models.PackageType;

public interface IState {
	public boolean canHandleClient(Client client, PackageType packageType);
}
