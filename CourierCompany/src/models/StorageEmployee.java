package models;

import observer.IObserver;

public class StorageEmployee implements IObserver {

	@Override
	public void update() {
		System.out.println("Момчето носи пратка към склада");
	}

}
