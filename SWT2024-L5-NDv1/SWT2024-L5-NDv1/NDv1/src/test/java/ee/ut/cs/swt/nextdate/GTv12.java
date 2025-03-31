package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv12 {

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(10, 10, 10);
	    String string0 = nextDate0.run(10, 10, 1807);
	    assertEquals("10/11/1807", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(4, 4, 4);
	    String string0 = nextDate0.run(4, 4, 1807);
	    assertEquals("4/5/1807", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(5, 5, 5);
	    String string0 = nextDate0.run(5, 5, 1807);
	    assertEquals("5/6/1807", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(8, 8, 8);
	    String string0 = nextDate0.run(8, 8, 1924);
	    assertEquals("8/9/1924", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(1878, 1878, 1878);
	    String string0 = nextDate0.run(2, 28, 1878);
	    assertEquals("3/1/1878", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(1932, 1932, 1932);
	    String string0 = nextDate0.run(2, 29, 1932);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(149, 149, 149);
	    String string0 = nextDate0.run((-1177), 31, 149);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(3, 3, 3);
	    String string0 = nextDate0.run(3, 31, 1828);
	    assertEquals("4/1/1828", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1, 1890);
	    assertEquals("1/2/1890", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate16() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 2021, 9);
	    String string0 = nextDate0.run(1, 3334, 2325);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate15() throws Throwable {
	    NextDate nextDate0 = new NextDate(0, 0, 0);
	    String string0 = nextDate0.run(1, 1801, 1801);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate18() throws Throwable {
	    NextDate nextDate0 = new NextDate(3094, 1, 1923);
	    String string0 = nextDate0.run(1923, 3094, 7);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate17() throws Throwable {
	    NextDate nextDate0 = new NextDate((-2257), (-784), (-2257));
	    String string0 = nextDate0.run(12, 12, 5);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate(1949, 1949, 1949);
	    String string0 = nextDate0.run(2, 30, 1949);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 2, 1807);
	    assertEquals("2/3/1807", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(3094, 1, 1923);
	    String string0 = nextDate0.run(7, 1, 1923);
	    assertEquals("7/1/1923", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(1894, 1894, 1894);
	    String string0 = nextDate0.run(12, 31, 1894);
	    assertEquals("1/1/1895", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 11, 11);
	    String string0 = nextDate0.run(11, 31, 1807);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 11, 11);
	    String string0 = nextDate0.run(11, 30, 1890);
	    assertEquals("12/1/1890", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate((-2257), (-784), (-2257));
	    String string0 = nextDate0.run(9, 5, 1855);
	    assertEquals("9/6/1855", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateAndCallsRun() throws Throwable {
	    NextDate nextDate0 = new NextDate(149, 149, 149);
	    String string0 = nextDate0.run(12, 7, 1921);
	    assertEquals("12/8/1921", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate(149, 149, 149);
	    String string0 = nextDate0.run(12, 7, 1921);
	    assertEquals("12/8/1921", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate((-2257), (-784), (-2257));
	    String string0 = nextDate0.run((-551), (-2257), (-784));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate((-2263), 2041, (-2263));
	    String string0 = nextDate0.run(11, 2041, 2021);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate((-814), (-814), (-814));
	    String string0 = nextDate0.run(3, 30, 1877);
	    assertEquals("3/31/1877", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 6, 6);
	    String string0 = nextDate0.run(6, 6, 1823);
	    assertEquals("6/7/1823", string0);
	}

}