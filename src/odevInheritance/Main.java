package odevInheritance;

public class Main {

	public static void main(String[] args) {

		Instructor instructor1=new Instructor( 1,"Engin","Demirog","123456","engin@gmail.com","java ,c#",2);
		Instructor instructor2=new Instructor( 2,"Yigit","Haciefendioglu","123456","kerem@gmail.com","amgular",1);
		
		Student student1=new Student(1,"Fatih","Kaya","Java + React Geliþtirme,C# + Angular Gelistirme","45545","fatih@gmail.com",1,90);
		Student student2=new Student(2,"Faruk","Tekbas","C# + Angular Geliþtirme","45545","faruk@gmail.com",2,90);
		Student student3=new Student(3,"Galip","Yildiz","Java + React Geliþtirme","45545","galip@gmail.com",3,90);
		
		Course course1 =new Course(1,"Java + React Gelistirme", 0 , "Engin Demirog");
		Course course2 =new Course(2,"C# + Angular Gelistirme", 0 , "Engin Demirog");
		Course course3 =new Course(3,"Programlamaya Giris", 0 , "Engin Demirog");
		
		UserManager userManager=new UserManager();
		StudentManager studentManager=new StudentManager();
		InstructorManager instructorManager=new InstructorManager();
		
		userManager.delete(instructor2);
		studentManager.add(student3);
		instructorManager.update(instructor1);
		instructorManager.addCourse(course2, instructor1);
		instructorManager.addCourse(course1, instructor1);
		instructorManager.addCourse(course3, instructor2);
	}

}
