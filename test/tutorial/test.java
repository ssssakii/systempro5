package tutorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	public void print1のテスト() {
		IntToEng ite = new IntToEng();
		String actual = ite.translateEng("two");
		System.out.println(actual);
	}

}
