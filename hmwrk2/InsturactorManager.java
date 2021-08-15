package hmwrk2;

public class InsturactorManager {
	public void addLesson(Insturactor ýnsturactor) {
		System.out.println(ýnsturactor.getLessonId() + " ile kodlanmýþ olan ders " + ýnsturactor.getUserName() + " kiþisi tarafýndan eklenmiþtir");
	}
	public void addLessonMultiple(Insturactor [] insturactors) {
		for (Insturactor insturactor : insturactors) {
			addLesson(insturactor);
		}
	}

}
