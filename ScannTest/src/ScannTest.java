import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ScannTest {
	public static void main(String[] args) throws IOException {
		Scanner strIn = new Scanner(System.in);
		System.out.println("輸入一段文字 : ");
		String str = strIn.nextLine();

		/*
		 * String str = new String(); System.out.println("輸入一段文字 : ");
		 * BufferedReader buf = new BufferedReader(new
		 * InputStreamReader(System.in)); while((str+=buf.readLine())!=null){ ;
		 * }
		 */
		long time1, time2;
		time1 = System.currentTimeMillis();
		  String[] answer = Scan(str,1,3); 
		  for(String s:answer){
			  System.out.println(s); 
		  }
		 time2 = System.currentTimeMillis();
		 
		 System.out.println("Cost : " + (time2-time1) + "Millisecond");

		//boolean is = str.matches("[a-zA-Z]+");
		//System.out.println(is);

	}

	public static String[] Scan(String str, int min, int max) {

		//split " +|\\.|\\,|\\!|\\?|，|。|、|:|；|\"|\'|~|-|_|\\s+"
		String[] temp = str.split(" +|\\.|\\,|\\!|\\?|，|。|、|；|\"|\'|~|-|\\s+");
		String all = temp[0];
		ArrayList<String> tokens = new ArrayList<String>();

		for(int i = 1; i < temp.length; i++) {
			all = all + " " + temp[i];
		}
		
		System.out.println(all);
		
		int t = min;
		for (int j = 0; j < all.length(); j++, t++) {
			for (int k = t; k - t < max && k <= all.length(); k++) {
				tokens.add(all.substring(j, k));
			}

		}

		String[] re = new String[tokens.size()];
		int r = 0;
		for (String s : tokens) {
			re[r++] = s;
		}

		return re;
	}

}