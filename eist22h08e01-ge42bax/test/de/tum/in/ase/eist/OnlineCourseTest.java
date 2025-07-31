package de.tum.in.ase.eist;

import org.junit.jupiter.api.*;


import java.net.MalformedURLException;


import static org.junit.jupiter.api.Assertions.*;

class OnlineCourseTest {

    // TODO 3: Test setOnlineCourseUrl()
    @Test
    public void testSetOnlineCourseUrlWithValidUrl() throws MalformedURLException {
        OnlineCourse onlineCourse = new OnlineCourse("EIST");
        onlineCourse.setUrl("http://host.com?param=");
        // String paramValue = "param\\with\\backslash";
        String yourURLStr = "http://host.com?param=";
        java.net.URL url = new java.net.URL(yourURLStr);
        assertEquals(url, onlineCourse.getUrl());

    }

    @Test
    public void testSetOnlineCourseUrlWithInvalidUrl() throws MalformedURLException  {
        OnlineCourse onlineCourse = new OnlineCourse("EIST");
        //onlineCourse.setUrl("aaa");
        // String paramValue = "param\\with\\backslash";
//        String yourURLStr = "www.course.com";
//        java.net.URL url = new java.net.URL(yourURLStr);
        assertThrows(MalformedURLException.class, () -> {
            onlineCourse.setUrl("aaa");
        });

    }
}
