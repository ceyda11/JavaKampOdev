package kampOdev;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"Yazılım Geliştirici Yetiştirme Kampı(JAVA+REACT)","%50 Tamamlandı","Engin Demiroğ");
		Course course2 = new Course(2,"Yazılım Geliştirici Yetiştirme Kampı(C#+ANGULAR)","%50 Tamamlandı","Engin Demiroğ");
		Course course3 = new Course(3,"Programlamaya Giriş için Temel Kurs","%50 Tamamlandı","Engin Demiroğ");
		
		Course[] courses = {course1, course2, course3};
		for(Course course: courses) {
			System.out.println("Kurs ID : " +course.id);
			System.out.println("Kurs Adı : " +course.courseName);
			System.out.println("Kurs Eğitmeni : " +course.intructorName);
		}

		System.out.println("Platformdaki Toplam Kurs Sayısı : " + courses.length);
		System.out.println(" ");
		
		Student student1 = new Student(1,"Ceyda","Önal");
		Student student2 = new Student(2,"Nurten","Tufan");
		Student student3 = new Student(3,"Merve","Diri");
		
		Student[] students = {student1, student2, student3};
		for(Student student: students) {
			System.out.println("Öğrenci ID : " + student.id);
			System.out.println("Öğrenci Ad-Soyadı : " + student.name + " " + student.surName);
		}
		
		System.out.println("Platformdaki Toplam Öğrenci Sayısı: " + students.length);
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
