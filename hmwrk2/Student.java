package hmwrk2;

public class Student extends User {
	int progress ;
	public Student(){		
	} 
	public Student (int progress) {
		super();
		this.progress = progress;		
	}
	public int getProgress() {
		return this.progress;
	}
	public void  setProgress(int progress) {
		this.progress = progress;
	}
	

}
