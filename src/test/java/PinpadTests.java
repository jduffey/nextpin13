import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PinpadTests {

    @Test
    public void pinpadShouldTakeAnArgumentAndCreateAnArrayTheSquareOfTheArgument(){
        Pinpad pinpad = new Pinpad(5);
        assertEquals(25,pinpad.getArrayLength());
    }

}
