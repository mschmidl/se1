import org.junit.Assert;
import org.junit.Test;

public class NumberToTextHelperTest {

    @Test
    public void numberToText_when0() {
        //assert
        Assert.assertEquals("***", NumberToTextHelper.numberToText(0));
    }

    @Test
    public void numberToText_when1() {
        //assert
        Assert.assertEquals("eins", NumberToTextHelper.numberToText(1));
    }

    @Test
    public void numberToText_when10() {
        //assert
        Assert.assertEquals("zehn", NumberToTextHelper.numberToText(10));
    }

    @Test
    public void numberToText_when12() {
        //assert
        Assert.assertEquals("zwölf", NumberToTextHelper.numberToText(12));
    }

    @Test
    public void numberToText_when16() {
        //assert
        Assert.assertEquals("sech zehn", NumberToTextHelper.numberToText(16));
    }

    @Test
    public void numberToText_when17() {
        //assert
        Assert.assertEquals("sieb zehn", NumberToTextHelper.numberToText(17));
    }

    @Test
    public void numberToText_when21() {
        //assert
        Assert.assertEquals("ein und zwanzig", NumberToTextHelper.numberToText(21));
    }

    @Test
    public void numberToText_when100() {
        //assert
        Assert.assertEquals("ein hundert", NumberToTextHelper.numberToText(100));
    }

    @Test
    public void numberToText_when401() {
        //assert
        Assert.assertEquals("vier hundert eins", NumberToTextHelper.numberToText(401));
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
