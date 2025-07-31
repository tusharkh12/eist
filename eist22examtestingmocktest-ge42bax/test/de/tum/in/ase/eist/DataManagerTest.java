package de.tum.in.ase.eist;

import org.easymock.EasyMockExtension;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.nio.file.Path;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(EasyMockExtension.class)
class DataManagerTest {

    @TestSubject
    DataManager dataManager=new DataManager();

    @Mock
    private DataServer dataServerMock;


    @Test
    public void testCreateAtPath(){
        ClassTreeElement classTreeElement=new Package("aa") ;

        ClassTreeElement parent =new Package("aa") ;

        ClassTree classTree=new ClassTree(parent);
        String[] path=new String[]{"null","nulls"};
        expect(dataServerMock.create(classTreeElement,parent)).andReturn(true);
        replay(dataServerMock);
       // dataManager.createAtPath(classTree,classTreeElement,path);
        assertTrue(dataManager.createAtPath(classTree, classTreeElement, path));




    }
    // TODO: Test if the creation of a class tree element works as described in the
    // problem statement
}
