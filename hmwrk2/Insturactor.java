package hmwrk2;

public class Insturactor extends User {	
	private String biogrophy;
	private String lessonId;	
	public Insturactor() {		
	}	
	public Insturactor(String biogrophy , String lessonId) {
		super();
		this.biogrophy = biogrophy;
		this.lessonId = lessonId;		
	}
	public String getBiogrophy() {
		return this.biogrophy;
	}
	public void setBiogrophy(String Biogrophy) {
		this.biogrophy = Biogrophy;
	}
	public String getLessonId() {
		return this.lessonId;
	}
	public void setLessonId(String lessonId) {
		this.lessonId = lessonId;
	}
	

	
	
	
	
	
	
	

}
