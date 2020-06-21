package observer;

public interface IObservable {
	
	public void notifyObservers();
	
	public void attach(IObserver observer);
	
	public void detach(IObserver observer);
}
