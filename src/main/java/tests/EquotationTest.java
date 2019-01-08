package tests;

import appmanager.Equotation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EquotationTest {

    @Test
    public void test0() {
        Equotation e = new Equotation(1, 1, 1);
        Assert.assertEquals(e.rootNum(), 0);
    }

    @Test
    public void test1() {
        Equotation e = new Equotation(1, 2, 1);
        Assert.assertEquals(e.rootNum(), 1);
    }

    @Test
    public void test2() {
        Equotation e = new Equotation(1, 5, 6);
        Assert.assertEquals(e.rootNum(), 2);
    }
}
