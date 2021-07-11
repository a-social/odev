package hmwrk;

public class Main {
	public static void main(String[] args) {
		Lesson lesson1 = new Lesson("Yaz�l�m Geli�tirici Yeti�tirme Kamp�(Java ve React)","2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.","�cretsiz","Engin Demiro�",15);
		Lesson lesson2 = new Lesson("Yaz�l�m Geli�tirici Yeti�tirme Kamp�(C# & ANGULAR)","2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.","�cretsiz","Engin Demiro�",0);
		Lesson lesson3 = new Lesson("Programlamaya giri� i�in temel kurs","PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin..","�cretsiz","Engin Demiro�",0);
		Lesson lesson0 = new Lesson();
		Lesson[] lessons = {lesson1,lesson2,lesson3,lesson0};
		System.out.println("Kurslar�m�z ve detaylar�m�z;");
		for (Lesson lesson : lessons) {
			System.out.println("Kurs Ad�: " + lesson.lessonname);
			System.out.println("A��klama: " + lesson.description);
			System.out.println("�cret: " + lesson.price);
			System.out.println("��retmen: " + lesson.teacher);
			System.out.println("ilerleme: %" + lesson.progress);
			}
		AddLessonManager addlessonmanager = new AddLessonManager();
		addlessonmanager.addLesson(lesson1);
		addlessonmanager.addLesson(lesson2);
		addlessonmanager.removeLesson(lesson1);
	
	}

}
