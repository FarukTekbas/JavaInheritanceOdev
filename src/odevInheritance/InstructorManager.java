package odevInheritance;

public class InstructorManager extends UserManager {

	public void addCourse(Course course,Instructor instructor) {
		System.out.println(instructor.getFirstName()+" adli egitmen "+course.getName()+ " adli kursu eklendi");
	}
}
