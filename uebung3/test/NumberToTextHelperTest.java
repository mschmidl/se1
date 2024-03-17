import org.junit.Assert;
import org.junit.Test;

public class NumberToTextHelperTest {

    @Test
    public void numberToText_whenZero() {
        //assert
        Assert.assertEquals("***", NumberToTextHelper.numberToText(0));
    }

    @Test
    public void numberToText_whenOne() {
        //assert
        Assert.assertEquals("eins", NumberToTextHelper.numberToText(1));
    }

    @Test
    public void numberToText_whenTwelve() {
        //assert
        Assert.assertEquals("zwölf", NumberToTextHelper.numberToText(12));
    }

    @Test
    public void numberToText_when438() {
        //assert
        Assert.assertEquals("vier hundert acht und dreißig", NumberToTextHelper.numberToText(438));
    }

    @Test
    public void numberToText_when1000() {
        //assert
        Assert.assertEquals("***", NumberToTextHelper.numberToText(1000));
    }
}
