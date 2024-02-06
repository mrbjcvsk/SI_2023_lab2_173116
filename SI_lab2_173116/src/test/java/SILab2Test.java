import org.example.SILab2;
import org.example.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class SILab2Test {

        // test case when mandatory info is empty
        @Test(expected = RuntimeException.class)
        public void testFunction_NullUser() {
            SILab2.function(null, new ArrayList<>());
        }

        //test case when email or password are null
        @Test(expected = RuntimeException.class)
        public void testFunction_NullEmailOrPassword() {
            SILab2.function(new User("username", null, "email"), new ArrayList<>());
        }



    //test case for checking if there are special characters in the password
    @Test
    public void testFunction_NoSpecialCharacters() {
        List<User> allUsers = new ArrayList<>();
        assertFalse(SILab2.function(new User("username", "password", "email@gmail.com"), allUsers));
    }

    }
