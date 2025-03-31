package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv1 {

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(1801, 1801, 1801);
	    String string0 = nextDate0.run(10, 1801, 1801);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(3264, 3264, 3264);
	    String string0 = nextDate0.run(1, 4, 1812);
	    assertEquals("1/5/1812", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(1858, 1858, 1858);
	    String string0 = nextDate0.run(10, 10, 1858);
	    assertEquals("10/11/1858", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(1812, 1812, 1812);
	    String string0 = nextDate0.run(4, 4, 1812);
	    assertEquals("4/5/1812", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(3, 3, 3);
	    String string0 = nextDate0.run(3, 3, 1982);
	    assertEquals("3/4/1982", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(1829, 1829, 1829);
	    String string0 = nextDate0.run(8, 8, 1829);
	    assertEquals("8/9/1829", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(1812, 1812, 1812);
	    String string0 = nextDate0.run(1812, 31, (-2792));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(1812, 1812, 1812);
	    String string0 = nextDate0.run((-2792), 12, (-755));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 2, 622);
	    String string0 = nextDate0.run(1812, (-633), (-14));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(1814, 1814, 1814);
	    String string0 = nextDate0.run(5, 31, 1814);
	    assertEquals("6/1/1814", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive() throws Throwable {
	    NextDate nextDate0 = new NextDate(3239, 3239, 3239);
	    String string0 = nextDate0.run(6, 17, 1812);
	    assertEquals("6/18/1812", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 2, 622);
	    String string0 = nextDate0.run(2, 29, 1812);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate16() throws Throwable {
	    NextDate nextDate0 = new NextDate(1859, 1859, 1859);
	    String string0 = nextDate0.run(1, 1, 2214);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate15() throws Throwable {
	    NextDate nextDate0 = new NextDate(3, 3, 3);
	    String string0 = nextDate0.run(10, 1534, 2021);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate18() throws Throwable {
	    NextDate nextDate0 = new NextDate(1859, 1859, 1859);
	    String string0 = nextDate0.run(6, 30, 1859);
	    assertEquals("7/1/1859", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate17() throws Throwable {
	    NextDate nextDate0 = new NextDate(3, 3, 3);
	    String string0 = nextDate0.run(3, 10, 766);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate(1821, 1821, 1821);
	    String string0 = nextDate0.run(2, 28, 1821);
	    assertEquals("3/1/1821", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate(1812, 1812, 1812);
	    String string0 = nextDate0.run(2, 31, 1812);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(1812, 1812, 1812);
	    String string0 = nextDate0.run(7, 7, 1812);
	    assertEquals("7/7/1812", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(1812, 1812, 1812);
	    String string0 = nextDate0.run(2, 2, 1812);
	    assertEquals("2/3/1812", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 2, 622);
	    String string0 = nextDate0.run(12, 2, 1812);
	    assertEquals("12/3/1812", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(1823, 1823, 1823);
	    String string0 = nextDate0.run(11, 11, 1823);
	    assertEquals("11/12/1823", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate(1812, 1812, 1812);
	    String string0 = nextDate0.run(9, 31, 1812);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateAndCallsRun() throws Throwable {
	    NextDate nextDate0 = new NextDate(1812, 1812, 1812);
	    String string0 = nextDate0.run(12, 31, 1812);
	    assertEquals("12/32/1812", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate(1812, 1812, 1812);
	    String string0 = nextDate0.run(12, 31, 1812);
	    assertEquals("12/32/1812", string0);
	}

}