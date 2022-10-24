import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CohortTest {
    @Before
    public void setUp(){

    }

    @Test
    public void testIfCohortAddsStudent(){
        Cohort cohort =  new Cohort();
        Student student = new Student("Paul", 1234567);
    }

}
