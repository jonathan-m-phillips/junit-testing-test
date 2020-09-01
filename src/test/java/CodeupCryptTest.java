import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class CodeupCryptTest {


    // The class should have a double static property called VERSION that is not initialized, but it could set any floating
    //    number to simulate we have a version number.

    @Test
    public void testIfVersionSet () {
        assertEquals(0.0, CodeupCrypt.VERSION, 0);
        CodeupCrypt.VERSION = 2.0;
        assertEquals(2.0, CodeupCrypt.VERSION, 0);
    }


    // It should have a method called hashPassword that takes in a string parameter and hashes it into a new string and return it.
    // The hashing procedure should be pretty simple, just replace the original String's vowels with numbers, these are the rules:
    //      Chars	Replace
    //      a or A	  4
    //      e or E	  3
    //      i or I	  1
    //      o or O	  0
    //      u or U	  9
    // ex. 'password => 'p4ssw0rd'

    @Test
    public void testHashPassword() {
        assertEquals("p4ssw0rd", CodeupCrypt.hashPassword("password"));
        assertEquals("j0n", CodeupCrypt.hashPassword("jon"));
        assertEquals("c4s3y", CodeupCrypt.hashPassword("c4sEy"));
        assertEquals("m00nl4nd1ng", CodeupCrypt.hashPassword("moonlAndIng"));
        assertEquals("bdhmt", CodeupCrypt.hashPassword("bdhmt"));
    }


    // It should have a method called checkPassword that compares two string parameters to make sure they match with a valid hash.

    @Test
    public void testCheckPassword() {
        assertTrue("check password", CodeupCrypt.checkPassword("password", "p4ssw0rd"));
        assertTrue("check password", CodeupCrypt.checkPassword("moonlAndIng", "m00nl4nd1ng"));
    }
}
