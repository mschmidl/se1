import org.junit.Assert;
import org.junit.Test;

public class MaximumHelperTest {

    @Test
    public void findMaximum_when_then1() {
        Assert.assertEquals(2, MaximumHelper.findMaximum(2, 1, -1));
    }

    @Test
    public void findMaximum_when_then2() {
        Assert.assertEquals(2, MaximumHelper.findMaximum(1, 2, -1));
    }

    @Test
    public void findMaximum_when_then3() {
        Assert.assertEquals(2, MaximumHelper.findMaximum(-1, 1, 2));
    }
}
