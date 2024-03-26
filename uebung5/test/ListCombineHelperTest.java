import org.junit.Assert;
import org.junit.Test;

import java.nio.IntBuffer;

public class ListCombineHelperTest {

    @Test
    public void encode_whenNormalString_thenEncoded() {
        //arrange
        int[] a = {2, 4, 4, 10, 15, 15};
        int[] b = {3, 4, 5, 10};

        //act
        int[] result = ListCombineHelper.combine(a, b);

        //assert
        Assert.assertNotNull(result);
        int[] expectedResult = {2, 3, 4, 4, 4, 10, 15, 15};
        Assert.assertEquals(IntBuffer.wrap(expectedResult), IntBuffer.wrap(result));
    }

}
