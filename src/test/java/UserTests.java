import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTests {

    @Test
    public void userShouldBeAbleToSetAndGetAName() {
        User user = new User();
        user.setName("Sally");
        assertEquals("Sally", user.getName());
    }

}
