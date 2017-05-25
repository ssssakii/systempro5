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
	
	@Test
	public void print3のテスト() {
		IntToEng ite = new IntToEng();
		String expected="eighteen";
		String actual = ite.translateEng(18);
		assertThat(actual,is(expected));
	}

	@Test
	public void printのテスト() {
		IntToEng ite = new IntToEng();
		String expected="zero";
		String actual = ite.translateEng(0);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void print4のテスト() {
		IntToEng ite = new IntToEng();
		String expected="hundred one";
		String actual = ite.translateEng(101);
		assertThat(actual,is(expected));
	}
}
