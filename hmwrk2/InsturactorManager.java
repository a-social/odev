package hmwrk2;

public class InsturactorManager {
	public void addLesson(Insturactor �nsturactor) {
		System.out.println(�nsturactor.getLessonId() + " ile kodlanm�� olan ders " + �nsturactor.getUserName() + " ki�isi taraf�ndan eklenmi�tir");
	}
	public void addLessonMultiple(Insturactor [] insturactors) {
		for (Insturactor insturactor : insturactors) {
			addLesson(insturactor);
		}
	}

}
