package hmwrk2;

public class StudentManager {
	public void chooseLesson(Insturactor insturactor , Student student) {
		System.out.println(insturactor.getLessonId() + " kodlu dersin sahibi " + insturactor.getUserName() + " ki�isi taraf�ndan verilen kursa " + student.getUserName() + " ki�isi kaydolmu�tur");
	}
	/*
	public void chooseLessonMultiple(Insturactor[] insturactors , Student [] students) {
		for(Insturactor insturactor : insturactors ) {
			System.out.println("selambbbbb");
			for (Student student : students) {
				System.out.println("selamaaaa");
				chooseLesson(insturactor, student);
			}
		}
		
	}*/
	

}
