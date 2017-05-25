package tutorial;
import java.util.Scanner;

public class IntToEng {
	
	 // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }
    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	if (n/10 == 0 && n!=0) {
    		return print1(n);
    	}else if (n/10 > 1 && n/10 < 10) {
    		return print2(n)+print1(n%10);
    	}else if (n/10 == 1 && n!=10) {
    		return print3(n);
    	}else if (n/100 >= 1 && n/100<=9 && (n%100<10 || n%100>=20)) {
    		return print4(n)+print2(n%100)+print1(n%10);  		
    	}else if (n/100 >= 1 && n/100<=9 && n%100<20 && n%100>10) {
    		return print4(n)+print3(n%100);
    	}else if (n==10) {
    		return "ten";
    	}else if (n==0) {
    		return "zero";
    	}
    	
    	return "";
    }

	static String print1 (int a) {
		String no = "";
		switch (a) {
			case 0: break;
			case 1: no = "one"; break;
			case 2: no = "two"; break;
			case 3: no = "three"; break;
			case 4: no = "four"; break;
			case 5: no = "five"; break;
			case 6: no = "six"; break;
			case 7: no = "seven"; break;
			case 8: no = "eight"; break;
			case 9: no = "nine"; break;
		}
		return no;
	}
	
	static String print2 (int a) {
		String no = "";
		switch (a/10) {
			case 0: break;
			case 1: break;
			case 2: no = "twenty"; break;
			case 3: no = "thirty"; break;
			case 4: no = "forty"; break;
			case 5: no = "fifty"; break;
			case 6: no = "sixty"; break;
			case 7: no = "seventy"; break;
			case 8: no = "eighty"; break;
			case 9: no = "ninety"; break;
		}
		return no;
	}
	//Teenの取り扱い
	static String print3 (int a) {
		String no = "";
		switch (a%10) {
		case 1: no = "eleven"; break;
		case 2: no = "twelve"; break;
		case 3: no = "thirteen"; break;
		case 4: no = "fourteen"; break;
		case 5: no = "fifteen"; break;
		case 6: no = "sixteen"; break;
		case 7: no = "seventeen"; break;
		case 8: no = "eighteen"; break;
		case 9: no = "nineteen"; break;
		}
		return no;
	}
	
	static String print4 (int a) {
		String no = "";
		switch (a/100) {
		case 1: no = "hundred"; break;
		case 2: no = "twohundred"; break;
		case 3: no = "threehundred"; break;
		case 4: no = "fourhundred"; break;
		case 5: no = "fivehundred"; break;
		case 6: no = "sixhundred"; break;
		case 7: no = "sevenhundred"; break;
		case 8: no = "eighthundred"; break;
		case 9: no = "ninehundred"; break;
		}
		
		return no;
	}

}