package hmwrk2;

public class InsturactorManager {
	public void addLesson(Insturactor ınsturactor) {
		System.out.println(ınsturactor.getLessonId() + " ile kodlanmış olan ders " + ınsturactor.getUserName() + " kişisi tarafından eklenmiştir");
	}
	public void addLessonMultiple(Insturactor [] insturactors) {
		for (Insturactor insturactor : insturactors) {
			addLesson(insturactor);
		}
	}

}
