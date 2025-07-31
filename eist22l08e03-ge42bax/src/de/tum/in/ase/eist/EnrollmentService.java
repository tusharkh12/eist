package de.tum.in.ase.eist;

public class EnrollmentService {

	public void enroll(Student student, Course course) {
		if (course.enroll(student)) {
			student.addCourse(course);
		}
	}

	public static void main(String[] args) {

	}
}
