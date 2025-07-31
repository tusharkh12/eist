package de.tum.in.ase.eist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TutorGroup {
	private String id;
    private WeeklyTimeSlot timeSlot;
    private Person tutor;
    private Set<Student> students;
    private List<TutorGroupMeeting> meetings;



    public TutorGroup(String id,WeeklyTimeSlot weeklyTimeSlot,Person person ){
        this.id = id;
        this.timeSlot = weeklyTimeSlot;
        this.tutor = person;
        this.students= new HashSet<>() ;
        this.meetings=new ArrayList<>();

    }

    public String getId() {
        return id;
    }

    public WeeklyTimeSlot getTimeSlot() {
        return timeSlot;
    }

    public Person getTutor() {
        return tutor;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public List<TutorGroupMeeting> getMeetings() {
        return meetings;
    }

    void addMeeting(TutorGroupMeeting tutorGroupMeeting){
        meetings.add(tutorGroupMeeting);
    }

    public void register(Student student){
        students.add(student);
    }


}
