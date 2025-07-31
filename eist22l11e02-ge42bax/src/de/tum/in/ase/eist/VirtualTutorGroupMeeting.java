package de.tum.in.ase.eist;

import java.net.URL;


public class VirtualTutorGroupMeeting extends TutorGroupMeeting {


    private final URL url;

    public VirtualTutorGroupMeeting(TimeSlot timeSlot, TutorGroup tutorGroup, Skill skillToPractice, URL url) {
        super(timeSlot, tutorGroup, skillToPractice);
        this.url = url;
    }


    public URL getUrl() {
        return url;
    }



    @Override
    public void hello() {
        Student tutor = getTutorGroup().getTutor();
        tutor.say("Welcome to the virtual tutor meeting");
        tutor.say("Thank you for joining using " + url.toString() + " today.");
        tutor.say("Please turn on your cameras");

    }

    @Override
    public void end() {
        Student tutor = getTutorGroup().getTutor();
        tutor.say("Thank you that you have participated using the " + url + " today.");
        tutor.say("See you next time!");


    }


    public void practice() {

        hello();

        super.practice();


        end();


    }
}
