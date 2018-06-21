import java.io.File;


public class TimeCount{ 
	
	static int  first_file_count;
	Subject sub;
	
	public TimeCount() {
		
		EmailObserver ob=new EmailObserver();
		SmsObserver ob2=new SmsObserver();
		PhoneObserver ob3=new PhoneObserver();
		
		
		sub=new Subject();
		sub.registerObserver(ob);
		sub.registerObserver(ob2);
		sub.registerObserver(ob3);
		
		// get the initial file count
		first_file_count = count_file();
		
	}
	
	void folder_checker() {
		
		new java.util.Timer().schedule(
				new java.util.TimerTask() {
					@Override
					public void run() {
						int count=count_file();
						
						if(first_file_count==count) {
							System.out.println("Number of files: "+count);
						}else if((count-first_file_count)>0) {
							int x=(count-first_file_count);
							sub.notifyObserver(x+" file is added");
						}else if((count-first_file_count)<0) {
							int x=(count-first_file_count)*(-1);
							sub.notifyObserver(x+" file is removed");
						}
						first_file_count=count;
					}
				}
				
				,0,5000);
		
	}

 int count_file() {
	 File f = new File("C:\\Users\\UPULEE\\eclipse-workspace\\ObserverPattern\\Folder");
	    int count = 0;
	    for (File file : f.listFiles()) {
	            if (file.isFile()) {
	                    count++;
	            }
	           
	    }
	    return count;
 }
}
