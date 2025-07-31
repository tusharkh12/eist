package de.tum.in.ase.eist;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.*;

import org.easymock.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(EasyMockExtension.class)
class EnrollmentServiceTest {
    @TestSubject
    private EnrollmentService enrollmentService = new EnrollmentService();
    @Mock
    private Course courseMock;

    // TODO 1: setup EnrollmentServiceTest with all necessary attributes

    @Test
    void testEnrollStudentSuccessful() {
        Student student = new Student();
        int expectedSize = student.getCourses().size() + 1;
        expect(courseMock.enroll(student)).andReturn(true);
        replay(courseMock);
        enrollmentService.enroll(student, courseMock);
        assertEquals(expectedSize, student.getCourses().size());

    }

    @Test
    void testEnrollStudentFailure() {

//        Student student = new Student();
//        int expectedSize = student.getCourses().size() + 1;
//        expect(courseMock.enroll(student)).andReturn(true);
//        replay(courseMock);
//        // enrollmentService.enroll(student, courseMock);
//        //assertEquals(expectedSize, student.getCourses().size());
//        if (!courseMock.enroll(student)) {
//            assertFalse(courseMock.enroll(student));
//
//        }

    }

}
