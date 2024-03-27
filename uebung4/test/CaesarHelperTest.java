import org.junit.Assert;
import org.junit.Test;

import java.nio.CharBuffer;

public class CaesarHelperTest {

    @Test
    public void encode_whenNormalString_thenEncoded() {
        //arrange
        char startLetter = 'c';
        char[] message = "attack at dawn!".toCharArray();

        //act
        char[] encodedMessage = CaesarHelper.encode(message, startLetter);

        //assert
        Assert.assertNotNull(encodedMessage);
        char[] expectedResult = "cvvcem cv fcyp!".toCharArray();
        Assert.assertEquals(CharBuffer.wrap(expectedResult), CharBuffer.wrap(encodedMessage));
    }

}
