import java.util.ArrayList;
import java.util.List;

public class Subject {
	  private List<Observer> observers = new ArrayList<>();

	    public void registerObserver(Observer observer){
	        observers.add(observer);
	    }

	    public void removeObservr(Observer observer){
	        observers.remove(observer);
	    }
	    public void notifyObserver(String notify) {
	    	for (Observer observer : observers) {
	            observer.notifyMe(notify);
	        }
	    }

}
