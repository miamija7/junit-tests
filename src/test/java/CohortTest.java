import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CohortTest {
    Cohort cohort;
    Student student1;
    Student student2;
    List<Student> testList;

    @Before
    public void setUp(){
        student1 = new Student("Paul", 1234567);
        student1.addGrade(70);
        student1.addGrade(99);
        student1.addGrade(87);

        student2 = new Student("Jimmy", 9876543);
        student2.addGrade(88);
        student2.addGrade(80);
        student2.addGrade(56);

        testList = new ArrayList<>();
        testList.add(student1);
        testList.add(student2);

        cohort =  new Cohort();
        cohort.addStudent(student1);
        cohort.addStudent(student2);
    }

    @Test
    public void testIfCohortInstanceCanAddStudent(){
        assertEquals(cohort.getStudents().get(0), student1);
    }

    @Test
    public void testIfCohortCanListStudents(){
        assertEquals(testList, cohort.getStudents());
    }

    @Test
    public void testIfCohortCalculatesGradeAverage(){
        assertEquals(80.0, cohort.getCohortAverage(), 0);
    }

}
