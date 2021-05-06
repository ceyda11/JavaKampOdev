package kampOdev;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp�(JAVA+REACT)","%50 Tamamland�","Engin Demiro�");
		Course course2 = new Course(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp�(C#+ANGULAR)","%50 Tamamland�","Engin Demiro�");
		Course course3 = new Course(3,"Programlamaya Giri� i�in Temel Kurs","%50 Tamamland�","Engin Demiro�");
		
		Course[] courses = {course1, course2, course3};
		for(Course course: courses) {
			System.out.println("Kurs ID : " +course.id);
			System.out.println("Kurs Ad� : " +course.courseName);
			System.out.println("Kurs E�itmeni : " +course.intructorName);
		}

		System.out.println("Platformdaki Toplam Kurs Say�s� : " + courses.length);
		System.out.println(" ");
		
		Student student1 = new Student(1,"Ceyda","�nal");
		Student student2 = new Student(2,"Nurten","Tufan");
		Student student3 = new Student(3,"Merve","Diri");
		
		Student[] students = {student1, student2, student3};
		for(Student student: students) {
			System.out.println("��renci ID : " + student.id);
			System.out.println("��renci Ad-Soyad� : " + student.name + " " + student.surName);
		}
		
		System.out.println("Platformdaki Toplam ��renci Say�s�: " + students.length);
		System.out.println(" ");
		
		StudentManager studentManager = new StudentManager();
		studentManager.register(student1);
		studentManager.register(student2);
		studentManager.register(student3);
		
		System.out.println(" ");
		
		CourseManager courseManager = new CourseManager();
		courseManager.skiToLesson(student1, course1);
		courseManager.skiToLesson(student2, course2);
		courseManager.skiToLesson(student3, course3);
		
	}
}
