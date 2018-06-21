
public class SmsObserver implements Observer{

	@Override
	public void notifyMe(String notify) {
		System.out.println("I'm SmsObserver and I note that "+notify);
		
	}

}
