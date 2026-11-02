package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StudentTest {
    Student s=new Student();
    @Test
    public void testFail(){
        assertEquals("Fail",s.checkResult(35));
    }
    @Test
    public void testPassAtBoundary(){
        assertEquals("Pass",s.checkResult(50));
    }
    @Test
    public void testPass(){
        assertEquals("Pass",s.checkResult(75));
    }
    @Test
    public void testFullMarks(){
        assertEquals("Pass",s.checkResult(100));
    }
}
