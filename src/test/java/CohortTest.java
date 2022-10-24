import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CohortTest {
    Cohort cohort;
    Student student;

    @Before
    public void setUp(){
        cohort =  new Cohort();
        student = new Student("Paul", 1234567);
    }

    @Test
    public void testIfCohortInstanceCanAddStudent(){
        cohort.addStudent(student);
        assertEquals(cohort.getStudents().get(0), student);
    }

    @Test
    public void testIfCohortCanListStudents(){
        List<Student> students = new ArrayList<>();
        students.add(student);
        cohort.addStudent(student);
        assertEquals(students, cohort.getStudents());
    }

    @Test
    public void testIfCohortCalculatesGradeAverage(){
        student.addGrade(70);
        student.addGrade(99);
        student.addGrade(87);

        Student student2 = new Student("Jimmy", 9876543);
        student2.addGrade(88);
        student2.addGrade(80);
        student2.addGrade(56);

        cohort.addStudent(student);
        cohort.addStudent(student2);

        assertEquals(80.0, cohort.getCohortAverage(), 0);
    }

}
