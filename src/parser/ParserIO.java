package parser;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;



public class ParserIO {

	public static void main(String[] args) throws IOException {
		FileReader in = null;
		FileWriter out = null;
		try {
			in = new FileReader("C:/Users/Brady/Desktop/MyClippings.txt");
			out = new FileWriter("C:/Users/Brady/Desktop/kindle.txt");
			BufferedReader br = new BufferedReader(in);

			int i = 0;
			/*
			 * br.readLine(); br.readLine();
			 */
			 
			while((i = br.read()) != -1) {
				char c = (char)i;	            
				if(c == '=' ) {
					/*
					 * for(int j = 0; j < 3; j++) { br.readLine(); }
					 */
					br.readLine();
					out.write(c);
				} 
				out.write(c);
			}
		} finally {
			if (out != null) {
				System.out.println("The text was parsed correctly");
			} else {
				System.out.println("The text wasn't parsed successfully");
			}
		}
		out.close();
		in.close();
	} // End of main
} // End of Class
