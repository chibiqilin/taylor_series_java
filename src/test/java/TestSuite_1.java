import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import trigLib.*;

/**
 *
 */
public class TestSuite_1 {


    //Create output file
    @Before
    public void createOutput() {
        //TODO Generate output
    }

    //Close output file
    @After
    public void closeOutput() {
    }

    @Test
    public void Test1(){
        Double test = 90.0;
        Double result = trigLib.sin(test);
        assertNotNull(result);
    }

    @Test
    public void Test2(){
        Double test = 70.0;
        Double result = trigLib.sin(test);
        assertNotNull(result);
    }

}
