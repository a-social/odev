package hmwrk;

public class AddLessonManager {
	public void addLesson(Lesson lesson) {
		System.out.println( "|"+lesson.lessonname+"|" + "Dersi Ba�ar�yla Programa Eklendi "   );
	}
	public void removeLesson(Lesson lesson) {
		System.out.println("|"+lesson.lessonname+"|" + "Dersi Ba�ar�yla Programdan kald�r�ld� " );
	};

}
