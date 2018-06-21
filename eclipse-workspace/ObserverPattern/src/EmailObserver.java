
public class EmailObserver implements Observer{

	@Override
	public void notifyMe(String notify) {
		System.out.println("I'm EmailObserver and I note that "+notify);
		
	}
	

}
