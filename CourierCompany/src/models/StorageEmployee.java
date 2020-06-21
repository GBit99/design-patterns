package models;

import chain.CounterEmployee;
import observer.IObserver;
import state.PreparingPackageState;

public class StorageEmployee implements IObserver {

	@Override
	public void update(CounterEmployee employee) {
		if(employee.getState().getClass().getName() == PreparingPackageState.class.getName()) {
			employee.givePackageToStorageBoy();
		}	
	}
}
