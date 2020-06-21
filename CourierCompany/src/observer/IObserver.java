package observer;

import chain.CounterEmployee;

public interface IObserver {
	public void update(CounterEmployee employee);
}
