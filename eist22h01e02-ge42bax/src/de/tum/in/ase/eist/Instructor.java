package de.tum.in.ase.eist;

public class Instructor extends Person {

    public Instructor(String name, int age, String tumId) {
        super(name, age, tumId);
    }

    public void teach(String teach){
        super.say("Please learn \"" + teach + "\"");
    }



}
