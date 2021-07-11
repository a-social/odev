package hmwrk;

public class Main {
	public static void main(String[] args) {
		Lesson lesson1 = new Lesson("Yazýlým Geliþtirici Yetiþtirme Kampý(Java ve React)","2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.","Ücretsiz","Engin Demiroð",15);
		Lesson lesson2 = new Lesson("Yazýlým Geliþtirici Yetiþtirme Kampý(C# & ANGULAR)","2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.","Ücretsiz","Engin Demiroð",0);
		Lesson lesson3 = new Lesson("Programlamaya giriþ için temel kurs","PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin..","Ücretsiz","Engin Demiroð",0);
		Lesson lesson0 = new Lesson();
		Lesson[] lessons = {lesson1,lesson2,lesson3,lesson0};
		System.out.println("Kurslarýmýz ve detaylarýmýz;");
		for (Lesson lesson : lessons) {
			System.out.println("Kurs Adý: " + lesson.lessonname);
			System.out.println("Açýklama: " + lesson.description);
			System.out.println("Ücret: " + lesson.price);
			System.out.println("Öðretmen: " + lesson.teacher);
			System.out.println("ilerleme: %" + lesson.progress);
			}
		AddLessonManager addlessonmanager = new AddLessonManager();
		addlessonmanager.addLesson(lesson1);
		addlessonmanager.addLesson(lesson2);
		addlessonmanager.removeLesson(lesson1);
	
	}

}
