package hmwrk;

public class Lesson {
		public Lesson() {
			this("none","none","none","none",0);
		}
		public Lesson(String lessonname,String description,String price,String teacher,int progress) {
			this.description = description;
			this.lessonname = lessonname;
			this.price = price;
			this.progress = progress;
			this.teacher = teacher;
			
		}
		String lessonname;
		String description;
		String price;
		String teacher;
		int progress;
}
