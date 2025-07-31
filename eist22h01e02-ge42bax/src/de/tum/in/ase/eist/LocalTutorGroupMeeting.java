package de.tum.in.ase.eist;

public class LocalTutorGroupMeeting extends TutorGroupMeeting{
	private String room;


    public LocalTutorGroupMeeting(FixedDateTimeSlot timeSlot, TutorGroup tutorGroup, Skill skillToPractice,String room) {
        super(timeSlot, tutorGroup, skillToPractice);
        this.room = room;
    }

    public void practise(){
        getTutorGroup().getTutor().say("Thank you for coming to "+ getRoom()+" today.");
        for (Student s:getTutorGroup().getStudents()) {
            s.learnSkill(getSkillToPractise());

        }
        getTutorGroup().getTutor().say("See you next time!");

    }

    public String getRoom() {
        return room;
    }
}
