package de.tum.in.ase.eist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class TutorGroup {

	private final String id;
	private final TimeSlot timeSlot;
	private final Student tutor;
	private final Set<Student> students;


	private static final int NUMBER_OF_HOMEWORK_PRESENTATIONS = 3;

	public TutorGroup(String id, TimeSlot timeSlot, Student tutor) {
		this.id = id;
		this.timeSlot = timeSlot;
		this.tutor = tutor;

		this.students = new HashSet<>();
	}

	public String getId() {
		return id;
	}

	public TimeSlot getTimeSlot() {
		return timeSlot;
	}

	public Student getTutor() {
		return tutor;
	}

	public Set<Student> getStudents() {
		return students;
	}
	
	public void register(Student student) {
		students.add(student);
	}



//	public void practice() {
//		Student tutor = getTutor();
//		tutor.say("Welcome to the tutor meeting");
//		tutor.say("Thank you for coming today.");
//		tutor.say("We start with the homework presentation");
//
//		List<Student> homeworkPresentationCandidates = new ArrayList<>(students);
//
//		for (int i = 0; i < NUMBER_OF_HOMEWORK_PRESENTATIONS; i++) {
//			if (homeworkPresentationCandidates.isEmpty()) {
//				break;
//			}
//			int randomIndex = ThreadLocalRandom.current().nextInt(homeworkPresentationCandidates.size());
//			Student randomStudent = homeworkPresentationCandidates.get(randomIndex);
//			randomStudent.presentHomework();
//			homeworkPresentationCandidates.remove(randomIndex);
//		}
//		tutor.say("Next is the group work");
//		Skill skill =get;
//		skill.apply();
//		for (Student student :students) {
//			student.learnSkill(skill);
//		}
//
//		tutor.say("Let's have a look at the new homework");
//
//
//
//		tutor.say("See you next time!");
//
//	}
}
