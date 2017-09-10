import org.junit.Assert;

import static org.junit.Assert.*;

public class Assignment_6Test {
    @org.junit.Test
    public void getPentagonalNumber() throws Exception {

        int expectedNum = 35;
        Assert.assertEquals(expectedNum, Assignment_6.getPentagonalNumber(5));

    }
}