package hmwrk;

public class AddLessonManager {
	public void addLesson(Lesson lesson) {
		System.out.println( "|"+lesson.lessonname+"|" + "Dersi Başarıyla Programa Eklendi "   );
	}
	public void removeLesson(Lesson lesson) {
		System.out.println("|"+lesson.lessonname+"|" + "Dersi Başarıyla Programdan kaldırıldı " );
	};

}
