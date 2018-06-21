
public class PhoneObserver implements Observer {

	@Override
	public void notifyMe(String notify) {
		System.out.println("I'm PhoneObserver and I note that "+notify);

	}

}
