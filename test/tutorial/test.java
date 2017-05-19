package tutorial;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class test {

	@Test
	public void print1のテスト() {
		IntToEng ite = new IntToEng();
		String expected="two";
		String actual = ite.translateEng(2);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void print2のテスト() {
		IntToEng ite = new IntToEng();
		String expected="twenty one";
		String actual = ite.translateEng(21);
		assertThat(actual,is(expected));
	}

}
