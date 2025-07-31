package de.tum.in.ase.eist;

import java.util.Set;

public class VirtualTutorGroupMeeting extends TutorGroupMeeting {
	private String url;


    public VirtualTutorGroupMeeting(FixedDateTimeSlot timeSlot, TutorGroup tutorGroup, Skill skillToPractice,String url) {
        super(timeSlot, tutorGroup, skillToPractice);
        this.url = url;
    }

    public void practise(){
        getTutorGroup().getTutor().say("Thank you for joining using " + getUrl() + " today.");
        for (Student s:getTutorGroup().getStudents()) {
            s.learnSkill(getSkillToPractise());
        }getTutorGroup().getTutor().say("See you next time!");


    }

    public String getUrl() {
        return url;
    }
}
