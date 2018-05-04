import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTests {

    @Test
    public void userShouldBeAbleToSetAndGetAName() {
        User user = new User();
        user.setName("Sally");
        assertEquals("Sally", user.getName());
    }

    @Test
    public void userShouldBeAbleToSetAndGetABaseNumber(){
        User user = new User();
        user.setBaseNumber(5);
        assertEquals(5, user.getBaseNumber());
    }

}
