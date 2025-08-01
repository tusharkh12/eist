package de.tum.in.ase.eist;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name;
    private List<Student> participants;

    public Course(String name) {
        this.name = name;
        this.participants=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfParticipants() {
        return getParticipants().size();
    }

    public void addParticipant(Student student) {
       participants.add(student);
    }

    public List<Student> getParticipants() {
        return new ArrayList<>(participants);

    }

}
