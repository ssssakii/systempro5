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
    	if (n/10 == 0) {
    		print1(n);
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

}