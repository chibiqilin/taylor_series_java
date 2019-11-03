package trigLib;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class mismatchTest {
    private final String input = "stringInput";

    @Test
    public void sinMismatch(){
        try {
            System.out.println("Try sin("+input+")");
            trigLib.sin(input);
            fail("Expected a TrigTypeMismatchException to be thrown");
        } catch (TrigTypeMismatchException ex){
            assertThat(ex.getMessage(), is("Error: Type Mismatch Exception"));
            System.out.println(ex.getMessage());
        }
    }
    @Test
    public void cosMismatch(){
        try {
            System.out.println("Try cos("+input+"):");
            trigLib.cos(input);
            fail("Expected a TrigTypeMismatchException to be thrown");
        } catch (TrigTypeMismatchException ex){
            assertThat(ex.getMessage(), is("Error: Type Mismatch Exception"));
            System.out.println(ex.getMessage());
        }
    }
    @Test
    public void tanMismatch(){
        try {
            System.out.println("Try tan("+input+"):");
            trigLib.tan(input);
            fail("Expected a TrigTypeMismatchException to be thrown");
        } catch (TrigTypeMismatchException ex){
            assertThat(ex.getMessage(), is("Error: Type Mismatch Exception"));
            System.out.println(ex.getMessage());
        }
    }
    @Test
    public void secMismatch(){
        try {
            System.out.println("Try sec("+input+"):");
            trigLib.sec(input);
            fail("Expected a TrigTypeMismatchException to be thrown");
        } catch (TrigTypeMismatchException ex){
            assertThat(ex.getMessage(), is("Error: Type Mismatch Exception"));
            System.out.println(ex.getMessage());
        }
    }
    @Test
    public void cscMismatch(){
        try {
            System.out.println("Try csc("+input+"):");
            trigLib.csc(input);
            fail("Expected a TrigTypeMismatchException to be thrown");
        } catch (TrigTypeMismatchException ex){
            assertThat(ex.getMessage(), is("Error: Type Mismatch Exception"));
            System.out.println(ex.getMessage());
        }
    }
    @Test
    public void cotMismatch(){
        try {
            System.out.println("Try cot("+input+"):");
            trigLib.cot(input);
            fail("Expected a TrigTypeMismatchException to be thrown");
        } catch (TrigTypeMismatchException ex){
            assertThat(ex.getMessage(), is("Error: Type Mismatch Exception"));
            System.out.println(ex.getMessage());
        }
    }
}
