import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ListCombineHelperTest {

    @Test
    public void encode_whenALongerB_thenMerged() {
        //arrange
        int[] a = {2, 4, 4, 10, 15, 15};
        int[] b = {3, 4, 5, 10};

        //act
        int[] result = ListCombineHelper.combine(a, b);

        //assert
        Assert.assertNotNull(result);
        int[] expectedResult = {2, 3, 4, 4, 4, 5, 10, 10, 15, 15};
        Assert.assertEquals(Arrays.toString(expectedResult), Arrays.toString(result));
    }

    @Test
    public void encode_whenBLongerA_thenMerged() {
        //arrange
        int[] a = {3, 4, 5, 10};
        int[] b = {2, 4, 4, 10, 15, 15};

        //act
        int[] result = ListCombineHelper.combine(a, b);

        //assert
        Assert.assertNotNull(result);
        int[] expectedResult = {2, 3, 4, 4, 4, 5, 10, 10, 15, 15};
        Assert.assertEquals(Arrays.toString(expectedResult), Arrays.toString(result));
    }

}
