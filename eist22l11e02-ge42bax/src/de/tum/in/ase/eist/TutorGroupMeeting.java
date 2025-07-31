package de.tum.in.ase.eist;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public abstract  class TutorGroupMeeting {
    private static final int NUMBER_OF_HOMEWORK_PRESENTATIONS = 3;
    private final TimeSlot timeSlot;
    private final TutorGroup tutorGroup;
    private final Skill skillToPractice;


    protected TutorGroupMeeting(TimeSlot timeSlot, TutorGroup tutorGroup, Skill skillToPractice) {
        this.timeSlot = timeSlot;
        this.tutorGroup = tutorGroup;
        this.skillToPractice = skillToPractice;
    }

    public TutorGroup getTutorGroup() {
        return tutorGroup;
    }

    public Skill getSkillToPractice() {
        return skillToPractice;
    }

    public TimeSlot getTimeSlot() {
        return timeSlot;
    }
    public abstract void end();
    public abstract void hello();


    public  void practice() {


        Student tutor = getTutorGroup().getTutor();
        tutor.say("We start with the homework presentation");

        List<Student> homeworkPresentationCandidates = new ArrayList<>(getTutorGroup().getStudents());

        for (int i = 0; i < NUMBER_OF_HOMEWORK_PRESENTATIONS; i++) {
            if (homeworkPresentationCandidates.isEmpty()) {
                break;
            }
            int randomIndex = ThreadLocalRandom.current().nextInt(homeworkPresentationCandidates.size());
            Student randomStudent = homeworkPresentationCandidates.get(randomIndex);
            randomStudent.presentHomework();
            homeworkPresentationCandidates.remove(randomIndex);
        }

        tutor.say("Next is the group work");

        Skill skill = getSkillToPractice();
        skill.apply();
        for (Student student : getTutorGroup().getStudents()) {
            student.learnSkill(skill);
        }

        tutor.say("Let's have a look at the new homework");


    }

}


