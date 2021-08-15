package hmwrk2;

public class Main {
	public static void main(String[] args) {
	
		Student eren = new Student();
		Student ece = new Student();
		Insturactor engin = new Insturactor();
		Insturactor sahan = new Insturactor();
		eren.setUserName("Eren");
		eren.setPosition("Ögrenci");
		ece.setUserName("Ece");
		ece.setPosition("Ögrenci");
		sahan.setPosition("Ogretmen");
		sahan.setUserName("Sahan");
		sahan.setLessonId("15624862");
		engin.setUserName("Engin");
		engin.setPosition("Ogretmen");
		engin.setLessonId("16524568");
		// öðrenci ekleme ve yazdýrma iþlemi
		User[] users = {engin,ece,eren,sahan};
		UserManager userManager = new UserManager();
		userManager.addMultiply(users);
		//kurs ekleme ve yazdýrma iþlemi
		InsturactorManager insturactorManager = new InsturactorManager();
		Insturactor[] insturactors = {sahan,engin};
		insturactorManager.addLessonMultiple(insturactors);
		StudentManager studentManager = new StudentManager();
		studentManager.chooseLesson(sahan, ece);
		studentManager.chooseLesson(engin, eren);
		/*
		StudentManager studentManager = new StudentManager();
		studentManager.chooseLessonMultiple(insturactors, students);
		Student[] students = {eren,ece};
		*/

		
		
		
		
		
		
		
	}
	// add Students , print their names and positions to console
	

}
