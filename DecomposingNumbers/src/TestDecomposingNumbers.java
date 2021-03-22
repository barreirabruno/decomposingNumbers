import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import javax.xml.transform.Result;

public class TestDecomposingNumbers {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("write-here"));
		
		int maxDigit = Integer.parseInt(bufferedReader.readLine().trim());
		
		List<Integer> result = DecomposeNumber.calculation(maxDigit);
		
		if(result != null) {
			for(int i=0; i < result.size(); i++) {
				if(i > 0) {
					bufferedWriter.newLine();
				}
				bufferedWriter.write(String.valueOf(result.get(i)));
			}
		} else {
			bufferedWriter.write("null");
		}
		
		bufferedReader.close();
		bufferedWriter.close();
	}
}
