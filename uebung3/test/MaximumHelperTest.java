import org.junit.Assert;
import org.junit.Test;

public class MaximumHelperTest {

    @Test
    public void findMaximum_when_then() {
        //arrange
        int a = 0;
        int b = -1;
        int c = 2;

        //act
        int maximum = MaximumHelper.findMaximum(a, b, c);

        //assert
        Assert.assertEquals(c, maximum);
    }
}
