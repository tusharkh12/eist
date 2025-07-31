package de.tum.in.ase.eist;


import java.util.HashSet;
import java.util.Set;






public class Student extends Person {
	private String matriculationNumber;
    private int semester;
    private Set<String> knowledge;
    private StudyLevel studyLevel;
    private Set<Skill> skills  ;



    public Student(String name, int age, String tumId, String matriculationNumber, StudyLevel studyLevel, int semester) {
        super(name, age, tumId);
        this.matriculationNumber = matriculationNumber;
        this.semester = semester;
        this.studyLevel = studyLevel;
        this.knowledge = new HashSet<>();
        this.skills = new HashSet<>();

    }



    public StudyLevel getStudyLevel() {
        return studyLevel;
    }

    public String getMatriculationNumber() {
        return matriculationNumber;
    }

    public int getSemester() {
        return semester;
    }

    public Set<String> getKnowledge() {
        return knowledge;
    }



    public Set<Skill> getSkills() {
        return this.skills;
    }
//    public void addSkill(Skill skill) {
//        this.skills.add(skill);
//    }

    public void learnSkill(Skill skill) {
        this.skills.add(skill);

    }








    public void acquireKnowledge(String knowledge ){
        this.knowledge.add(knowledge);
    }



}
