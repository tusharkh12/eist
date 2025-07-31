package de.tum.in.ase.eist;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CourseTest {


    @Test
    public void testGetCourseTitle() {
        String title = "ABC";
        Course c = new Course("ABC");
        c.setTitle("ABC");
        assertEquals(title, c.getTitle());
    }

    @Test
    public void testNoAttendees() {
        Course c = new Course("ABC");
        List<Student> s = new ArrayList<>();

        // s.clear();
        //int a=0;
        c.setAttendees(s);
        assertEquals(0, c.getNumberOfAttendees());


    }

    @Test
    public void testThreeAttendees() {
        Course c = new Course("ABC");
        List<Student> s = new ArrayList<>();
        Student s1 = new Student("Samuel", "Wen", "2001", "BusinessCS", "CS");
        Student s2 = new Student("Ruan", "Viljoen", "2001", "BusinessCS", "CS");
        Student s3 = new Student("Rohullah", "Niazi", "2001", "BusinessCS", "CS");
        s.add(s1);
        s.add(s2);
        s.add(s3);
        c.setAttendees(s);
        assertEquals(3, c.getNumberOfAttendees());
    }


    // TODO 1: Test getCourseTitle()

    // TODO 2: Test getNumberOfAttendees()

}
