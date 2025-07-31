package de.tum.in.ase.eist;


import org.easymock.EasyMockExtension;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@ExtendWith(EasyMockExtension.class)
class DiscussionTest {
    @TestSubject
    private Discussion discussion = new Discussion();

    @Mock
    private Course courseMock;

    @Mock
    private Comment commentMock;


    DiscussionTest() {
    }

    @Test
    public void testComment() {
        int expectedSize = discussion.getNumberOfComments() + 1;
        expect(commentMock.save()).andReturn(true);
        replay(commentMock);
        discussion.addComment(commentMock);
        assertEquals(expectedSize, discussion.getNumberOfComments());
         verify(commentMock);

    }

    @Test
    public void testCommentIfSavingFails() {
        int expectedSize = discussion.getNumberOfComments();
        expect(commentMock.save()).andReturn(false);
        replay(commentMock);
        discussion.addComment(commentMock);
        assertEquals(expectedSize, discussion.getNumberOfComments());
        verify(commentMock);
    }


    @Test
    public void testStartCourseDiscussion() {
        Person person = new Student("Tushar", "Khandelwal", null, "Informatik", "Business");
        expect(courseMock.isDiscussionAllowed(person)).andReturn(true);
        replay(courseMock);

        //   discussion.startCourseDiscussion(courseMock, person, discussion.getTopic());
        assertTrue(discussion.startCourseDiscussion(courseMock, person, "abc"));
        assertEquals(courseMock, discussion.getCourse());
        assertEquals("abc", discussion.getTopic());
        verify(courseMock);


    }


    // TODO implement the tests

}
