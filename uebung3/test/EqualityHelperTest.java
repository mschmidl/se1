import org.junit.Assert;
import org.junit.Test;

public class EqualityHelperTest {

    @Test
    public void findCountOfSameNumbersTheory_when123() {
        //assert
        Assert.assertEquals(1, EqualityHelper.findCountOfSameNumbers(1,2,3));
    }

    @Test
    public void findCountOfSameNumbersTheory_when112() {
        //assert
        Assert.assertEquals(2, EqualityHelper.findCountOfSameNumbers(1, 1, 2));
    }

    @Test
    public void findCountOfSameNumbersTheory_when121() {
        //assert
        Assert.assertEquals(2, EqualityHelper.findCountOfSameNumbers(1, 2, 1));
    }

    @Test
    public void findCountOfSameNumbersTheory_when122() {
        //assert
        Assert.assertEquals(2, EqualityHelper.findCountOfSameNumbers(1, 2, 2));
    }

    @Test
    public void findCountOfSameNumbersTheory_when111() {
        //assert
        Assert.assertEquals(3, EqualityHelper.findCountOfSameNumbers(1, 1, 1));
    }
}
