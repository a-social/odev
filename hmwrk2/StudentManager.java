package hmwrk2;

public class StudentManager {
	public void chooseLesson(Insturactor insturactor , Student student) {
		System.out.println(insturactor.getLessonId() + " kodlu dersin sahibi " + insturactor.getUserName() + " kiþisi tarafýndan verilen kursa " + student.getUserName() + " kiþisi kaydolmuþtur");
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
